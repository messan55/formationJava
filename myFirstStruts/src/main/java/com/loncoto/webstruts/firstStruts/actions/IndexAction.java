package com.loncoto.webstruts.firstStruts.actions;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class IndexAction extends ActionSupport {
	
	private String nom;
	private Integer age;
	
	private static final long serialVersionUID = 1L;

	private String message;
	
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String index() {
		message = "bonjour depuis index le " + new Date();
		return SUCCESS;
	}
	
	public String Hello(){
		if (age < 12) {
			message="trop jeune revenez plus tard!";
			return ERROR;
		}
		message="bienvenue!";
		return SUCCESS;
	}

}
