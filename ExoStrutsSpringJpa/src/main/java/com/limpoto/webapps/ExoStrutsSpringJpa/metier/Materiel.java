package com.limpoto.webapps.ExoStrutsSpringJpa.metier;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Materiel {
	public int id;
	public String noSerie;
	public String nom;
	public Set<Intervention> interventions;
	
	public Materiel(){this(0, "", "");}
	public Materiel(int id, String noSerie, String nom) {
		super();
		this.id = id;
		this.noSerie = noSerie;
		this.nom = nom;
	}
	
	@Id @GeneratedValue
	public int getId() {return id;}
	public void setId(int id) {this.id = id;}
	
	public String getNoSerie() {return noSerie;}
	public void setNoSerie(String noSerie) {this.noSerie = noSerie;}
	
	public String getNom() {return nom;}
	public void setNom(String nom) {this.nom = nom;}
	
	@OneToMany(mappedBy="materiel")
	public Set<Intervention> getInterventions() {
		if(interventions == null)
			interventions = new HashSet<Intervention>();
		return interventions;
	}
	public void setInterventions(Set<Intervention> interventions) {this.interventions = interventions;}
	
	
}
