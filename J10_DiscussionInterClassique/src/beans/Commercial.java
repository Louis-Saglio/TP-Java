package beans;

public class Commercial extends Permanent {
	float ca, pourcentage;

	public Commercial(String prenom, String nom, Genre sexe, float fixe, float ca, float pourcentage) {
		super(prenom, nom, sexe, fixe);
		this.ca = ca;
		this.pourcentage = pourcentage;
	}
	
	public float salaire() {
		return super.salaire()+ca*pourcentage;
	}
	
	public String toString() {
		return getClass().getSimpleName()+" : "+nomComplet()+
				" gagne "+salaire()+" €.";
	}
}
