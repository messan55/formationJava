package com.loncoto.webCustomTag.utils;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import org.apache.catalina.authenticator.SavedRequest;


public class SelectGenerator extends SimpleTagSupport {
	
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
	
	public void doTag() throws JspException, IOException {
		super.doTag();
		PageContext pc = (PageContext)getJspContext();
		JspWriter writer = pc.getOut();
		
		ServletRequest req = pc.getRequest();
		
		List data = (List)req.getAttribute(items);
		writer.println("<select name='data'>");
		for (Object obj : data) {
			try {
				Class cls = obj.getClass();
				String methodName = "get" + keyProperty.toUpperCase().charAt(0) + keyProperty.substring(1);
				System.out.println("getter key = " + methodName);
			
				Method mkey = cls.getMethod(methodName);
				Object key = mkey.invoke(obj);
				
				methodName = "get" + valueProperty.toUpperCase().charAt(0) + valueProperty.substring(1);
				System.out.println("getter value = " + methodName);
			
				Method mvalue = cls.getMethod(methodName);
				Object value = mvalue.invoke(obj);
				
				writer.println("<option value='" + key + "'>" + value + "</option>");
				
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}
		writer.println("</select>");
	}
	
}
