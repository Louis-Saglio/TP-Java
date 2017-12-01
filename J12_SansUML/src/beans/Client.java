package beans;

import java.util.ArrayList;

public class Client {
	
	private int code;
	private String nom;
	private ArrayList<Produit> produits;
	
	public Client(int code, String nom) {
		this.code = code;
		this.nom = nom;
		produits = new ArrayList<>();
	}
	
	public void addProduit(Produit produit) {
		this.produits.add(produit);
		produit.addAcheteur(this);
	}
	
	public String affiche(Boolean recursif) {
		String rep = "[" + this.code + "] : " + this.nom +"\n";
		if (recursif == false){
			for (Produit produit : this.produits) {
				rep += " - " + produit.affiche(true);
			}
		}
		return rep;
	}

}
