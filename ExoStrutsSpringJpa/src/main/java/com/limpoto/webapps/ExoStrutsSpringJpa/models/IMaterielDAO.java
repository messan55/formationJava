package com.limpoto.webapps.ExoStrutsSpringJpa.models;

import java.util.List;

import com.limpoto.webapps.ExoStrutsSpringJpa.metier.Materiel;

public interface IMaterielDAO {
	List<Materiel> findAll();
	Materiel findByID(int id);
}