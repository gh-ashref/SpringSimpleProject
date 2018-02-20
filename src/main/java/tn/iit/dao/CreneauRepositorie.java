package tn.iit.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import tn.iit.entitie.Creneau;
import tn.iit.entitie.Enseignant;
import tn.iit.entitie.Groupe;
import tn.iit.entitie.Salle;
import tn.iit.entitie.Seance;

@Repository
public interface CreneauRepositorie extends JpaRepository<Creneau, Long> {

	List<Creneau> getCreneauByEtat(int etat);

	List<Creneau> getCreneauBySeanceAndDate(Seance seance, String date);

	List<Creneau> getCreneauByEnseignant(Enseignant enseignant);

	long count();

	@Modifying
	@Transactional
	@Query("Update Creneau c set c.etat=false where c.id=:id ")
	void annuler(@Param("id") Long id);

	@Modifying
	@Transactional
	@Query("DELETE FROM Creneau c WHERE c.enseignant.id=:ens")
	void deleteByEnsignant(@Param("ens") Long e);

	@Modifying
	@Transactional
	@Query("DELETE FROM Creneau c WHERE c.groupe=:grp")
	void deleteByGroupe(@Param("grp") Groupe e);

	@Modifying
	@Transactional
	@Query("DELETE FROM Creneau c WHERE c.seance=:sce")
	void deleteBySeance(@Param("sce") Seance e);

	@Modifying
	@Transactional
	@Query("DELETE FROM Creneau c WHERE c.salle=:sal")
	void deleteBySalle(@Param("sal") Salle e);

}
