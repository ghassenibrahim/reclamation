package tn.essat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class Medicament {
	@Id @GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	private int prix;
	private String titre;
	
	
	@ManyToOne
	@JoinColumn(name = "type_id")
	private Type type;

	public Medicament(Integer id, String titre, Type type) {
		super();
		this.id = id;
		this.titre = titre;
		this.type = type;
	}

	public Medicament() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
	
}
