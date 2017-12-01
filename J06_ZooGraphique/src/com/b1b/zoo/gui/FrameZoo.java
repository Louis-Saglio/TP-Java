package com.b1b.zoo.gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import beans.Animal;
import beans.Carnivore;
import beans.Omnivore;
import beans.Vegetarien;

@SuppressWarnings("serial")
public class FrameZoo extends JFrame implements ActionListener{
	// déclaration des attributs privés
	private JRadioButton jrb_Carn, jrb_Herb, jrb_Omni;
	private JTextField jtf_nom, jtf_poids, jtf_viande, jtf_legume;
	private JButton jb_ajouter, jb_commander, jb_quitter;
	private JLabel jl_legume, jl_viande;
	private ArrayList<Animal> animaux;
	private String classe;
	
	public FrameZoo(){
		
		this.setSize(500, 300);
		this.setTitle("Zoo");
		
		JPanel panelRadio = new JPanel(new GridLayout(1, 3, 5, 5));
		panelRadio.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		panelRadio.add(jrb_Carn = new JRadioButton("Carnivore"));
		panelRadio.add(jrb_Herb = new JRadioButton("Herbivore"));
		panelRadio.add(jrb_Omni = new JRadioButton("Omnivore"));
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrb_Carn);
		bg.add(jrb_Herb);
		bg.add(jrb_Omni);
		
		
		this.add(panelRadio, BorderLayout.NORTH);
		
		
		JPanel panelData = new JPanel(new GridLayout(4, 2, 15, 10));
		panelData.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		JLabel jl_nom = new JLabel("Nom :");
		panelData.add(jl_nom);		
		jtf_nom = new JTextField();
		panelData.add(jtf_nom);
		
		JLabel jl_poids = new JLabel("Poids :");
		panelData.add(jl_poids);		
		jtf_poids = new JTextField();
		panelData.add(jtf_poids);
		
		jl_viande = new JLabel("Quantité de viande :");
		panelData.add(jl_viande);		
		jtf_viande = new JTextField();
		panelData.add(jtf_viande);
		
		jl_legume = new JLabel("Quantité de légumes :");
		panelData.add(jl_legume);		
		jtf_legume = new JTextField();
		panelData.add(jtf_legume);	
		
		this.add(panelData, BorderLayout.CENTER);
		
		
		JPanel panelBoutton = new JPanel(new GridLayout(1, 3, 10, 10));
		panelBoutton.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		jb_ajouter = new JButton("Ajouter");
		panelBoutton.add(jb_ajouter);
		
		jb_commander = new JButton("Commander");
		panelBoutton.add(jb_commander);
		
		jb_quitter = new JButton("Quitter");
		panelBoutton.add(jb_quitter);
		
		this.add(panelBoutton, BorderLayout.SOUTH);
		
		
		jb_commander.addActionListener(this);
		jb_ajouter.addActionListener(this);
		jb_quitter.addActionListener(this);
		jrb_Carn.addActionListener(this);
		jrb_Herb.addActionListener(this);
		jrb_Omni.addActionListener(this);
		
		jrb_Carn.doClick();
		classe = "carn";
		
		animaux = new ArrayList<>();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent evenement){		
		
		if (evenement.getSource() == this.jb_quitter){
			System.exit(0);
		}
		if (evenement.getSource() == this.jrb_Herb){
			classe = "herb";
			jtf_nom.setText("");
			jtf_poids.setText("");
			jtf_legume.setText("");
			jtf_viande.setText("0");
			jl_viande.setEnabled(false);
			jtf_viande.setEnabled(false);
			jl_legume.setEnabled(true);
			jtf_legume.setEnabled(true);
		}
		if (evenement.getSource() == this.jrb_Carn){
			classe = "carn";
			jtf_nom.setText("");
			jtf_poids.setText("");
			jtf_legume.setText("0");
			jtf_viande.setText("");
			jl_viande.setEnabled(true);
			jtf_viande.setEnabled(true);
			jl_legume.setEnabled(false);
			jtf_legume.setEnabled(false);
		}
		if (evenement.getSource() == this.jrb_Omni){
			classe = "omni";
			jtf_nom.setText("");
			jtf_poids.setText("");
			jtf_legume.setText("");
			jtf_viande.setText("");
			jl_viande.setEnabled(true);
			jtf_viande.setEnabled(true);
			jl_legume.setEnabled(true);
			jtf_legume.setEnabled(true);
		}
		if (evenement.getSource() == this.jb_ajouter){
			try {
				int int_viande = Integer.parseInt(jtf_viande.getText());
				int int_legume = Integer.parseInt(jtf_legume.getText());
				int int_poids = Integer.parseInt(jtf_poids.getText());
				Animal a;
				if (classe == "carn") {
					a = new Carnivore(jtf_nom.getText(), int_poids, int_viande);
				}
				else if (classe == "herb") {
					a = new Vegetarien(jtf_nom.getText(), int_poids, int_legume);
				}
				else {
					a = new Omnivore(jtf_nom.getText(), int_poids, int_legume, int_viande);
				}
				animaux.add(a);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, "Format d'entrée !");
			}
		}
		if (evenement.getSource() == this.jb_commander){
			FrameMoteur commande = new FrameMoteur();
			commande.setSize(500, 200);
			commande.setTitle("Total");
			
			int qt_viande = 0;
			int qt_legume = 0;
			for (Animal animal : animaux) {
				qt_viande += animal.mangeViande();
				qt_legume += animal.mangeLegume();
			}
			
			JPanel panelCommande = new JPanel(new GridLayout(1, 1, 5, 5));
			panelCommande.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
			
			String total = "Vous devez commander " + qt_viande + " kg de viande et " + qt_legume + " kg de legumes";
			
			JLabel jl_total = new JLabel(total);
			panelCommande.add(jl_total);
			
			commande.add(panelCommande);
			commande.setVisible(true);
		}
	}
}
