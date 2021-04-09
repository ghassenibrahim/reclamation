package tn.essat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
@Id @GeneratedValue (strategy = GenerationType.IDENTITY)
private Integer id;
private String nom;
private String prenom;
private String adresse;
private String email;
private String tel;
private int cin;
private int matricule;


public int getMatricule() {
	return matricule;
}
public void setMatricule(int matricule) {
	this.matricule = matricule;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(Integer id, String nom, String prenom, String adresse, String email, String tel, int cin,int matricule) {
	super();
	this.id = id;
	this.nom = nom;
	this.prenom = prenom;
	this.adresse = adresse;
	this.email = email;
	this.tel = tel;
	this.cin = cin;
	this.matricule=matricule;
	
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}
public int getCin() {
	return cin;
}
public void setCin(int cin) {
	this.cin = cin;
}

}
