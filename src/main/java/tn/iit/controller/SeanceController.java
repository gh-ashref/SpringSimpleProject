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

import tn.iit.entitie.Seance;
import tn.iit.service.SeanceService;

@Controller
@RequestMapping("api/seance")
public class SeanceController {
	@Autowired
	private SeanceService seanceService;

	/**
	 * Get All Seance
	 * 
	 * @return
	 */
	@GetMapping
	@ResponseBody
	public List<Seance> liste() {
		return seanceService.liste();

	}

	/**
	 * Delete Seance By ID
	 * 
	 * @param id
	 * @return
	 */
	@DeleteMapping("/{id}")
	@ResponseBody
	public String delete(@PathVariable Long id) {
		return seanceService.delete(id);
	}

	/**
	 * Get Seance BY ID
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}")
	@ResponseBody
	public Seance get(@PathVariable Long id) {
		return seanceService.get(id);
	}

	/**
	 * Create a new Seance
	 * 
	 * @param seance
	 * @return
	 */
	@PostMapping(value = "/")
	@ResponseBody
	public String createseance(@RequestBody Seance seance) {
		return seanceService.createSeance(seance);
	}

	/**
	 * Update Seance
	 * 
	 * @param seance
	 * @return
	 */
	@PutMapping("/")
	@ResponseBody
	public String editseance(@RequestBody Seance seance) {
		return seanceService.editSeance(seance);
	}

}
