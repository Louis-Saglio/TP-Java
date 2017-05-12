package com.b1b.etudiants.beans;

import java.util.ArrayList;

public interface IActeurs {
	
	public ArrayList<Acteur> getAllActeurs();
	public Acteur getOneActeur(int code);
	public void addOneActeur(Acteur acteur);
	public void deleteOneActeur(int code);
}
