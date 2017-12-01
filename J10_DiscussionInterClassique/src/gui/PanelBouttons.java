package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PanelBouttons extends JPanel implements ActionListener{
	
	private FramePersonnel pere;
	private JButton liste, nouveau;
	
	public PanelBouttons(FramePersonnel pere) {
		this.pere = pere;
		this.add(this.liste = new JButton("Liste"));
		this.add(this.nouveau = new JButton("Nouveau"));
		this.add(new JButton("Quitter"));
		
		this.nouveau.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == this.nouveau){
			if (this.pere.getPanelradio().getPermanent().isSelected()){
				System.out.println("Permanent");
			}
			if (this.pere.getPanelradio().getCommercial().isSelected()){
				System.out.println("Commercial");
			}
			if (this.pere.getPanelradio().getTemporaire().isSelected()){
				System.out.println("Temporaire");
			}
		}
		
	}
	
}
