package com.loncoto.webCustomTag.utils;

import java.io.IOException;
import java.lang.reflect.Field;
import java.text.Annotation;
import java.util.List;

import javax.servlet.ServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class FormGenerator extends SimpleTagSupport{	
	
	private String items;
	private String keyProperty;
	private String valueProperty;
	
	public FormGenerator(String items, String keyProperty, String valueProperty) {
		super();
		this.items = items;
		this.keyProperty = keyProperty;
		this.valueProperty = valueProperty;
		
	}
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
		PageContext pc = (PageContext)getJspContext();
		JspWriter writer = pc.getOut();
		
		ServletRequest req = pc.getRequest();
		
		List data = (List)req.getAttribute(items);
		writer.println("<form action='IndexServlet' method='post'>");
		
		for (Object object : data) {
			Class cls = object.getClass();
			String field = null;
			try {
				Field f = cls.getDeclaredField(field);
				Object key = f.get(object);
				writer.println("nom article : <input type='\"text\"' name='" + key + "' />");
			} catch (NoSuchFieldException e) {
				e.printStackTrace();
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
			
		}
		writer.println("</form>");
	}
	
	
}
