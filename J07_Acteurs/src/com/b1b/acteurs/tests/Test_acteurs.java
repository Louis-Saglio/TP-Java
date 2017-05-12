package com.b1b.acteurs.tests;

//import javax.swing.JFrame;
//import javax.swing.JOptionPane;

import com.b1b.etudiants.beans.Acteurs;

public class Test_acteurs {

	public static void main(String[] args) {
		
		Acteurs acteurs = new Acteurs();
		acteurs.init();
		System.out.println(acteurs.chercheActeur(001));
		System.out.println(acteurs.chercheActeur("binzo"));
		acteurs.supprimerActeur(002);
		System.out.println(acteurs.chercheActeur(002));
/*		JFrame frame = new JFrame();
		acteurs.init();
		String rep = acteurs.chercheActeur(001).toString();
		rep += acteurs.chercheActeur("binZo");
		JOptionPane.showMessageDialog(frame, rep);*/
	}

}
