package tn.iit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tn.iit.dao.CreneauRepositorie;
import tn.iit.dao.SeanceRepositorie;
import tn.iit.entitie.Seance;

@Component
public class SeanceService {

	String success = "success";
	@Autowired
	private SeanceRepositorie seanceDao;

	@Autowired
	private CreneauRepositorie creneauRepositorie;

	public List<Seance> liste() {
		return seanceDao.findAll();

	}

	public String delete(Long id) {
		try {
			Seance s = seanceDao.getOne(id);
			creneauRepositorie.deleteBySeance(s);
			seanceDao.delete(id);
			return success;
		} catch (Exception e) {
			return e.getMessage();
		}
	}

	public Seance get(Long id) {
		return seanceDao.findOne(id);
	}

	public String createSeance(Seance seance) {
		try {
			seanceDao.save(seance);
			return success;
		} catch (Exception e) {
			return e.getMessage();
		}

	}

	public String editSeance(Seance seance) {
		try {
			seanceDao.save(seance);
			return success;
		} catch (Exception e) {
			return e.getMessage();
		}
	}

}
