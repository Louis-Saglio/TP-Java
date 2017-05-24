package tests;

import java.util.ArrayList;

import beans.Acteur;
import beans.Acteurs;
import beans.Film;
import beans.Films;
import beans.Joue;
import beans.Jouent;

public class TestJouent {

	public static void main(String[] args) {
		
		Acteurs acteurs = new Acteurs();
		acteurs.init();
		Films films = new Films();
		films.init();		
		Jouent jouent = new Jouent(acteurs, films);
		jouent.init();
		
		System.out.println("Tous les jeux d'acteurs (" + jouent.size() + ") :");
		for (Joue jeux : jouent) {
			System.out.println(jeux);
		}
		
		ArrayList<Joue> jeux = jouent.getJeuxFilms(films.getFilm("Armée"));
		System.out.println("\nTous les jeux d'acteurs du film 'Armée...' (" + jeux.size() + ") :");
		for (Joue joue : jeux) {
			System.out.println(joue);
		}
		
		jeux = jouent.getJeuxActeur(acteurs.getActeur("WILL"));
		System.out.println("\nTous les jeux d'acteurs de WILLIS...(" + jeux.size() + ") :");
		for (Joue joue : jeux) {
			System.out.println(joue);
		}
		
		System.out.println("\nFilms communs de Willis et Madeleine");
		ArrayList<Film> filmsCommuns = jouent.getFilmsCommunsActeurs(acteurs.getActeur("WILL"), acteurs.getActeur("Made"));
		for (Film film : filmsCommuns) {
			System.out.println(film);
		}
		
		System.out.println("\nActeurs communs à '...inq...' et '...ing...' :");
		ArrayList<Acteur> acteursCommuns = jouent.getActeursCommunsFilms(films.getFilm("inq"), films.getFilm("ing"));
		for (Acteur acteur : acteursCommuns) {
			System.out.println(acteur);
		}
	}

}
