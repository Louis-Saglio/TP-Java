package beans;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class Acteurs extends ArrayList<Acteur> {

	private int codeCourant = 0;
	
	private int getNextCode() {
		this.codeCourant += 1;
		return this.codeCourant;
	}

	@Override
	public boolean add(Acteur acteur) {
		acteur.setCode(this.getNextCode());
		return super.add(acteur);
	}
	
	public Acteur getActeur(String boutDuNom) {
		for (Acteur acteur : this) {
			if (acteur.toString().contains(boutDuNom)){
				return acteur;
			}
		}
		return null;
	}
	
	public void init() {
		this.add(new Acteur("WILLIS", "Bruce", Genre.Masculin));
		this.add(new Acteur("JOVOVITCH", "Mila", Genre.Feminin));
		this.add(new Acteur("SOW", "Madeleine", Genre.Feminin));
	}
	
}
