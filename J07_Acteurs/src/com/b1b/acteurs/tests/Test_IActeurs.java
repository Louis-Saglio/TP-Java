package com.b1b.acteurs.tests;

import com.b1b.etudiants.beans.Acteur;
import com.b1b.etudiants.beans.Genre;
import com.b1b.etudiants.beans.ImplActeursArray;

public class Test_IActeurs {

	public static void main(String[] args) {
		ImplActeursArray test = new ImplActeursArray();
		test.addOneActeur(new Acteur(005, "Remi", "Dubois", Genre.Homme));
		System.out.println(test.getOneActeur(005));
		test.deleteOneActeur(005);
		System.out.println(test.getAllActeurs());
	}
}
