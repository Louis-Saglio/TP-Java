package beans;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class Categories extends ArrayList<Categorie> {
	
	public void init() {
		this.add(new Categorie(1, "glace"));
		this.add(new Categorie(2, "boisson"));
		this.add(new Categorie(3, "crème glacée"));
	}
	
}
