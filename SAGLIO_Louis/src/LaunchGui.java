import javax.swing.JFrame;

import com.ynov.b1.exam1.gui.ProduitFrame;


public class LaunchGui {

	public static void main(String[] args) {
		ProduitFrame frame=new ProduitFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
