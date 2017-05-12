package gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

@SuppressWarnings("serial")
public class PanelRadio extends JPanel implements ActionListener {
	
	private FramePersonnel pere;
	private JRadioButton permanent, temporaire, commercial;
	
	public PanelRadio(FramePersonnel pere) {
		super(new GridLayout(1, 3, 5, 5));
		this.pere = pere;
		
		this.add(permanent = new JRadioButton("Permanent"));
		this.add(temporaire = new JRadioButton("Temporaire"));
		this.add(commercial = new JRadioButton("Commercial"));
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(permanent);
		bg.add(temporaire);
		bg.add(commercial);
		
		permanent.addActionListener(this);
		temporaire.addActionListener(this);
		commercial.addActionListener(this);
	}

	public FramePersonnel getPere() {
		return pere;
	}

	public JRadioButton getPermanent() {
		return permanent;
	}

	public JRadioButton getTemporaire() {
		return temporaire;
	}

	public JRadioButton getCommercial() {
		return commercial;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource().equals(permanent)){
			pere.getPaneldata().makePermanent();			
		}
		if (e.getSource().equals(temporaire)){
			pere.getPaneldata().makeTemporaire();
		}
		if (e.getSource().equals(commercial)){
			pere.getPaneldata().makeCommercial();
		}
		pere.repaint();
	}
	
}
