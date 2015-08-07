package com.limpoto.webapps.secondJSF.managedBeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class IndexBean 
{
	private String message;

	public IndexBean() {
		message = "bonjour monde!";
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String hello() {
		message="pleased to meet you!";
		return "index.xhtml";
	}
	
}
