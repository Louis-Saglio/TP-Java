package beans;

public class Film {

	private int code, annee;
	private String titre;
	
	public Film(int annee, String titre) {
		this.annee = annee;
		this.titre = titre;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getAnnee() {
		return annee;
	}

	public String getTitre() {
		return titre;
	}
	
	public String toString() {
		return "[" + this.code + "] : " + this.titre + " est sortie en " + this.annee;
	}
	
}
