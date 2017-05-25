package launch;

import beans.Client;
import beans.Produit;

public class TestV1 {

	public static void main(String[] args) {

		Produit[] prods={
				new Produit(1, "bananes"),
				new Produit(2, "cacahu�tes")
		};
		
		Client[] clis={
				new Client(1, "Jean-Jean"),
				new Client(2, "Albertine")
		};

		
		clis[0].addProduit(prods[0]);// Jean-Jean ach�te des bananes
		clis[0].addProduit(prods[1]);// Jean-Jean ach�te des cacahu�tes
		clis[1].addProduit(prods[1]);// Albertine ach�te des cacahu�tes
		System.out.println("===== Infos Jean-Jean =====");
		System.out.println(clis[0].affiche(false));
		System.out.println("\n===== Infos Albertine =====");
		System.out.println(clis[1].affiche(false));
		System.out.println("\n===== Infos Bananes =====");
		System.out.println(prods[0].affiche(false));
		System.out.println("\n===== Infos Cacahu�tes =====");
		System.out.println(prods[1].affiche(false));

	}

} 