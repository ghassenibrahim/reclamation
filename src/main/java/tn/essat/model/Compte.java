package tn.essat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Compte {
	@Id @GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	private String login;
	private String password;
	private String role;  
	@OneToOne
	@JoinColumn(name = "user_id")
	private User user;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Compte(Integer id, String login, String password, String role, User user) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
		this.role = role;
		this.user = user;
	}
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
