package com.ynov.b1.exam1.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.ynov.b1.exam1.beans.Categories;

@SuppressWarnings("serial")
public class ProduitFrame extends JFrame implements ActionListener{
	private JComboBox<String> jcb_Categorie;
	private JLabel jl_IconCategorie;
	private Categories cats;
	public ProduitFrame() {
		cats = new Categories();
		cats.init();
		this.setSize(500, 200);
		this.setTitle("Mes Produits");

		JPanel produitPanel=new JPanel(new GridLayout(1, 3, 10, 10));
		produitPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		produitPanel.add(new JLabel("Catégorie : "));
		produitPanel.add(jcb_Categorie=new JComboBox<String>(cats.getCategoriesString()));
		produitPanel.add(jl_IconCategorie=new JLabel());
		this.add(produitPanel,BorderLayout.NORTH);

		
		
		jcb_Categorie.addActionListener(this);
		extraitEtAffiche();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jcb_Categorie) {
			extraitEtAffiche();
		}
	}
	/**
	 * Cette méthode récupère l'item sélectionné. Il extrait le code qui est entre parenthèses,
	 *  va chercher la catégorie correspondant à ce code, puis construit l'image.<ul>
	 *  <li>Récupération de l'item : <code><b>getSelectedItem</b></code></li>
	 *  <li>Extraction du code : utilise une expression régulière : parenthèse+2 chiffres+parenthèse.
	 *  D'où l'expression <code><b>compile("([0-9]{2})")</b></code>. Le résultat de retrouve dans <code><b>group(0)</b></code></li>
	 */
	protected void extraitEtAffiche() {
		String item=(String) jcb_Categorie.getSelectedItem();
		int index = getRegex(item);
		setIcone(index);
	}
	private int getRegex(String item) {
		Pattern p=Pattern.compile("([0-9]{2})");
		Matcher m=p.matcher(item);
		m.find();
		int index=Integer.parseInt(m.group(0));
		return index;
	}
	/**
	 * Cette méthode récupère en paramètre le code de la catégorie, puis affiche l'icône
	 * correspondant à cette catégorie.
	 * @param index (int) : le code de la catégorie
	 * <ul>
	 * <li>On récupère le libellé de la catégorie connaissant son code : <code><b>getCategorieByCode(index).getLibelle()</b></code></li>
	 * <li>On précède le libellé par le dossier (images) et le suit par son extension (.png)</li>
	 * <li>On crée l'icone dans le jlabel</li>
	 * </ul>
	 */
	private void setIcone(int index) {
		String iconeName="images/"+cats.getCategorieByCode(index).getLibelle()+".png";
		jl_IconCategorie.setIcon(new ImageIcon(iconeName));
	}
}
