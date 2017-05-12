package gui;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PanelData extends JPanel{
	
	private String nom, prenom, genre;
	private float nbr_heures, taux_horaire, salaire, ca, pct;
	private JTextField jtf_nom, jtf_prenom, jtf_masculin, jtf_feminin, jtf_nbr_heures, jtf_taux_horaire, jtf_salaire, jtf_ca, jtf_pct;
	
	public PanelData() {		
		super(new GridLayout(6, 2, 5, 5));		
	}
	
	
	public void makeTemporaire() {
		this.removeAll();
		System.out.println("MAKE TEMPORAIRE");
		JRadioButton masculin;
		JRadioButton feminin;
		this.add(new JLabel("Nom"));
		this.add(this.jtf_nom = new JTextField());
		this.add(new JLabel("Prénom"));
		this.add(this.jtf_prenom = new JTextField());
		this.add(masculin = new JRadioButton("Masculin"));
		this.add(feminin = new JRadioButton("Féminin"));
		this.add(new JLabel("Nombre d'heures"));
		this.add(this.nbr_heures = new JTextField());
		this.add(new JLabel("Taux horaire"));
		this.add(new JTextField());
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(masculin);
		bg.add(feminin);
		
		this.updateUI();
	}
	
	public void makePermanent() {
		System.out.println("MAKE permanent");
		this.removeAll();
		JRadioButton masculin;
		JRadioButton feminin;
		this.add(new JLabel("Nom"));
		this.add(new JTextField());
		this.add(new JLabel("Prénom"));
		this.add(new JTextField());
		this.add(masculin = new JRadioButton("Masculin"));
		this.add(feminin = new JRadioButton("Féminin"));
		this.add(new JLabel("Salaire"));
		this.add(new JTextField());
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(masculin);
		bg.add(feminin);
		
		this.updateUI();
	}
	
	public void makeCommercial() {
		this.removeAll();
		System.out.println("MAKE commercial");
		JRadioButton masculin;
		JRadioButton feminin;
		this.add(new JLabel("Nom"));
		this.add(new JTextField());
		this.add(new JLabel("Prénom"));
		this.add(new JTextField());
		this.add(masculin = new JRadioButton("Masculin"));
		this.add(feminin = new JRadioButton("Féminin"));
		this.add(new JLabel("Salaire"));
		this.add(new JTextField());
		this.add(new JLabel("Chiffre d'affaire"));
		this.add(new JTextField());
		this.add(new JLabel("Pourcentage"));
		this.add(new JTextField());
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(masculin);
		bg.add(feminin);
		
		this.updateUI();
	}
	
	public void synchroniseData() {
		this.nom = this.jtf_nom.getText();
		this.prenom = this.jtf_prenom.getText();
	}
	
	

}
