package com.b1b.zoo.launches;

import javax.swing.JFrame;

import com.b1b.zoo.gui.FrameZoo;

public class LanceurGUI {

	public static void main(String[] args) {
		FrameZoo frame = new FrameZoo();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}