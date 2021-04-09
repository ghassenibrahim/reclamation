package tn.essat.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.essat.model.Contrat;

@Repository
public interface IContratDao extends JpaRepository<Contrat, Integer> {

}
