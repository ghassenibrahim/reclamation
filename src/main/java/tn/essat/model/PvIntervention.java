package tn.essat.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PvIntervention {
	@Id @GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	private Timestamp date_intervention;
	private String observation;
	
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Timestamp getDate_intervention() {
		return date_intervention;
	}
	public void setDate_intervention(Timestamp date_intervention) {
		this.date_intervention = date_intervention;
	}
	public String getObservation() {
		return observation;
	}
	public void setObservation(String observation) {
		this.observation = observation;
	}
	public PvIntervention(Integer id, Timestamp date_intervention, String observation) {
		super();
		this.id = id;
		this.date_intervention = date_intervention;
		this.observation = observation;
	}
	public PvIntervention() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
