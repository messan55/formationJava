package com.limpoto.webapps.StrustFormationFormMessan.actions;

import com.opensymphony.xwork2.ActionSupport;

public class FormAction extends ActionSupport {

	private String libelle;
	private double prix;
	private double poids;

	public String getLibelle() {return libelle;}
	public void setLibelle(String libelle) {this.libelle = libelle;}
	public double getPrix() {return prix;}
	public void setPrix(double prix) {this.prix = prix;}
	public double getPoids() {return poids;}
	public void setPoids(double poids) {this.poids = poids;}

	public String index(){
		return SUCCESS;
	}
	
	//réception du formulaire
	public String enregistrer(){
		System.out.println("recu un article de libelle " + getLibelle() + " prix = " + getPrix() + " poids = " + getPoids());
		return SUCCESS;
	}
}
