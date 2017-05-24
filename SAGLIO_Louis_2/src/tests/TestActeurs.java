package tests;

import beans.Acteurs;
import beans.Acteur;

public class TestActeurs {

	public static void main(String[] args) {
		
		Acteurs acteurs = new Acteurs();
		acteurs.init();
		
		System.out.println("Tous les acteurs (" + acteurs.size() + ") :");
		for (Acteur acteur : acteurs) {
			System.out.println(acteur);
		}
		
		System.out.println("\nActeur contenant 'WIL' :");
		System.out.println(acteurs.getActeur("WIL"));

	}

}
