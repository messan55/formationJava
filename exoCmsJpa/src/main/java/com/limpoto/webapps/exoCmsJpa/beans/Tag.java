package com.limpoto.webapps.exoCmsJpa.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Tag {
	private int id;
	private String libelle;
	private Set<Content> contents;
	
	public Tag() {this(0, "");}
	public Tag(int id, String libelle){
		super();
		this.id = id;
		this.libelle = libelle;
	}
	
	@Id @GeneratedValue
	public int getId() {return id;}
	public void setId(int id) {this.id = id;}
	
	public String getLibelle() {return libelle;}
	public void setLibelle(String libelle) {this.libelle = libelle;}
	
	@ManyToMany
	public Set<Content> getContents() {
		if(contents == null)
			contents = new HashSet<Content>();
		return contents;
	}
	public void setContents(Set<Content> contents) {
		this.contents = contents;
	}
	
	
}
