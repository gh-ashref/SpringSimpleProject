package tn.iit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import tn.iit.entitie.Salle;
import tn.iit.service.SalleService;

@Controller
@RequestMapping("api/salle")
public class SalleController {
	@Autowired
	private SalleService salleService;

	/**
	 * Get All Salle
	 * 
	 * @return
	 */
	@GetMapping
	@ResponseBody
	public List<Salle> liste() {
		return salleService.liste();

	}

	/**
	 * Delete Salle BY ID
	 * 
	 * @param id
	 * @return
	 */
	@DeleteMapping("/{id}")
	@ResponseBody
	public String delete(@PathVariable Long id) {
		return salleService.delete(id);
	}

	/**
	 * Get Salle BY ID
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}")
	@ResponseBody
	public Salle get(@PathVariable Long id) {
		return salleService.get(id);
	}

	/**
	 * Create A New Salle
	 * 
	 * @param salle
	 * @return
	 */
	@PostMapping(value = "/")
	@ResponseBody
	public String createSalle(@RequestBody Salle salle) {
		return salleService.createSalle(salle);

	}

	/**
	 * Edit Salle
	 * 
	 * @param salle
	 * @return
	 */
	@PutMapping("/")
	@ResponseBody
	public String editSalle(@RequestBody Salle salle) {
		return salleService.editSalle(salle);
	}

}
