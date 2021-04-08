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


import tn.essat.dao.IMedicamentDao;
import tn.essat.dao.ITypeDao;
import tn.essat.model.Medicament;
import tn.essat.model.Type;

@CrossOrigin("*")
@RestController
@RequestMapping(path = "/rest")
public class Rest {
	
	@Autowired
	IMedicamentDao dao;
	@Autowired
	ITypeDao dao1;
	
	@GetMapping("/all")
	public List<Medicament> get1(){
		return dao.findAll();
	}
	@GetMapping("/all1")
	public List<Type> get12(){
		return dao1.findAll();
	}
	@GetMapping("/detail/{id}")
	public Optional<Medicament> get11554(@PathVariable("id") int id){
		return dao.findById(id);
	}
	@PostMapping("/addmedicament")
	public void add(@RequestBody Medicament m) {
		
		dao.save(m);
	}
	@DeleteMapping("/deletemedicament/{id}")
	public void get512(@PathVariable("id") int id){
		dao.deleteById(id);	
	}
	
	
	
}
