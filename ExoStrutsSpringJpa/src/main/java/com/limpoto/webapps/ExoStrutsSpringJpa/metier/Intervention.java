package com.limpoto.webapps.ExoStrutsSpringJpa.metier;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Intervention {
	private int id;
	private Date datePlanification;
	private String memo;
	private String statuts;
	private Intervenant intervenant;
	private Materiel materiel;
	
	public Intervention(){this(0, null, "", "");}
	public Intervention(int id, Date datePlanification, String memo, String statuts) {
		super();
		this.id = id;
		this.datePlanification = datePlanification;
		this.memo = memo;
		this.statuts = statuts;
	}
	
	@Id @GeneratedValue
	public int getId() {return id;}
	public void setId(int id) {this.id = id;}
	
	@Temporal(TemporalType.DATE)
	public Date getDatePlanification() {return datePlanification;}
	public void setDatePlanification(Date datePlanification) {this.datePlanification = datePlanification;}
	
	public String getMemo() {return memo;}
	public void setMemo(String memo) {this.memo = memo;}
	
	public String getStatuts() {return statuts;}
	public void setStatuts(String statuts) {this.statuts = statuts;}
	
	@ManyToOne
	public Intervenant getIntervenant() {return intervenant;}
	public void setIntervenant(Intervenant intervenant) {this.intervenant = intervenant;}
	
	@ManyToOne
	public Materiel getMateriel() {return materiel;}
	public void setMateriel(Materiel materiel) {this.materiel = materiel;}
	
	/*
	 * Random rd = new Random();
	
	Intervenant it = new Intervenant(0, "dodzi", "dodzi_@mail.c");
	Materiel m = new Materiel(0, "000","materieln°");
	
	for (int i = 0; i < 10; i++) {
		em.persist(new Intervention(0, new Date(), "memo" + i, "status" + i, it, m));
	}
	*/
}
