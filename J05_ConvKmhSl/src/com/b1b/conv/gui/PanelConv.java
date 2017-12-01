package com.b1b.conv.gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanelConv extends JPanel implements ActionListener{
	
	private JButton jb_quit;
	private JButton jb_conv;
	private JTextField jtf_km;
	private JTextField jtf_sl;

	public PanelConv(){
		setLayout(new GridLayout(3, 2, 10, 10));
		
		JLabel jl_km = new JLabel("Kilomètres :");
		this.add(jl_km);
		
		jtf_km = new JTextField();
		this.add(jtf_km);
		
		JLabel jl_sl = new JLabel("Seconde lumière :");
		this.add(jl_sl);
		
		jtf_sl = new JTextField();
		this.add(jtf_sl);
		
		jb_conv = new JButton("Convertir");
		this.add(jb_conv);
		
		this.jb_quit = new JButton("Quitter");
		this.add(jb_quit);
		
		jb_conv.addActionListener(this);
		jb_quit.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent evenement) {
		if (evenement.getSource() == this.jb_quit){
			System.exit(0);
		}
		else if (evenement.getSource() == this.jb_conv){
			try{
				System.out.println(1);
				double dec = Double.parseDouble(jtf_km.getText());
				System.out.println(2);
				dec = dec / 300000;
				String rep = Double.toString(dec);
				jtf_sl.setText(rep);
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(this, "Format d'entrée invalide !");
			}
		}		
	}
}