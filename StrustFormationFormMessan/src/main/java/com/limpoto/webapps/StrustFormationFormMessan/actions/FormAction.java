package com.limpoto.webapps.StrustFormationFormMessan.actions;

import java.util.ArrayList;
import java.util.List;

import com.limpoto.webapps.StrustFormationFormMessan.beans.Article;
import com.opensymphony.xwork2.ActionSupport;

public class FormAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String libelle;
	private double prix;
	private double poids;
	
	private List<Article> articles;

	public List<Article> getArticles() {
		return articles;
	}
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
	
	public String liste(){
		articles = new ArrayList<Article>();
		articles.add(new Article(1, "table tek", 15.5, 2.5));
		articles.add(new Article(2, "table bleu", 25.5, 25));
		articles.add(new Article(3, "table rouge", 35.5, 3.5));
		return SUCCESS;
	}
	
}
