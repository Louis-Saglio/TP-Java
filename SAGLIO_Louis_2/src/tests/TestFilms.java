package tests;

import beans.Films;
import beans.Film;

public class TestFilms {

	public static void main(String[] args) {
		
		Films films = new Films();
		films.init();
		
		System.out.println("Tous les Films (" + films.size() + ") :");
		for (Film film : films) {
			System.out.println(film);
		}
		
		System.out.println("\nFilm contenant 'Armée'");
		System.out.println(films.getFilm("Armée"));

	}

}
