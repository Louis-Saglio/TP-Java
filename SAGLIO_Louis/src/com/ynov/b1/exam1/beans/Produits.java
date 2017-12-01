package com.ynov.b1.exam1.beans;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class Produits extends ArrayList<Produit>{

	private Categories categories;

	public Produits(Categories categories) {
		this.categories = categories;
	}
	
	public Produit getProduitByCode(int code) {
		for (Produit produit : this) {
			if (produit.getCode() == code){
				return produit;
			}
		}
		return null;
	}
	
	public Produit getProduitByLibelle(String libelle) {
		for (Produit produit : this) {
			if (produit.getLibelle().equals(libelle)){
				return produit;
			}
		}
		return null;
	}
	
	public ArrayList<Produit> getProduitsByCategorie(int code) {
		ArrayList<Produit> res = new ArrayList<>();
		for (Produit produit : this) {
			if (produit.getCategorie().getCode() == code) {
				res.add(produit);
			}
		}
		return res;		
	}
	
	public ArrayList<Produit> getProduitsByCategorie(String libelle) {
		ArrayList<Produit> res = new ArrayList<>();
		for (Produit produit : this) {
			if (produit.getCategorie().getLibelle().equals(libelle)) {
				res.add(produit);
			}
		}
		return res;		
	}
	
	public static String[] getProduitsString(ArrayList<Produit> pts) {
		String[] res = new String[pts.size()];
		int i = 0;
		for (Produit produit : pts) {
			res[i] = produit.getLibelle() + " (" + produit.getCode() + ") : " + produit.getPrixU() + " €";
			i++;
		}
		return res;
	}
	
	public void init() {
		this.add(new Produit(1, "Sainte-Croix-Du-Mont", 27, this.categories.getCategorieByCode(1)));
		this.add(new Produit(2, "Volvic", 2, this.categories.getCategorieByCode(1)));
		this.add(new Produit(3, "Jus d'annanas", 5, this.categories.getCategorieByCode(1)));
		this.add(new Produit(4, "Glace à la vanille", 4, this.categories.getCategorieByCode(2)));
		this.add(new Produit(5, "Glace à la fraise", 5, this.categories.getCategorieByCode(2)));
		this.add(new Produit(6, "Fondant au chocolat", 7, this.categories.getCategorieByCode(3)));
	}
}
