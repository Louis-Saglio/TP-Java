package launch;

import beans.Client;
import beans.Produit;
import beans.Transaction;

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
		
		Transaction[] trans={
				new Transaction(clis[0], prods[0], 2, "02/11/2017"),
				new Transaction(clis[0], prods[1], 1, "02/11/2017"),
				new Transaction(clis[1], prods[1], 5, "25/05/2017")
		};

		
		//clis[0].addProduit(prods[0]);// Jean-Jean ach�te des bananes
		//clis[0].addProduit(prods[1]);// Jean-Jean ach�te des cacahu�tes
		//clis[1].addProduit(prods[1]);// Albertine ach�te des cacahu�tes
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