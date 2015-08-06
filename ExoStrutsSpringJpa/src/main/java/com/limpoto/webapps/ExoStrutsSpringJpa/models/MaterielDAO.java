package com.limpoto.webapps.ExoStrutsSpringJpa.models;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.limpoto.webapps.ExoStrutsSpringJpa.metier.Materiel;

public class MaterielDAO implements IMaterielDAO {
	
	@PersistenceContext
	private EntityManager em;
	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	@Transactional
	public List<Materiel> findAll() {
		return em.createQuery("from Materiel", Materiel.class).getResultList();
	}

	@Transactional
	public Materiel findByID(int id) {
		return em.find(Materiel.class, id);
	}

}
