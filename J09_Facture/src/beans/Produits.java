package beans;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class Produits extends ArrayList<Produit> {
	
	public Produit getById(int id) {
		for (Produit produit : this) {
			if (produit.getId() == id) {
				return produit;
			}
		}
		return null;
	}
	
	public void init() {
		this.add(new Produit(001, "eau", 2.5f));
		this.add(new Produit(002, "vin", 7.2f));
		this.add(new Produit(003, "bière", 4.7f));
	}
	
}
