package tn.essat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Type {
	@Id @GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	private String titre;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public Type(Integer id, String titre) {
		super();
		this.id = id;
		this.titre = titre;
	}
	public Type() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
