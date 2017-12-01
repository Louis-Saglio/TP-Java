package beans;

public abstract class Animal {
	
	private String nom;
	private int poids;
	
	public abstract double mangeLegume();
	public abstract double mangeViande();
	
	public Animal(String nom, int poids){
		this.nom = nom;
		this.poids = poids;
	}
	
	public String toString(){
		String rep = getClass().getSimpleName() + " : " + this.nom + " (" + this.poids + "kg )";
		return rep;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPoids() {
		return poids;
	}
	
}
