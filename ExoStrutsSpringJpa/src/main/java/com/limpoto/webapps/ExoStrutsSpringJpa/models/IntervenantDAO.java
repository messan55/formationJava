package com.limpoto.webapps.ExoStrutsSpringJpa.models;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.limpoto.webapps.ExoStrutsSpringJpa.metier.Intervenant;
import com.limpoto.webapps.ExoStrutsSpringJpa.metier.Intervention;

public class IntervenantDAO implements IIntervenantDAO {

	@PersistenceContext
	private EntityManager em;
	public void setEm(EntityManager em) {
		this.em = em;
	}
	
	@Transactional
	public List<Intervenant> findAll() {
		return em.createQuery("from Intervenant", Intervenant.class).getResultList();
	}

	@Transactional
	public Intervenant findByID(int id) {
		return em.find(Intervenant.class, id);
	}

}
