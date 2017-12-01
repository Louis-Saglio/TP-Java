package beans;

public class Produit {
	
	private int id;
	private String nom;
	private float pu;
	
	public Produit(int id, String nom, float pu) {
		this.id = id;
		this.nom = nom;
		this.pu = pu;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getPu() {
		return pu;
	}

	public void setPu(float pu) {
		this.pu = pu;
	}
	
	public String toString() {
		return this.id + "\t" + this.nom + "\t" + this.pu + "€";
	}
}
