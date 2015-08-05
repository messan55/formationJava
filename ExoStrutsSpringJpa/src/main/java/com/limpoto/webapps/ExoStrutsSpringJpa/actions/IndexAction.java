package com.limpoto.webapps.ExoStrutsSpringJpa.actions;

import java.util.Date;
import java.util.List;

import com.limpoto.webapps.ExoStrutsSpringJpa.metier.Intervenant;
import com.limpoto.webapps.ExoStrutsSpringJpa.metier.Intervention;
import com.limpoto.webapps.ExoStrutsSpringJpa.metier.Materiel;
import com.limpoto.webapps.ExoStrutsSpringJpa.models.IInterventionDAO;
import com.opensymphony.xwork2.ActionSupport;

public class IndexAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	
	private IInterventionDAO intervationDAO;
	private List<Intervention> interventions;
	public int interventionId;
	public Date interventionDatePlanification;
	public String interventionMemo;
	public String InterventionStatuts;
	public Intervenant interventionIntervenant;
	public Materiel interventionMateriel;
	
	public IInterventionDAO getIntervationDAO() {return intervationDAO;}
	public void setIntervationDAO(IInterventionDAO intervationDAO) {this.intervationDAO = intervationDAO;}
	
	public List<Intervention> getInterventions() {return interventions;}
	public void setInterventions(List<Intervention> interventions) {this.interventions = interventions;}
	
	public int getInterventionId() {return interventionId;}
	public void setInterventionId(int interventionId) {this.interventionId = interventionId;}
	
	public Date getInterventionDatePlanification() {return interventionDatePlanification;}
	public void setInterventionDatePlanification(Date interventionDatePlanification) {this.interventionDatePlanification = interventionDatePlanification;}
	
	public String getInterventionMemo() {return interventionMemo;}
	public void setInterventionMemo(String interventionMemo) {this.interventionMemo = interventionMemo;}
	
	public String getInterventionStatuts() {return InterventionStatuts;}
	public void setInterventionStatuts(String interventionStatuts) {InterventionStatuts = interventionStatuts;}
	
	public String index() {
		interventions = intervationDAO.findAll();
		return SUCCESS;
	}
	
	public String edit(){
		Intervention i = intervationDAO.findByID(getInterventionId());
		if (i == null)
			return "notfound";
		setInterventionDatePlanification(i.getDatePlanification());
		setInterventionMemo(i.getMemo());
		setInterventionStatuts(i.getStatuts());
		return SUCCESS;
	}

	public String save(){
		Intervention i = new Intervention();
		i.setId(getInterventionId());
		i.setDatePlanification(getInterventionDatePlanification());
		i.setMemo(getInterventionMemo());
		i.setStatuts(getInterventionStatuts());
		return SUCCESS;
	}
}
