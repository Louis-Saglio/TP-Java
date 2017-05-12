package tests;

import java.util.ArrayList;

import beans.Animal;
import beans.Carnivore;
import beans.Omnivore;
import beans.Vegetarien;

public class Classes_test {

	public static void main(String[] args) {
		ArrayList<Animal> animaux = new ArrayList<>();
		animaux.add(new Carnivore("Lion", 200, 15));
		animaux.add(new Vegetarien("Vache", 800, 13));
		animaux.add(new Omnivore("Cochon", 200, 10, 5));
		double totalViande = 0;
		double totalLegume = 0;
		for (Animal animal : animaux){
			totalLegume += animal.mangeLegume();
			totalViande += animal.mangeViande();
			System.out.println(animal);
		}
		System.out.println("Il faut commander " + totalLegume + " kg de légumes et " + totalViande + " kg de viande");
	}
}