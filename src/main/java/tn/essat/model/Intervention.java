package tn.essat.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Intervention {
	@Id @GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	private String desciption;
	private String status;
	@OneToMany
	private List<PvIntervention> pvintervention;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDesciption() {
		return desciption;
	}
	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<PvIntervention> getPvintervention() {
		return pvintervention;
	}
	public void setPvintervention(List<PvIntervention> pvintervention) {
		this.pvintervention = pvintervention;
	}
	public Intervention() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Intervention(Integer id, String desciption, String status, List<PvIntervention> pvintervention) {
		super();
		this.id = id;
		this.desciption = desciption;
		this.status = status;
		this.pvintervention = pvintervention;
	}
	

	

}
