package com.b1b.hex.gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanelHex extends JPanel implements ActionListener {
	
	private JTextField jtf_dec, jtf_hex;
	private JButton jb_conv;
	private JButton jb_quit;

	public PanelHex() {
		// layout de type grille 3x2
		setLayout(new GridLayout(3, 2, 10, 10));
		// création de l'étiquette valeur décimal + ajout dans panel
		JLabel jl_dec = new JLabel("Valeur décimale : ");
		this.add(jl_dec);
		jtf_dec = new JTextField();
		this.add(jtf_dec);
		
		JLabel jl_hex = new JLabel("Valeur héxadécimale : ");
		this.add(jl_hex);
		jtf_hex = new JTextField();
		this.add(jtf_hex);
		
		jb_conv = new JButton("Convertir");
		this.add(jb_conv);
		
		jb_quit = new JButton("Quitter");
		this.add(jb_quit);
		
		// relier les boutons aux écouteurs
		this.jb_conv.addActionListener(this);
		this.jb_quit.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("Marche");
		if (arg0.getSource() == this.jb_quit){
			System.exit(0);
		}
		else if (arg0.getSource() == this.jb_conv){
			try{
				// récupere le contenu de jtf_dec dans un ENTIER :(
				int dec = Integer.parseInt(jtf_dec.getText());
				// transforme ce nombre entier en héxa -> String :(
				String hex = String.format("%X", dec);
				// on envoie cette chaine dans jtf_hex :(
				jtf_hex.setText(hex);
			}
			catch(Exception exc){
				// message graphique
				JOptionPane.showMessageDialog(this, "Format d'entrée !");
			}
		}
		
	}
}
