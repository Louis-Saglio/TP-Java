package GUI;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Image extends JLabel {
	
	private Combobox cbb;
	
	public Image(Combobox cbb) {
		this.cbb = cbb;
		this.chooseAndChangeImage();
	}
	
	public void chooseAndChangeImage() {
		Icon image = new ImageIcon("images/" + cbb.getSelectedItem() + ".jpg");
		this.setIcon(image);
	}
}
