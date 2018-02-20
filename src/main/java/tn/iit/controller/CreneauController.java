package tn.iit.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import tn.iit.entitie.Creneau;
import tn.iit.service.CreneauService;

@Controller
@RequestMapping("api/creneau")
public class CreneauController {

	@Autowired
	private CreneauService creneauService;

	
	/**
	 * Get All Creneau
	 * @return
	 */
	@GetMapping("/")
	@ResponseBody
	public List<Creneau> liste() {
		return creneauService.liste();

	}

	/**
	 * Get All Creneau Canceled
	 * @return
	 */
	@GetMapping("annuller")
	@ResponseBody
	public List<Creneau> listeA() {
		return creneauService.listeA();

	}

	/**
	 * Delete Creneau BY ID
	 * @param id
	 * @return
	 */
	@DeleteMapping("/{id}")
	@ResponseBody
	public String delete(@PathVariable Long id) {
		creneauService.delete(id);
		return "success";
	}

	
	/**
	 * Get Creneau BY ID
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}")
	@ResponseBody
	public Creneau get(@PathVariable Long id) {
		return creneauService.get(id);
	}

	/**
	 * Get Dashbord Creaneau Stat
	 * Return 
	 * @return
	 */
	@GetMapping("/compteur/")
	@ResponseBody
	public Map<String, Integer> get() {

		return creneauService.dashboard();
	}
/**
 * Create a new Creneau
 * @param idGroupe
 * @param idEnseignant
 * @param idSalle
 * @param idSeance
 * @return
 */
	@PostMapping(value = "/")
	@ResponseBody
	public String createCreneau(@RequestParam("idGroupe") String idGroupe,
			@RequestParam("idEnseignant") String idEnseignant, @RequestParam("idSalle") String idSalle,
			@RequestParam("idSeance") String idSeance) {

		return creneauService.createCreneau(idGroupe, idEnseignant, idSalle, idSeance);
	}

	/**
	 * Get all Creneau BY Enseignant
	 * @param id
	 * @return
	 */
	@GetMapping(value = "/creneauEnseignant/{id}")
	@ResponseBody
	public List<Creneau> getCreneauByEnseignant(@PathVariable Long id) {

		return creneauService.getCreneauByEnseignant(id);

	}

	
	/**
	 * Edit Creneau BY ID
	 * @param creneau
	 * @return
	 */
	@PutMapping("/{id}")
	@ResponseBody
	public String editCreneau(@RequestBody Creneau creneau) {
		return creneauService.editCreneau(creneau);
	}

	/**
	 * Get all Creaneau Canceled
	 * @param id
	 * @return
	 */
	@ResponseBody
	public String annullerCreneau(@PathVariable Long id) {
		return creneauService.annullerCreneau(id);
	}

}
