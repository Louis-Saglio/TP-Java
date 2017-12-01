package beans;

public class Carnivore extends Animal{

	private int quantiteViande;

	public Carnivore(String nom, int poids, int quantiteViande) {
		super(nom, poids);
		this.quantiteViande = quantiteViande;
	}
	
	public double mangeLegume() {
		return 0;
	}

	public double mangeViande() {
		return this.quantiteViande * super.getPoids();
	}
	
	public String toString(){
		return super.toString() + " mange " + this.mangeViande() + " kg de viande";
	}
}