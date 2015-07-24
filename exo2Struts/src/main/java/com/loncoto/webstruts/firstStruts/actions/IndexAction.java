package com.loncoto.webstruts.firstStruts.actions;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class IndexAction extends ActionSupport {
	
	
	private static final long serialVersionUID = 1L;

	/*
	 * accesseurs
	 * 
	 */
	
	private String message;
	private String nom;
	private int motDePasse;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(int motDePasse) {
		this.motDePasse = motDePasse;
	}
	/*
	 * actions
	 * 
	 */

	
	public String login() {
		return "";
		
	}
	
	

}
