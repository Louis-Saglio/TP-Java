package beans;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class Facture extends ArrayList<Item> {
	
	private int num;
	private String client;
	private float reduction;
	
	public Facture(int num, String client, float reduction) {
		this.num = num;
		this.client = client;
		this.reduction = reduction;
	}
	
	public float calculerPrixBrut() {
		float total = 0;
		for (Item item : this) {
			total += item.getPrixItem();
		}
		return total;
	}
	
	public float calculerReduction() {
		return this.calculerPrixBrut() * this.reduction / 100;
	}
	
	public float calculerPrix() {
		return this.calculerPrixBrut() - this.calculerReduction();
	}
	
	public String toString() {
		String rep = "Facture n°\t" + this.num;
		rep += "\nClient:\t" + this.client;
		rep += "\nID\tProduit\tPU\tQtt\tPrix total";
		for (Item item : this) {
			rep += "\n" + item + "€";
		}
		rep += "\nTotal brut :\t\t" + this.calculerPrixBrut() + "€";
		rep += "\nReduction de " + this.reduction + "%:\t" + this.calculerReduction() + "€";
		rep += "\nTotal à payer:\t\t" + this.calculerPrix() + "€";
		return rep;
	}
	
	public void addItem(Produit produit, float qtt) {
		this.add(new Item(produit, qtt));
	}
}
