package com.b1b.etudiants.beans;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class ImplActeursArray extends Acteurs implements IActeurs{
	
	public ImplActeursArray(){
		this.init();
	}

	@Override
	public ArrayList<Acteur> getAllActeurs() {
		return this;
	}

	@Override
	public Acteur getOneActeur(int code) {
		for (Acteur acteur : this){
			if (acteur.getCode() == code){
				return acteur;
			}
		}
		return null;
	}

	@Override
	public void addOneActeur(Acteur acteur) {
		this.add(acteur);
		
	}

	@Override
	public void deleteOneActeur(int code) {
		this.supprimerActeur(code);		
	}
	
	
}
