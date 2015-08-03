package com.limpoto.webapps.exoCmsJpa.jpa;

import java.util.*;

import javax.persistence.*;

import com.limpoto.webapps.exoCmsJpa.beans.Content;
import com.limpoto.webapps.exoCmsJpa.beans.Document;
import com.limpoto.webapps.exoCmsJpa.beans.Image;

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

        input.nextLine();
		System.out.println("--------------------------------------");		

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
		
		for (int i = 0; i < 10; i++) {
//			em.persist(new Image(0, new Date(), new Date(), "nom" + i, "" + i, "" + i));
//			em.persist(new Document(0, new Date(), new Date(), "content_" + i, "titre" + i, "corps" + i));
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
		
		
		//----------------------------------------------------
		tx.commit();
		em.close();
	}

}
