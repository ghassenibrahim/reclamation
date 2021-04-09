package tn.essat.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.essat.model.PvIntervention;

@Repository
public interface IPvInterventionDao extends JpaRepository<PvIntervention, Integer>{

}
