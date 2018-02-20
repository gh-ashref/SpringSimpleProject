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

import tn.iit.entitie.Enseignant;
import tn.iit.service.EnseignantService;

@Controller
@RequestMapping("api/enseignant")
public class EnseignantController {
	@Autowired
	private EnseignantService enseignantService;

	/**
	 * Get All Enseignants 
	 * @return
	 */
	@GetMapping
	@ResponseBody
	public List<Enseignant> liste() {
		return enseignantService.liste();

	}

	/**
	 * Delete Enseignant BY ID
	 * @param id
	 * @return
	 */
	@DeleteMapping("/{id}")
	@ResponseBody
	public String delete(@PathVariable Long id) {
		return enseignantService.delete(id);
	}

	
	/**
	 * Get Enseignant BY ID
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}")
	@ResponseBody
	public Enseignant get(@PathVariable Long id) {
		return enseignantService.get(id);
	}

	/**
	 * Create New Enseignant 
	 * @param user
	 * @return
	 */
	@PostMapping(value = "/")
	@ResponseBody
	public String createEnsignant(@RequestBody Enseignant user) {
		return enseignantService.createEnsignat(user);
	}

	/**
	 * Edit Enseignant
	 * @param user
	 * @return
	 */
	@PutMapping("/")
	@ResponseBody
	public String edit(@RequestBody Enseignant user) {
		Enseignant e = user;
		return enseignantService.editEnseignant(e);

	}

}
