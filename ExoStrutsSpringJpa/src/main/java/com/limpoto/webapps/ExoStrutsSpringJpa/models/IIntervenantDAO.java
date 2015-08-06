package com.limpoto.webapps.ExoStrutsSpringJpa.models;

import java.util.List;

import com.limpoto.webapps.ExoStrutsSpringJpa.metier.Intervenant;

public interface IIntervenantDAO {
	List<Intervenant> findAll();
	Intervenant findByID(int id);
}