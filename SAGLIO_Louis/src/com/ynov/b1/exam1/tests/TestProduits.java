package com.ynov.b1.exam1.tests;

import com.ynov.b1.exam1.beans.Categories;
import com.ynov.b1.exam1.beans.Produit;
import com.ynov.b1.exam1.beans.Produits;

public class TestProduits {

	public static void main(String[] args) {
		Categories cats = new Categories();
		cats.init();
		
		Produits prods = new Produits(cats);
		prods.init();
		
		System.out.println("Tous les produits");
		for (Produit produit : prods) {
			System.out.println(produit);
		}
		
		System.out.println("\nToutes les boissons");
		for (Produit produit : prods.getProduitsByCategorie(1)) {
			System.out.println(produit);
		}
		
		System.out.println("\nToutes les boissons V2");
		for (Produit produit : prods.getProduitsByCategorie("boissons")) {
			System.out.println(produit);
		}
		
		System.out.println("\nToutes les pizzas");
		for (Produit produit : prods.getProduitsByCategorie("pizzas")) {
			System.out.println(produit);
		}
		
		System.out.println("\nToutes les boissons V3");
		String[] array =Produits.getProduitsString(prods.getProduitsByCategorie("boissons"));		
		for (String string : array) {
			System.out.println(string);
		}		
	}

}
