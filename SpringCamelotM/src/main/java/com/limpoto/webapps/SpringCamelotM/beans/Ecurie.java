package com.limpoto.webapps.SpringCamelotM.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ecurie {

	private List<Cheval> chevaux;
	
	public Cheval fournirCheval(){
		System.out.println("appel de fournirCheval dans Ecurie");
		Random rd = new Random();
		return chevaux.get(rd.nextInt(chevaux.size()));
	}
	
	public Ecurie(){
		chevaux = new ArrayList<Cheval>();
		Cheval c = new Cheval();
		c.setNom("Tonnerre");
		chevaux.add(c);
		c = new Cheval();
		c.setNom("ARRR");
		chevaux.add(c);
		c = new Cheval();
		c.setNom("bourriquet");
		chevaux.add(c);
		c = new Cheval();
		c.setNom("jumper");
		chevaux.add(c);
	}
}
