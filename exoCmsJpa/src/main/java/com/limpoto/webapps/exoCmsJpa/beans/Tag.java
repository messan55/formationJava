package com.limpoto.webapps.exoCmsJpa.beans;

public class Tag {
	private int id;
	private String libelle;
	
	public Tag() {this(0, "");}
	public Tag(int id, String libelle){
		this.id = id;
		this.libelle = libelle;
	}
	
}
