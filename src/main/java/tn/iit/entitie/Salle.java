package tn.iit.entitie;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Salle implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String libelle;
	private String etage;
	private int capacite;

	public Salle(Long id, String libelle, String etage, int capacite) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.etage = etage;
		this.capacite = capacite;
	}

	public Salle() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getEtage() {
		return etage;
	}

	public void setEtage(String etage) {
		this.etage = etage;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Salle(String libelle, String etage, int capacite) {
		super();
		this.libelle = libelle;
		this.etage = etage;
		this.capacite = capacite;
	}


	
}
