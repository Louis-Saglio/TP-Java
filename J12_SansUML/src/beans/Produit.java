package beans;

import java.util.ArrayList;

public class Produit {
	
	private int code;
	private String nom;
	private ArrayList<Client> acheteurs;
	
	public Produit(int code, String nom) {
		this.code = code;
		this.nom = nom;
		acheteurs = new ArrayList<>();
	}
	
	public void addAcheteur(Client acheteur) {
		this.acheteurs.add(acheteur);
	}
	
	public String affiche(Boolean recursif) {
		String rep = "[" + this.code + "] : " + this.nom + "\n";
		if (recursif == false){
			for (Client client : acheteurs) {
				rep += " - " + client.affiche(true);
			}
		}
		return rep;
	}

}
