package beans;

import java.util.ArrayList;

public class Client {
	
	private int code;
	private String nom;
	private ArrayList<Transaction> transactions;
	
	public Client(int code, String nom) {
		this.code = code;
		this.nom = nom;
		transactions = new ArrayList<>();
	}
	
	public void addTransaction(Transaction transaction) {
		this.transactions.add(transaction);
	}
	
	public String affiche(Boolean recursif) {
		String rep = "[" + this.code + "] : " + this.nom +"\n";
		if (recursif == false){
			for (Transaction transaction : transactions) {
				rep += " - " + transaction.getProduit().affiche(true);
				rep += " . Quantité : " + transaction.getQtt();
				rep += "\n . Date : " + transaction.getDate() + "\n";
			}
		}
		return rep;
	}

}
