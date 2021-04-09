package tn.essat.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.essat.model.Compte;


@Repository
public interface ICompteDao extends JpaRepository<Compte, Integer>{

}
