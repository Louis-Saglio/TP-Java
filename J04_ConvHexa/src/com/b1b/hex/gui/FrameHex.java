package com.b1b.hex.gui;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class FrameHex extends JFrame {
	
	public FrameHex() {
		this.setSize(300, 150);
		this.setTitle("Convertisseur hexad�cimal");
		// instanciation du panel + ajout dans la frame
		PanelHex panel = new PanelHex();
		this.add(panel);
	}
}
