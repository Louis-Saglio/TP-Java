package beans;

public class Vegetarien extends Animal {
	
	private int quantiteLegume;

	public Vegetarien(String nom, int poids, int quantiteLegume) {
		super(nom, poids);
		this.quantiteLegume = quantiteLegume;
	}

	public double mangeLegume() {
		return this.quantiteLegume * super.getPoids();
	}

	public double mangeViande() {
		return 0;
	}
	
	public String toString() {
		return super.toString() + " mange " + this.mangeLegume() + " kg de legume";
	}
}
