package beans;

public class Transaction {
	
	private Client client;
	private Produit produit;
	private int qtt;
	private String date;
	
	public Transaction(Client client, Produit produit, int qtt, String date) {
		this.client = client;
		this.produit = produit;
		this.qtt = qtt;
		this.date = date;
		
		this.client.addTransaction(this);
		this.produit.addTransaction(this);
	}

	public Client getClient() {
		return client;
	}

	public Produit getProduit() {
		return produit;
	}

	public int getQtt() {
		return qtt;
	}

	public String getDate() {
		return date;
	}
	
}
