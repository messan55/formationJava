package com.limpoto.webapps.SpringCamelotM.beans;

public interface IChevalier {
	String getNom();
	void setNom(String nom);
	void setQuete(IQuete quete);
	void partirEnQuete();
}
