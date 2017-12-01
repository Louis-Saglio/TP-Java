package com.ynov.b1.exam1.beans;

public class Categorie {
	private int code;
	private String libelle;
	
	public String toString() {
		return "["+code+"] : "+libelle;
	}
	public Categorie(int code, String libelle) {
		this.code = code;
		this.libelle = libelle;
	}
	public int getCode() {
		return code;
	}
	public String getLibelle() {
		return libelle;
	}
	
}
