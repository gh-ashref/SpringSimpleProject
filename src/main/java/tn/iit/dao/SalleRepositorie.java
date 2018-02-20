package tn.iit.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.iit.entitie.Salle;

@Repository
public interface SalleRepositorie extends JpaRepository<Salle, Long> {
	long count();
}
