package com.b1b.hex.launches;

import javax.swing.JFrame;

import com.b1b.hex.gui.FrameHex;

public class LanceurGUI {

	public static void main(String[] args) {
		FrameHex frame = new FrameHex();
		// réaction de l'aplli lors du clic de la croix
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//on rend visible la frame
		frame.setVisible(true);
	}
}