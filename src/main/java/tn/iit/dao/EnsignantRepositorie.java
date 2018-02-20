package tn.iit.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.iit.entitie.Enseignant;

@Repository
public interface EnsignantRepositorie extends JpaRepository<Enseignant, Long> {
	long count();
}
