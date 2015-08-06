package com.limpoto.webapps.ExoStrutsSpringJpa.actions;

import java.util.Date;
import java.util.List;

import com.limpoto.webapps.ExoStrutsSpringJpa.metier.Intervenant;
import com.limpoto.webapps.ExoStrutsSpringJpa.metier.Intervention;
import com.limpoto.webapps.ExoStrutsSpringJpa.metier.Materiel;
import com.limpoto.webapps.ExoStrutsSpringJpa.models.IIntervenantDAO;
import com.limpoto.webapps.ExoStrutsSpringJpa.models.IInterventionDAO;
import com.limpoto.webapps.ExoStrutsSpringJpa.models.IMaterielDAO;
import com.opensymphony.xwork2.ActionSupport;

public class IndexAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	
	private IInterventionDAO interventionDAO;
	private IIntervenantDAO intervenantDAO;
	private IMaterielDAO materielDAO;
	private List<Intervention> interventions;
	private List<Materiel> materiels;
	private List<Intervenant> intervenants;
	public int interventionId;
	public Date interventionDatePlanification;
	public String interventionMemo;
	public String interventionStatuts;
	private int interventionIntervenantID;
	private int interventionMaterielID;

	public void setInterventionDAO(IInterventionDAO interventionDAO) {this.interventionDAO = interventionDAO;}
	public void setIntervenantDAO(IIntervenantDAO intervenantDAO) {this.intervenantDAO = intervenantDAO;}
	public void setMaterielDAO(IMaterielDAO materielDAO) {this.materielDAO = materielDAO;}

	public int getInterventionId() {return interventionId;}
	public void setInterventionId(int interventionId) {this.interventionId = interventionId;}
	
	public Date getInterventionDatePlanification() {return interventionDatePlanification;}
	public void setInterventionDatePlanification(Date interventionDatePlanification) {this.interventionDatePlanification = interventionDatePlanification;}
	
	public String getInterventionMemo() {return interventionMemo;}
	public void setInterventionMemo(String interventionMemo) {this.interventionMemo = interventionMemo;}
	
	public String getInterventionStatuts() {return interventionStatuts;}
	public void setInterventionStatuts(String interventionStatuts) {this.interventionStatuts = interventionStatuts;}
	
	public List<Intervention> getInterventions() {return interventions;}
	public List<Materiel> getMateriels() {return materiels;}
	public List<Intervenant> getIntervenants() {return intervenants;}

	
	public int getInterventionIntervenantID() {return interventionIntervenantID;}
	public void setInterventionIntervenantID(int interventionIntervenantID) {this.interventionIntervenantID = interventionIntervenantID;}
	public int getInterventionMaterielID() {return interventionMaterielID;}
	public void setInterventionMaterielID(int interventionMaterielID) {this.interventionMaterielID = interventionMaterielID;}
	
	public String index() {
		interventions = interventionDAO.findAll();
		return SUCCESS;
	}
	
	public String edit(){
		Intervention i = interventionDAO.findByID(getInterventionId());
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
