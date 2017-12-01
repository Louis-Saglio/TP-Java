package GUI;

import java.awt.event.ItemEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Panel extends JPanel implements java.awt.event.ItemListener{

	private Image image;

	public Panel() {
		JLabel jl_cat = new JLabel("Catégories");
		this.add(jl_cat);
		Combobox cbb = new Combobox();
		cbb.addItemListener(this);
		// Pourquoi this ?
		this.add(cbb);
		image = new Image(cbb);
		this.add(image);
	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		this.image.chooseAndChangeImage();		
	}
	
}
