package com.limpoto.webapps.SpringCamelotM.beans;

import java.util.Random;

public class QueteStandard implements IQuete{

	private String description;
	private double niveau;
	
	@Override
	public String getDescription() {return null;}
	public double getNiveau() {return niveau;}

	public void setNiveau(double niveau) {
		this.niveau = niveau;
	}

	@Override
	public boolean realiserQuete() {
		Random rd = new Random();
		if (rd.nextDouble() > niveau) {
			return true;
		}
		return false;
	}
	public QueteStandard(String description, double niveau) {
		super();
		this.description = description;
		this.niveau = niveau;
	}
	
	

}
