package tn.iit.entitie;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Groupe implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String libelle;
	private String specialit;
	private String niveau;

	public Groupe(Long id, String libelle, String specialit, String niveau) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.specialit = specialit;
		this.niveau = niveau;
	}

	public Groupe(String libelle, String specialit, String niveau) {
		super();
		this.libelle = libelle;
		this.specialit = specialit;
		this.niveau = niveau;
	}

	public Groupe() {
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

	public String getSpecialit() {
		return specialit;
	}

	public void setSpecialit(String specialit) {
		this.specialit = specialit;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Groupe [id=" + id + ", libelle=" + libelle + ", specialit=" + specialit + ", niveau=" + niveau + "]";
	}


}
