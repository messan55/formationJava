package com.loncoto.webCustomTag.utils;

import java.io.IOException;

import javax.servlet.ServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class BaliseGenerator extends SimpleTagSupport{

	private String items;
	private String keyProperty;
	private String valueProperty;
	
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
	public String getKeyProperty() {
		return keyProperty;
	}
	public void setKeyProperty(String keyProperty) {
		this.keyProperty = keyProperty;
	}
	public String getValueProperty() {
		return valueProperty;
	}
	public void setValueProperty(String valueProperty) {
		this.valueProperty = valueProperty;
	}

	@Override
	public void doTag() throws JspException, IOException {
		super.doTag();
		// pagecontext a les méthodes pour accéder 
		// writer écrire dans l	a jsp 
		// et Request envoi dans la jsp
		PageContext pc = (PageContext)getJspContext();
		JspWriter writer = pc.getOut();
		
		ServletRequest req = pc.getRequest();
		
		req.getAttribute(items);
		writer.println("<label>");
		
		Object obj = new Object();
		Class cls = obj.getClass();
		
		String methodName = "get" + keyProperty.toUpperCase().charAt(0) + keyProperty.substring(1);
		System.out.println("getter key = " + methodName);
		
		writer.println("</label>");
	} 
	
	
}
