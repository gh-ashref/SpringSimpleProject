package tn.iit.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.iit.dao.CreneauRepositorie;
import tn.iit.dao.EnsignantRepositorie;
import tn.iit.dao.GroupeRepositorie;
import tn.iit.dao.SalleRepositorie;
import tn.iit.dao.SeanceRepositorie;
import tn.iit.entitie.Creneau;
import tn.iit.entitie.Enseignant;
import tn.iit.entitie.Groupe;
import tn.iit.entitie.Salle;
import tn.iit.entitie.Seance;

@Service
public class CreneauService {

	@Autowired
	private CreneauRepositorie creneauRepositorie;
	@Autowired
	private EnsignantRepositorie ensignantRepositorie;
	@Autowired
	private SalleRepositorie salleRepositorie;
	@Autowired
	private GroupeRepositorie groupeRepositorie;
	@Autowired
	private SeanceRepositorie seanceRepositorie;

	public List<Creneau> liste() {
		return creneauRepositorie.getCreneauByEtat(0);

	}

	public List<Creneau> listeA() {
		return creneauRepositorie.getCreneauByEtat(1);
	}

	public String delete(Long id) {
		creneauRepositorie.delete(id);
		return "success";
	}

	public Creneau get(Long id) {
		return creneauRepositorie.findOne(id);
	}

	public Map<String, Integer> dashboard() {

		Map<String, Integer> myMap = new HashMap<String, Integer>();

		myMap.put("creneau", (int) (creneauRepositorie.getCreneauByEtat(0).size()));
		myMap.put("ensignant", (int) (ensignantRepositorie.count()));
		myMap.put("groupe", (int) (groupeRepositorie.count()));
		myMap.put("salle", (int) (salleRepositorie.count()));
		myMap.put("seance", (int) (seanceRepositorie.count()));
		myMap.put("creneauA", (int) (creneauRepositorie.getCreneauByEtat(1).size()));

		return myMap;
	}

	public String createCreneau(String idGroupe, String idEnseignant, String idSalle, String idSeance) {

		Enseignant enseignant = ensignantRepositorie.getOne(Long.valueOf(idEnseignant));
		Groupe groupe = groupeRepositorie.getOne(Long.valueOf(idGroupe));
		Salle salle = salleRepositorie.getOne(Long.valueOf(idSalle));
		Seance seance = seanceRepositorie.getOne(Long.valueOf(idSeance));
		Creneau newCreneau = new Creneau(groupe, enseignant, seance, salle, new Date().toString());
		newCreneau.setEtat(true);
		creneauRepositorie.save(newCreneau);

		return "success";
	}

	public List<Creneau> getCreneauByEnseignant(Long id) {

		return creneauRepositorie.getCreneauByEnseignant(ensignantRepositorie.findOne(id));

	}

	public String editCreneau(Creneau creneau) {
		creneauRepositorie.save(creneau);
		return "success";
	}

	public String annullerCreneau(Long id) {
		creneauRepositorie.annuler(id);
		return "success";
	}

}
