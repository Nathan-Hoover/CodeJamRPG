import java.awt.Dimension;

import javax.swing.JFrame;


public class CodeJamUI {
	JFrame frame;
	
	public CodeJamUI(){
		createFrame();
		createArtPanel();
		createControlPanel();
		createInfoPanel();
	}
	
	private void createArtPanel() {
		// TODO Auto-generated method stub
		
	}

	private void createInfoPanel() {
		// TODO Auto-generated method stub
		
	}

	private void createControlPanel() {
		// TODO Auto-generated method stub
		
	}

	private void createFrame() {
		frame = new JFrame();
		frame.setPreferredSize(new Dimension(1280, 720));
		
		frame.pack();
		frame.setVisible(true);
	}
		
}
