package GUI;

import javax.swing.JComboBox;

import beans.Categorie;
import beans.Categories;

@SuppressWarnings("serial")
public class Combobox extends JComboBox<String>{
	
	public Combobox() {
		Categories elements = new Categories();
		elements.init();
		for (Categorie categorie : elements) {
			this.addCategorie(categorie);
		}
	}
	
	public void addCategorie(Categorie item) {
		this.addItem(item.getNom());
	}
}
