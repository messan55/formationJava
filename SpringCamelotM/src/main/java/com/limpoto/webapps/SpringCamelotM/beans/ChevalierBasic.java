package com.limpoto.webapps.SpringCamelotM.beans;

public class ChevalierBasic implements IChevalier {

	private String nom;
	private IQuete quete;
	
	@Override
	public String getNom() {return nom;}
	@Override
	public void setNom(String nom) {this.nom = nom;}

	@Override
	public void setQuete(IQuete quete) {
		this.quete = quete;
	}

	@Override
	public void partirEnQuete() {
		System.out.println("je pars en quete :" + getNom() + " -> " + quete.getDescription());
		if (quete.realiserQuete()) 
			System.out.println("victoire a moi!");
		else
			System.out.println("defaite amère!");
	}

}
