package com.ynov.b1.exam1.beans;

public class Produit {
	
	private int code;
	private String libelle;
	private float prixU;
	private Categorie categorie;
	
	public Produit(int code, String libelle, float prixU, Categorie categorie) {
		this.code = code;
		this.libelle = libelle;
		this.prixU = prixU;
		this.categorie = categorie;
	}

	public int getCode() {
		return code;
	}

	public String getLibelle() {
		return libelle;
	}

	public float getPrixU() {
		return prixU;
	}

	public Categorie getCategorie() {
		return categorie;
	}
	
	@Override
	public String toString() {
		String rep = "[" + this.code + "] : "+ this.libelle + " Prix=" + this.prixU + " € " + "Catégorie : " + this.categorie;
		return rep;
	}
}
