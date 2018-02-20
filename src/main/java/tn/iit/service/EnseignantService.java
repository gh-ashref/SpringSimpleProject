package tn.iit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.iit.dao.CreneauRepositorie;
import tn.iit.dao.EnsignantRepositorie;
import tn.iit.entitie.Enseignant;

@Service
public class EnseignantService {

	String success = "success";
	@Autowired
	private EnsignantRepositorie ensignantRepositorie;
	@Autowired
	private CreneauRepositorie creneauRepositorie;

	public List<Enseignant> liste() {
		return ensignantRepositorie.findAll();

	}

	public String delete(Long id) {
		creneauRepositorie.deleteByEnsignant(id);
		ensignantRepositorie.delete(id);
		return success;
	}

	public Enseignant get(Long id) {
		return ensignantRepositorie.findOne(id);
	}

	public String createEnsignat(Enseignant user) {
		ensignantRepositorie.save(user);
		return success;
	}

	public String editEnseignant(Enseignant user) {
		Enseignant e = user;
		ensignantRepositorie.save(e);
		return success;
	}

}
