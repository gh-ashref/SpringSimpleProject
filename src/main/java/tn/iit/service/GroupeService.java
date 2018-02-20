package tn.iit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.iit.dao.CreneauRepositorie;
import tn.iit.dao.GroupeRepositorie;
import tn.iit.entitie.Groupe;

@Service
public class GroupeService {

	String success = "success";
	@Autowired
	private GroupeRepositorie groupeRepositorie;

	@Autowired
	private CreneauRepositorie creneauRepositorie;

	public List<Groupe> liste() {
		return groupeRepositorie.findAll();

	}

	public String delete(Long id) {
		try {
			Groupe g = groupeRepositorie.findOne(id);
			creneauRepositorie.deleteByGroupe(g);
			groupeRepositorie.delete(id);
			return success;
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	public Groupe get(Long id) {
		return groupeRepositorie.findOne(id);
	}

	public String createGroupe(Groupe groupe) {
		try {
			groupeRepositorie.save(groupe);
			return success;
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	public String editGroupe(Groupe groupe) {
		try {
			groupeRepositorie.save(groupe);
			return success;
		} catch (Exception e) {
			return e.getMessage();
		}
	}

}
