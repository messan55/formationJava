package com.limpoto.webapps.heritageJPA.beans;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Client extends Personne {
	private String noCompteClient;
	private Date dateDernierAchat;
	private double solde;
	
	public Client(){this(0, "", "", "", null, 0.0);}
	public Client(int id, String nom, String prenom, String noCompteClient, Date dateDernierAchat, double solde) {
		super(id, nom, prenom);
		this.noCompteClient = noCompteClient;
		this.dateDernierAchat = dateDernierAchat;
		this.solde = solde;
	}

	public String getNoCompteClient() {return noCompteClient;}
	public void setNoCompteClient(String noCompteClient) {this.noCompteClient = noCompteClient;}
	
	@Temporal(TemporalType.DATE)
	public Date getDateDernierAchat() {return dateDernierAchat;}
	public void setDateDernierAchat(Date dateDernierAchat) {this.dateDernierAchat = dateDernierAchat;}
	
	public Double getSolde() {return solde;}
	public void setSolde(Double solde) {this.solde = solde;}
		
}
