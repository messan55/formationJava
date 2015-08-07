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
	
	private String item;
	private String action;
	
	public FormGenerator(String item, String action) {
		super();
		this.item = item;
		this.action = action;
		
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	@Override
	public void doTag() throws JspException, IOException {
		super.doTag();
		PageContext pc = (PageContext)getJspContext();
		JspWriter writer = pc.getOut();
		
		ServletRequest req = pc.getRequest();
		
		List data = (List)req.getAttribute(item);
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
