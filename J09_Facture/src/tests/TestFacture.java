package tests;

import beans.Facture;
import beans.Produits;

public class TestFacture {

	public static void main(String[] args) {
		Produits produits = new Produits();
		produits.init();
		Facture fact = new Facture(1245, "Louis", 7f);
		fact.addItem(produits.getById(001), 2);
		fact.addItem(produits.getById(003), 7);
		fact.addItem(produits.getById(002), 1);
		System.out.println(fact);
	}

}
