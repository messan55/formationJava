package com.limpoto.webapps.SpringCamelotM.beans;

public class ChevalierTableRonde implements IChevalier {

	private String nom;
	private IQuete quete;
	private Cheval monture;
	
	public String getNom() {return nom;}
	public void setNom(String nom) {this.nom = nom;}

	@Override
	public void setQuete(IQuete quete) {
		this.quete = quete;
	}

	@Override
	public void partirEnQuete() {
		System.out.println("sir" + getNom() + " part en quete " + this.quete.getDescription() + " sur son fidele " + this.monture.getNom());
		
		if (this.quete.realiserQuete()) {
			System.out.println("sir" + getNom() + " est encore victorieux");
		}
		else 
			System.out.println("sir" + getNom() + " a été vaincu!");
	}
	public void setMonture(Cheval monture) {
		this.monture = monture;
	}
	

}
