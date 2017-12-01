package beans;

public class Joue {

	private Acteur acteur;
	private Film film;
	private String role;
	
	public Joue(Acteur acteur, Film film, String role) {
		this.acteur = acteur;
		this.film = film;
		this.role = role;
	}

	public Acteur getActeur() {
		return acteur;
	}

	public Film getFilm() {
		return film;
	}

	public String getRole() {
		return role;
	}
	
	public String toString() {
		return this.acteur + " joue le rôle de " + this.role + " dans {" + this.film + "}";
	}
	
}
