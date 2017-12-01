package beans;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class Jouent extends ArrayList<Joue> {
	
	private Acteurs acteurs;
	private Films films;
	
	public Jouent(Acteurs acteurs, Films films) {
		this.acteurs = acteurs;
		this.films = films;
	}
	
	public void init() {
		this.add(new Joue(this.acteurs.getActeur("WIL"), this.films.getFilm("inq"), "Korben DALLAS"));
		this.add(new Joue(this.acteurs.getActeur("Madel"), this.films.getFilm("Singe"), "La Guenon"));
		this.add(new Joue(this.acteurs.getActeur("Madel"), this.films.getFilm("inq"), "La boulangère"));
	}
	
	public ArrayList<Joue> getJeuxFilms(Film f) {
		ArrayList<Joue> rep = new ArrayList<>();
		for (Joue joue : this) {
			if (joue.getFilm() == f){
				rep.add(joue);
			}
		}
		return rep;
	}
	
	public ArrayList<Joue> getJeuxActeur(Acteur a) {
		ArrayList<Joue> rep = new ArrayList<>();
		for (Joue joue : this) {
			if (joue.getActeur() == a){
				rep.add(joue);
			}
		}
		return rep;
	}
	
	public ArrayList<Film> getFilmsCommunsActeurs(Acteur a1, Acteur a2) {
		ArrayList<Film> rep = new ArrayList<>();
		ArrayList<Joue> jouesDeA1 = this.getJeuxActeur(a1);
		ArrayList<Joue> jouesDeA2 = this.getJeuxActeur(a2);
		for (Joue joue : jouesDeA1) {
			for (Joue joue2 : jouesDeA2) {
				if (joue.getFilm() == joue2.getFilm()){
					rep.add(joue.getFilm());
				}
			}
		}
		return rep;		
	}
	
	public ArrayList<Acteur> getActeursCommunsFilms(Film f1, Film f2) {
		ArrayList<Acteur> rep = new ArrayList<>();
		ArrayList<Joue> jouesDeF1 = this.getJeuxFilms(f1);
		ArrayList<Joue> jouesDeF2 = this.getJeuxFilms(f2);
		for (Joue joue : jouesDeF1) {
			for (Joue joue2 : jouesDeF2) {
				if (joue.getActeur() == joue2.getActeur()){
					rep.add(joue.getActeur());
				}
			}
		}
		return rep;		
	}
}
