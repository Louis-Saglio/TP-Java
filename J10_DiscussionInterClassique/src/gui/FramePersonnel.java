package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;


@SuppressWarnings("serial")
public class FramePersonnel extends JFrame {
	
	private PanelData paneldata;
	private PanelBouttons panelboutton;
	private PanelRadio panelradio;
	
	public FramePersonnel() {
		this.setSize(500, 300);
		this.setTitle("Employés");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(this.panelradio = new PanelRadio(this), BorderLayout.NORTH);
		this.add(this.paneldata = new PanelData(), BorderLayout.CENTER);		
		this.add(this.panelboutton = new PanelBouttons(this), BorderLayout.SOUTH);
		
		this.setVisible(true);
	}
	
	public PanelRadio getPanelradio() {
		return panelradio;
	}

	public PanelBouttons getPanelboutton() {
		return panelboutton;
	}

	public PanelData getPaneldata() {
		return paneldata;
	}
	
	

	
}
