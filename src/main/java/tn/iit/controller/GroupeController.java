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

import tn.iit.entitie.Groupe;
import tn.iit.service.GroupeService;

@Controller
@RequestMapping("api/groupe")
public class GroupeController {

	@Autowired
	private GroupeService groupeService;

	/**
	 * Get All Groupe
	 * 
	 * @return
	 */
	@GetMapping
	@ResponseBody
	public List<Groupe> liste() {
		return groupeService.liste();

	}

	/**
	 * Delete Groupe BY ID
	 * 
	 * @param id
	 * @return
	 */
	@DeleteMapping("/{id}")
	@ResponseBody
	public String delete(@PathVariable Long id) {
		return groupeService.delete(id);
	}

	/**
	 * Get Groupe BY ID
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}")
	@ResponseBody
	public Groupe get(@PathVariable Long id) {
		return groupeService.get(id);
	}

	/**
	 * Create A New Groupe
	 * 
	 * @param groupe
	 * @return
	 */
	@PostMapping(value = "/")
	@ResponseBody
	public String createGroupe(@RequestBody Groupe groupe) {
		return groupeService.createGroupe(groupe);
	}

	/**
	 * Edit Groupe
	 * 
	 * @param groupe
	 * @return
	 */

	@PutMapping("/")
	@ResponseBody
	public String editGroupe(@RequestBody Groupe groupe) {
		return groupeService.editGroupe(groupe);
	}

}
