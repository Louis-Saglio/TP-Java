package beans;

public class Temporaire extends Personne {
	private float tauxHoraire, nbHeures;

	public Temporaire(String prenom, String nom, Genre sexe, float tauxHoraire, float nbHeures) {
		super(prenom, nom, sexe);
		this.tauxHoraire = tauxHoraire;
		this.nbHeures = nbHeures;
	}
	
	public float salaire() {
		return tauxHoraire*nbHeures;
	}

	public String toString() {
		return getClass().getSimpleName()+" : "+nomComplet()+
				" gagne "+salaire()+" €.";
	}
}
