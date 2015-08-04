package com.limpoto.webapps.SpringCamelotM.beans;
import java.util.Random;

import com.limpoto.webapps.SpringCamelotM.beans.IQuete;


public class queteEpique implements IQuete {

	private String description;
	private double niveau;
	
	public queteEpique(String description, double niveau) {
		super();
		this.description = description;
		this.niveau = niveau;
	}

	@Override
	public String getDescription() {
		return null;
	}

	@Override
	public boolean realiserQuete() {
		Random rd = new Random();
		if(rd.nextDouble() > niveau)
			if(rd.nextDouble() > niveau)
				return true;
		return false;
	}

}
