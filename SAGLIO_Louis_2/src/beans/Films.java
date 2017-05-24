package beans;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class Films extends ArrayList<Film> {

private int codeCourant = 0;
	
	private int getNextCode() {
		this.codeCourant += 1;
		return this.codeCourant;
	}

	@Override
	public boolean add(Film film) {
		film.setCode(this.getNextCode());
		return super.add(film);
	}
	
	public Film getFilm(String boutDuNom) {
		for (Film film : this) {
			if (film.toString().contains(boutDuNom)){
				return film;
			}
		}
		return null;
	}
	
	public void init() {
		this.add(new Film(1995, "L'Armée des 12 Singe"));
		this.add(new Film(1997, "Le Cinquième Elément"));
	}
	
}
