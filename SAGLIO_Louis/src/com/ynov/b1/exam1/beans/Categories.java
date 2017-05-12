package com.ynov.b1.exam1.beans;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class Categories extends ArrayList<Categorie>{
	
	public Categorie getCategorieByCode(int code) {
		for(Categorie c:this) {
			if(c.getCode()==code) {
				return c;
			}
		}
		return null;
	}
	
	public void init() {
		this.add(new Categorie(1, "boissons"));
		this.add(new Categorie(2, "glaces"));
		this.add(new Categorie(3, "gateaux"));
	}
	
	public String[] getCategoriesString() {
		String[] res=new String[this.size()];
		for(int i=0;i<this.size();i++)
			res[i]=String.format("%s (%02d)", this.get(i).getLibelle(),this.get(i).getCode());
		return res;
	}
	
	public Categorie getCategorieByLibelle(String libelle) {
		for (Categorie categorie : this) {
			if (categorie.getLibelle().equals(libelle)){
				return categorie;
			}
		}
		return null;		
	}

	@Override
	public boolean add(Categorie new_categorie) {
		if (this.getCategorieByCode(new_categorie.getCode()) != null){
			return false;
		}
		return super.add(new_categorie);
	}
}
