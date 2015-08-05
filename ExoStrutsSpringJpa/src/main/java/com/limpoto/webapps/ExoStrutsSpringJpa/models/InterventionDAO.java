package com.limpoto.webapps.ExoStrutsSpringJpa.models;

import java.util.List;

import javax.persistence.*;

import com.limpoto.webapps.ExoStrutsSpringJpa.metier.Intervention;

public class InterventionDAO implements IInterventionDAO {
	
	@PersistenceContext
	private EntityManager em;
	public void setEm(EntityManager em) {
		this.em = em;
	}

	@Override
	public List<Intervention> findAll() {
		return em.createQuery("from Message", Intervention.class).getResultList();
	}

	@Override
	public Intervention findByID(int id) {
		return em.find(Intervention.class, id);
	}

	@Override
	public Intervention save(Intervention m) {
		if (m.getId() > 0)
			m = em.merge(m);
		else
			em.persist(m); 
		return m;
	}

	@Override
	public void delete(int id) {
		Intervention msg = em.find(Intervention.class, id);
		if (msg != null)
			em.remove(msg);
	}

}
