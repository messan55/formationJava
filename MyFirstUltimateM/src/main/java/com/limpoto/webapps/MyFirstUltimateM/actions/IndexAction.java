package com.limpoto.webapps.MyFirstUltimateM.actions;

import java.util.Date;
import java.util.List;

import com.limpoto.webapps.MyFirstUltimateM.metier.Message;
import com.limpoto.webapps.MyFirstUltimateM.models.IMessageDAO;
import com.opensymphony.xwork2.ActionSupport;

public class IndexAction extends ActionSupport {
	
	
	private static final long serialVersionUID = 1L;
	
	private IMessageDAO messageDAO;
	private List<Message> messages;
	
	public IMessageDAO getMessageDAO() {return messageDAO;}
	public void setMessageDAO(IMessageDAO messageDAO) {
		System.out.println("injection du DAO dans indexAction par Spring");
		this.messageDAO = messageDAO;
	}
		
	public List<Message> getMessages() {return messages;}
	
	public String index() {
		messages = messageDAO.findAll();
		return SUCCESS;
	}

}
