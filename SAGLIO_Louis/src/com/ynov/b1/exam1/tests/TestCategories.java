package com.ynov.b1.exam1.tests;

import com.ynov.b1.exam1.beans.Categorie;
import com.ynov.b1.exam1.beans.Categories;

public class TestCategories {

	public static void main(String[] args) {
		Categories cats = new Categories();
		cats.init();
		
		System.out.println("Affichage des catégories");
		for (Categorie categorie : cats) {
			System.out.println(categorie);
		}
		
		System.out.println("\nRecherche d'un code existant :");
		System.out.println(cats.getCategorieByCode(1));
		
		System.out.println("\nRecherche d'un code inexistant :");
		System.out.println(cats.getCategorieByCode(23));
		
		System.out.println("\nRecherche d'un libelle existant :");
		System.out.println(cats.getCategorieByLibelle("boissons"));
		
		System.out.println("\nRecherche d'un libelle inexistant :");
		System.out.println(cats.getCategorieByLibelle("Nihi est in intellectu quod non prius fuit in intellectu"));
		
		System.out.println("\nAjout d'une catégorie correcte :");
		System.out.println(cats.add(new Categorie(4, "vin")));
		
		System.out.println("\nAjout d'une catégorie correcte :");
		System.out.println(cats.add(new Categorie(4, "bière")));
	}

}
