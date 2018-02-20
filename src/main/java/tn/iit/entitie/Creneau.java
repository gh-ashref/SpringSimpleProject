package tn.iit.entitie;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Creneau implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private boolean etat;
	private String date;

	@ManyToOne(cascade = CascadeType.MERGE)
	private Groupe groupe;
	@ManyToOne(cascade = CascadeType.MERGE)
	private Enseignant enseignant;
	@ManyToOne(cascade = CascadeType.MERGE)
	private Seance seance;
	@ManyToOne(cascade = CascadeType.MERGE)
	private Salle salle;

	public Creneau(Groupe groupe, Enseignant enseignant, Seance seance, Salle salle, String date) {

		this.groupe = groupe;
		this.enseignant = enseignant;
		this.seance = seance;
		this.salle = salle;
		this.date = date;
	}

	public boolean getEtat() {
		return etat;
	}

	public void setEtat(boolean etat) {
		this.etat = etat;
	}

	public Groupe getGroupe() {
		return groupe;
	}

	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}

	public Creneau() {
		super();

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Groupe getNiveau() {
		return groupe;
	}

	public String getDate() {
		return date;
	}

	public Enseignant getEnseignant() {
		return enseignant;
	}

	public Seance getSeance() {
		return seance;
	}

	public Salle getSalle() {
		return salle;
	}

}
