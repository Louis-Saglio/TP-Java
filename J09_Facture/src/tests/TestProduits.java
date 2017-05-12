package tests;

import beans.Produit;
import beans.Produits;

public class TestProduits {

	public static void main(String[] args) {
		Produits ps=new Produits();
		ps.init();
		
		System.out.println("Affichage des "+ps.size()+" produits :");
		for(Produit p:ps)
			System.out.println("- "+p);
		
		System.out.println("\nAffichage d'un produit qui existe (1) :");
		System.out.println(ps.getById(1));
		
		System.out.println("\nAffichage d'un produit qui n'existe pas (99) :");
		System.out.println(ps.getById(99));
	}

}
