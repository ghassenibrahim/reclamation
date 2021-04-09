package tn.essat.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.essat.model.Intervention;

@Repository
public interface IInterventionDao extends JpaRepository<Intervention, Integer>{

}
