package tn.essat.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.essat.dao.ICompteDao;
import tn.essat.dao.IUserDao;
import tn.essat.model.Compte;
import tn.essat.model.User;






@CrossOrigin("*")
@RestController
@RequestMapping(path = "/rest")
public class Rest {
	@Autowired
	IUserDao dao;
	@Autowired
	ICompteDao dao1;
	
	@GetMapping("/user")
	public List<User> get1(){
		return dao.findAll();
		
	}
	
	@GetMapping("/compte")
	public List<Compte> get2(){
		return dao1.findAll();
		
	}
}
