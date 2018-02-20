package tn.iit.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.iit.entitie.Seance;

@Repository
public interface SeanceRepositorie extends JpaRepository<Seance, Long> {

	public List<Seance> getSeanceByLibelleSeance(String liblelle);

	long count();
}
