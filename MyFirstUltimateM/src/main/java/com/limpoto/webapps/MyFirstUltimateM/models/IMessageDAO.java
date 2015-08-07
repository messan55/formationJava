package com.limpoto.webapps.MyFirstUltimateM.models;

import java.util.List;

import com.limpoto.webapps.MyFirstUltimateM.metier.Message;

public interface IMessageDAO {
	List<Message> findAll();
	Message findByID(int id);
	Message save(Message m);
	void delete();
}