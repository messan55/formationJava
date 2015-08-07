package com.limpoto.webapps.MyFirstUltimateM.models;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.limpoto.webapps.MyFirstUltimateM.metier.Message;

public class MessageDAO implements IMessageDAO {

	@PersistenceContext
	private EntityManager em;
		
	public void setEm(EntityManager em) {
		this.em = em;
	}

	@Transactional
	public List<Message> findAll() {
		return em.createQuery("from message", Message.class).getResultList();
	}

	@Transactional
	public Message findByID(int id) {
		return em.find(Message.class, id);
	}

	@Transactional
	public Message save(Message m) {
		if(m.getId() > 0)
			m = em.merge(m);
		else
			em.merge(m);
		return m;
	}

	@Transactional
	public void delete() {
		
	}

}
