package tn.iit.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.iit.entitie.Groupe;

@Repository
public interface GroupeRepositorie extends JpaRepository<Groupe, Long> {

	long count();
}
