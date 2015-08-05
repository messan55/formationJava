package com.limpoto.webapps.ExoStrutsSpringJpa.models;

import java.util.List;

import com.limpoto.webapps.ExoStrutsSpringJpa.metier.Intervention;

public interface IInterventionDAO {
	public List<Intervention> findAll();
	public Intervention findByID(int id);
	public Intervention save(Intervention m);
	public void delete(int id);
}