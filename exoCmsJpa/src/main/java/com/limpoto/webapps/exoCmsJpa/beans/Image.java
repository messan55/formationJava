package com.limpoto.webapps.exoCmsJpa.beans;

import java.sql.Date;

public class Image extends Content {
	private String filename;
	private String contentType;
	
	public Image(){this(0, null, null, "", "", "");}
	public Image(int id, Date dateCreation, Date dateModification, String nom, String filename, String contentType) {
		super(id, dateCreation, nom);
		this.filename = filename;
		this.contentType = contentType;
	}
	
	public String getFilename() {return filename;}
	public void setFilename(String filename) {this.filename = filename;}
	
	public String getContentType() {return contentType;}
	public void setContentType(String contentType) {this.contentType = contentType;}
	
}
