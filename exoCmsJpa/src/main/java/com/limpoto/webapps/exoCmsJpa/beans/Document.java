package com.limpoto.webapps.exoCmsJpa.beans;

import java.sql.Date;

import javax.persistence.*;

@Entity
public class Document extends Content {
	private String titre;
	private String corps;
	
	public Document(){this(0, null, null, "", "", "");}
	public Document(int id, Date dateCreation, Date dateModification, String nom, String titre,
			String corps) {
		super(id, dateCreation, dateModification, nom);
		this.titre = titre;
		this.corps = corps;
	}
	
	public String getTitre() {return titre;}
	public void setTitre(String titre) {this.titre = titre;}
	
	public String getCorps() {return corps;}
	public void setCorps(String corps) {this.corps = corps;}
	
}
