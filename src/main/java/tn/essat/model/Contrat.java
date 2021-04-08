package tn.essat.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Contrat {
	@Id @GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	private String titre;
	private Timestamp date_contrat;
	@ManyToOne
	@JoinColumn(name = "compte_id")
	private Compte compte;
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
	public Timestamp getDate_contrat() {
		return date_contrat;
	}
	public void setDate_contrat(Timestamp date_contrat) {
		this.date_contrat = date_contrat;
	}
	public Compte getCompte() {
		return compte;
	}
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	public Contrat(Integer id, String titre, Timestamp date_contrat, Compte compte) {
		super();
		this.id = id;
		this.titre = titre;
		this.date_contrat = date_contrat;
		this.compte = compte;
	}
	public Contrat() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
