package tn.iit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tn.iit.dao.CreneauRepositorie;
import tn.iit.dao.SalleRepositorie;
import tn.iit.entitie.Salle;

@Component
public class SalleService {

	String success = "success";
	@Autowired
	private SalleRepositorie salleDao;

	@Autowired
	private CreneauRepositorie creneauRepositorie;

	public List<Salle> liste() {
		return salleDao.findAll();

	}

	public String delete(Long id) {
		try {
			Salle s = salleDao.findOne(id);
			creneauRepositorie.deleteBySalle(s);
			salleDao.delete(id);
			return success;
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	public Salle get(Long id) {
		return salleDao.findOne(id);
	}

	public String createSalle(Salle salle) {
		try {
			salleDao.save(salle);
			return success;
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	public String editSalle(Salle salle) {
		try {
			salleDao.save(salle);
			return success;
		} catch (Exception e) {
			return e.getMessage();
		}
	}

}
