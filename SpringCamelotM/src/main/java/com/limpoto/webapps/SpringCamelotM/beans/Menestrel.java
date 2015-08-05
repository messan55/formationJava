package com.limpoto.webapps.SpringCamelotM.beans;

public class Menestrel {
	
	public void chanteAvant(IChevalier chevalier){
		System.out.println("tralalalala...sire " + chevalier.getNom() + " part en quete!");
	}
	
	public void chanteApres(IChevalier chevalier){
		System.out.println("oyez oyez, sire " + chevalier.getNom() + " revient de sa quete");
	}
}
