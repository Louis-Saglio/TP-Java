package beans;

public class Acteur {

	private int code;
	private String nom, prenom;
	private Genre sexe;
	
	public Acteur(String nom, String prenom, Genre sexe) {
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public Genre getSexe() {
		return sexe;
	}
	
	public String toString() {
		String titre = (this.sexe == Genre.Feminin)?"Mme.":"M.";
		String rep = "[" + this.code + "] : " + titre + this.prenom + " " + this.nom;
		return rep;
	}
}
