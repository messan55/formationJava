package com.limpoto.webapps.ExoStrutsSpringJpa.models;

import java.util.List;

import javax.persistence.*;

import org.springframework.transaction.annotation.Transactional;

import com.limpoto.webapps.ExoStrutsSpringJpa.metier.Intervention;

public class InterventionDAO implements IInterventionDAO {
	
	@PersistenceContext
	private EntityManager em;
	public void setEm(EntityManager em) {
		this.em = em;
	}

	@Transactional
	public List<Intervention> findAll() {
		return em.createQuery("from Intervention", Intervention.class).getResultList();
	}

	@Transactional
	public Intervention findByID(int id) {
		return em.find(Intervention.class, id);
	}

	@Transactional
	public Intervention save(Intervention m) {
		if (m.getId() > 0)
			m = em.merge(m);
		else
			em.persist(m); 
		return m;
	}

	@Transactional
	public void delete(int id) {
		Intervention msg = em.find(Intervention.class, id);
		if (msg != null)
			em.remove(msg);
	}

}
