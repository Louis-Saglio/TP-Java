package beans;

public class Permanent extends Personne {
	private float fixe;

	public Permanent(String prenom, String nom, Genre sexe, float fixe) {
		super(prenom, nom, sexe);
		this.fixe = fixe;
	}
	public float salaire() {
		return fixe;
	}
	public String toString() {
		return getClass().getSimpleName()+" : "+nomComplet()+
				" gagne "+salaire()+" €.";
	}
}
