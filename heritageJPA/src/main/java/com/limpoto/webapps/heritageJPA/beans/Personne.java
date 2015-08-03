package com.limpoto.webapps.heritageJPA.beans;

import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Personne {
	private int id;
	private String nom;
	private String prenom;
	
	public Personne(){this(0, "", "");}
	public Personne(int id, String nom, String prenom) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	@Id @GeneratedValue
	public int getId() {return id;}
	public void setId(int id) {this.id = id;}
	
	public String getNom() {return nom;}
	public void setNom(String nom) {this.nom = nom;}
	
	public String getPrenom() {return prenom;}
	public void setPrenom(String prenom) {this.prenom = prenom;}

}
