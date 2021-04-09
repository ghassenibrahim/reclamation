package tn.essat.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.essat.model.Reclamation;

@Repository
public interface IReclamationDao extends JpaRepository<Reclamation, Integer>{

}
