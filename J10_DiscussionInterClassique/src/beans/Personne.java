package beans;

public class Personne {
	private String prenom, nom;
	private Genre sexe;
	
	public Personne(String prenom, String nom, Genre sexe) {
		this.prenom = prenom;
		this.nom = nom;
		this.sexe = sexe;
	}
	
	public String nomComplet() {
		String titre=sexe==Genre.Feminin?"Mme":"M.";
		return titre+" "+prenom+" "+nom;
	}
}
