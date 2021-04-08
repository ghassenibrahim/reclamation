package tn.essat.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Reclamation {
	@Id @GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	private String desciption;
	private Timestamp date_recl;
	private String degres;
	private boolean Status;
	@OneToOne
	@JoinColumn(name = "type_rec_id")
	private TypeReclamation type_rec;
	
	@ManyToOne
	@JoinColumn(name = "compte_id")
	private Compte compte;

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

	public Timestamp getDate_recl() {
		return date_recl;
	}

	public void setDate_recl(Timestamp date_recl) {
		this.date_recl = date_recl;
	}

	public String getDegres() {
		return degres;
	}

	public void setDegres(String degres) {
		this.degres = degres;
	}

	public boolean isStatus() {
		return Status;
	}

	public void setStatus(boolean status) {
		Status = status;
	}

	public TypeReclamation getType_rec() {
		return type_rec;
	}

	public void setType_rec(TypeReclamation type_rec) {
		this.type_rec = type_rec;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	public Reclamation(Integer id, String desciption, Timestamp date_recl, String degres, boolean status,
			TypeReclamation type_rec, Compte compte) {
		super();
		this.id = id;
		this.desciption = desciption;
		this.date_recl = date_recl;
		this.degres = degres;
		Status = status;
		this.type_rec = type_rec;
		this.compte = compte;
	}

	public Reclamation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
