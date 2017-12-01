package beans;

public class Item {
	
	private Produit produit;
	private float quantite;
	
	public Item(Produit produit, float quantite) {
		this.produit = produit;
		this.quantite = quantite;
	}
	
	public float getPrixItem() {
		return this.produit.getPu() * this.quantite;
	}
	
	public String toString() {
		return this.produit + "\t" + this.quantite + "\t" + this.getPrixItem();
	}

	public float getQuantite() {
		return quantite;
	}
}
