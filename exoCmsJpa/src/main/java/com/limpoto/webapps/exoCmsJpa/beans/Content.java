package com.limpoto.webapps.exoCmsJpa.beans;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Content {
	private int id;
	private Date dateCreation;
	private Date dateModification;
	private String nom;
	private Set<Tag> tags;
	
	public Content(){this(0, null, null, "");}
	public Content(int id, Date dateCreation, Date dateModification, String nom) {
		super();
		this.id = id;
		this.dateCreation = dateCreation;
		this.dateModification = dateModification;
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
	
	@ManyToMany(mappedBy="contents")
	public Set<Tag> getTags() {
		if(tags == null)
			tags = new HashSet<Tag>();
		return tags;
	}
	public void setTags(Set<Tag> tags) {this.tags = tags;}
	
}
