package com.limpoto.webapps.exoCmsJpa.beans;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Content {
	private int id;
	private Date dateCreation;
	private Date dateModification;
	private String nom;
	
	public Content(){this(0, null, "");}
	public Content(int id, Date dateCreation, String nom) {
		super();
		this.id = id;
		this.dateCreation = dateCreation;
		this.nom = nom;
	}
	
	@Id @GeneratedValue
	public int getId() {return id;}
	public void setId(int id) {this.id = id;}
	
	@Temporal(TemporalType.DATE)
	public Date getDateCreation() {return dateCreation;}
	public void setDateCreation(Date dateCreation) {this.dateCreation = dateCreation;}
	
	@Temporal(TemporalType.DATE)
	public Date getDateModification() {return dateModification;}
	public void setDateModification(Date dateModification) {this.dateModification = dateModification;}
	
	public String getNom() {return nom;}
	public void setNom(String nom) {this.nom = nom;}	
}
