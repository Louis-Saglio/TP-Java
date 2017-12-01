package com.b1b.etudiants.beans;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class Acteurs extends ArrayList<Acteur>{
	
	public Acteur chercheActeur(int code) {
		for (Acteur acteur : this){
			if (acteur.getCode() == code) {
				return acteur;
			}
		}
		return null;
	}
	
	public Acteur chercheActeur(String str){
		for (Acteur acteur : this){
			if ((acteur.getPrenom().toLowerCase() + acteur.getNom().toLowerCase()).contains(str.toLowerCase())) {
				return acteur;
			}
		}
		return null;
	}
	
	public void supprimerActeur(int code){
		int compt = 0;
		for (Acteur acteur : this){			
			if (acteur.getCode() == code) {
				this.remove(compt);
				break;
			}
			compt += 1;
		}
	}
	
	public void init(){
		Acteur a = new Acteur(001, "Louis", "Saglio", Genre.Homme);
		Acteur b = new Acteur(002, "Robin", "Zob", Genre.Homme);
		Acteur c = new Acteur(003, "Anna", "Martin", Genre.Femme);
		this.add(a);
		this.add(b);
		this.add(c);
	}
}
