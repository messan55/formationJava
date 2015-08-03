package com.limpoto.webapps.heritageJPA.jpa;

import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.limpoto.webapps.heritageJPA.beans.Client;
import com.limpoto.webapps.heritageJPA.beans.Employe;
import com.limpoto.webapps.heritageJPA.beans.Personne;

public class JpaTest {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("testHibernate");
        Scanner input = new Scanner(System.in);

        input.nextLine();
        System.out.println("--------------------------------------");
		test1(emf);
		
		input.nextLine();
        System.out.println("--------------------------------------");
		test2(emf);

	    emf.close();
		System.out.println("done...");
	}




	public static void test1(EntityManagerFactory emf)
	{
		// on recupere un entityManager
		EntityManager em = emf.createEntityManager();
		// et une transaction
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		//----------------------------------------------------
		
		Random rd = new Random();
		for (int i = 0; i <= 10; i++) {
			em.persist(new Personne(0, "doe" + i, "john" + i));
			em.persist(new Employe(0, "eponge" + i, "bob" + i, "bob@epon.com", rd.nextDouble() * 1000.0 + 1500.0, new Date()));
			em.persist(new Client(0, "duffy" + i, "patrick" + i, "cl000" + i, new Date(), rd.nextDouble() * 500.0 + 50.0));
		}
			
		//----------------------------------------------------
		tx.commit();
		em.close();
	}


	public static void test2(EntityManagerFactory emf)
	{
		// on recupere un entityManager
		EntityManager em = emf.createEntityManager();
		// et une transaction
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		//----------------------------------------------------
		
		List<Client> clients = em.createQuery("from Client", Client.class).getResultList();
		
		for (Client c : clients) {
			System.out.println("client : " + c.getNom() + " - " + c.getSolde());
		}
		System.out.println("-------------------------------------");
		
		List<Personne> personnes = em.createQuery("from Personne", Personne.class).getResultList();
		
		for (Personne p : personnes) {
			System.out.println("personne : " + p.getNom() + " - " + p.getPrenom());
		}
		
		//----------------------------------------------------
		tx.commit();
		em.close();
	}

}