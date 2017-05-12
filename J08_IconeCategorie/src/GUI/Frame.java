package GUI;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Frame extends JFrame {
	
	public Frame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Rafraîchissement");
		this.setSize(450, 300);
		this.setVisible(true);
	}
	
}
