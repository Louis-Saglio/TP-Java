package beans;

public class Omnivore extends Animal {
	
	private int quantiteLegume;
	private int quantiteViande;

	public Omnivore(String nom, int poids, int quantiteLegume, int quantiteViande) {
		super(nom, poids);
		this.quantiteLegume = quantiteLegume;
		this.quantiteViande = quantiteViande;
	}

	public double mangeLegume() {
		return this.quantiteLegume * super.getPoids();
	}

	public double mangeViande() {
		return this.quantiteViande * super.getPoids();
	}
	
	public String toString() {
		return super.toString() + " mange " + this.mangeLegume() + " kg de legumes" + " et " + this.mangeViande() + " kg de viande";
	}
}
