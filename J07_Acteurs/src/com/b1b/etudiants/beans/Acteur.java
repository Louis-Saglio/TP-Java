package com.b1b.etudiants.beans;

public class Acteur {
	
	private int code;
	private String prenom;
	private String nom;
	private Genre sexe;
	
	public Acteur(int code, String prenom, String nom, Genre sexe){
		this.code = code;
		this.prenom = prenom;
		this.nom = nom;
		this.sexe = sexe;
	}
	
	public int getCode() {
		return this.code;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String getPrenom() {
		return this.prenom;
	}
	
	public String toString() {
		String rep = "\nPrenom\t:\t" + prenom + "\nNom\t:\t" + nom + "\nSexe\t:\t" + sexe + "\nCode\t:\t" + code;
		rep += "\n";
		return rep;
	}
}
