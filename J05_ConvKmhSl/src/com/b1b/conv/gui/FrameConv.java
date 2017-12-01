package com.b1b.conv.gui;

import javax.swing.JFrame;

	
@SuppressWarnings("serial")
public class FrameConv extends JFrame {
	
	public FrameConv() {
		this.setSize(300, 150);
		this.setTitle("Convertisseur");
		PanelConv panel = new PanelConv();
		this.add(panel);
	}
}
