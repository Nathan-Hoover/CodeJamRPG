import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class CodeJamUI {
	JFrame frame;
	JPanel artPanel, infoPanel, controlPanel, promptPanel, choicePanel;
	JScrollPane promptScroll;
	JLabel choice1, choice2, choice3, choice4;
	JTextArea promptText;
	GridBagConstraints frameConstraints, controlConstraints;
	
	public CodeJamUI(){
		createFrame();
		createArtPanel();
		createControlPanel();
		createInfoPanel();
		frame.pack();
	}
	
	private void createArtPanel() {
		artPanel= new JPanel();
		artPanel.setBackground(Color.black);

		frameConstraints.fill = GridBagConstraints.BOTH;
		frameConstraints.gridx = 0;
		frameConstraints.gridy = 0;
		frameConstraints.weightx = 1.0;
		frameConstraints.weighty = 1.0;
		
		frame.add(artPanel, frameConstraints);
	}

	private void createInfoPanel() {
		infoPanel = new JPanel();
		infoPanel.setBackground(Color.BLUE);
		
		frameConstraints.fill = GridBagConstraints.BOTH;
		frameConstraints.gridx = 1;
		frameConstraints.gridy = 0;
		frameConstraints.gridheight = 2;
		frameConstraints.weightx = 0.35;
		frameConstraints.weighty = 1.0;
		
		frame.add(infoPanel, frameConstraints);
		
	}

	private void createControlPanel() {
		controlPanel = new JPanel();
		controlPanel.setLayout(new GridBagLayout());
		controlPanel.setBackground(Color.gray);
		
		frameConstraints.fill = GridBagConstraints.BOTH;
		frameConstraints.gridx = 0;
		frameConstraints.gridy = 1;
		frameConstraints.weightx = 1.0;
		frameConstraints.weighty = 0.70;
		
		controlConstraints = new GridBagConstraints();
		createPromptPanel();
		createChoicePanel();
		
		frame.add(controlPanel, frameConstraints);
	}

	private void createChoicePanel() {
		choicePanel = new JPanel();
		choicePanel.setLayout(new GridBagLayout());
		choicePanel.setPreferredSize(choicePanel.getPreferredSize());
		
		choice1 = new JLabel("Choice 1");
		choice1.setMinimumSize(new Dimension(500, 30));
		choice1.setPreferredSize(new Dimension(500, 30));
		choice1.setMaximumSize(new Dimension(500, 30));
		choice1.setOpaque(true);
		choice1.setBackground(Color.black);
		choice1.setForeground(Color.white);
		
		choice2 = new JLabel("Choice 2");
		choice2.setMinimumSize(new Dimension(500, 30));
		choice2.setPreferredSize(new Dimension(500, 30));
		choice2.setMaximumSize(new Dimension(500, 30));
		choice2.setOpaque(true);
		choice2.setBackground(Color.black);
		choice2.setForeground(Color.white);
		
		choice3 = new JLabel("Choice 3"); 
		choice3.setMinimumSize(new Dimension(500, 30));
		choice3.setPreferredSize(new Dimension(500, 30));
		choice3.setMaximumSize(new Dimension(500, 30));
		choice3.setOpaque(true);
		choice3.setBackground(Color.black);
		choice3.setForeground(Color.white);
		
		choice4 = new JLabel("Choice 4");
		choice4.setMinimumSize(new Dimension(500, 30));
		choice4.setPreferredSize(new Dimension(500, 30));
		choice4.setMaximumSize(new Dimension(500, 30));
		choice4.setOpaque(true);
		choice4.setBackground(Color.black);
		choice4.setForeground(Color.white);
		
		choice1.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {	
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {	
			}
        });
		
		choice2.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setChoices();
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {	
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {	
			}
        });
		
		choice3.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setPrompt();
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {	
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {	
			}
        });
		
		choice4.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {	
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseReleased(MouseEvent e) {	
			}
        });

		GridBagConstraints choicePanelConstraints = new GridBagConstraints();
		choicePanelConstraints.fill = GridBagConstraints.NONE;
		choicePanelConstraints.gridx = 0;
		choicePanelConstraints.gridy = 0;
		choicePanelConstraints.weightx = 1.0;
		choicePanelConstraints.weighty = 1.0;

		choicePanel.add(choice1, choicePanelConstraints);
				
		choicePanelConstraints.gridy = 1;
		choicePanel.add(choice2, choicePanelConstraints);

		choicePanelConstraints.gridy = 2;
		choicePanel.add(choice3, choicePanelConstraints);

		choicePanelConstraints.gridy = 3;
		choicePanel.add(choice4, choicePanelConstraints);
		
		controlConstraints.fill = GridBagConstraints.BOTH;
		controlConstraints.gridx = 0;
		controlConstraints.gridy = 1;
		controlConstraints.weightx = 1.0;
		controlConstraints.weighty = 1.0;
		
		controlPanel.add(choicePanel, controlConstraints);
	}

	protected void setChoices() {
		choice1.setText("FKLSNFLASF");
		choice2.setText("asdfsdafasdfasd 1");
		choice3.setText("sdfadsafadsfsa 2");
		choice4.setText("Testisadfsfasdfasfsng 3");
	}

	protected void setPrompt() {
		promptText.setText("WOWOWOWOWOWOWWOWOWO");
	}

	private void createPromptPanel() {
		promptPanel = new JPanel();
		promptPanel.setPreferredSize(promptPanel.getPreferredSize());
		
		promptText = new JTextArea("Hello World please be bigger ........Hello World please be bigger ........Hello World please be bigger ........Hello World please be bigger ........");
		promptText.setLineWrap(true);
		promptText.setEditable(false);
		
		promptScroll = new JScrollPane(promptText);
		promptScroll.setBackground(Color.black);
		promptScroll.setPreferredSize(new Dimension(500,100));
		
		GridBagConstraints promptPanelConstraints = new GridBagConstraints();
		promptPanelConstraints.fill = GridBagConstraints.NONE;
		promptPanelConstraints.gridx = 0;
		promptPanelConstraints.gridy = 0;
		promptPanelConstraints.weightx = 1.0;
		promptPanelConstraints.weighty = 1.0;
		
		promptPanel.add(promptScroll, promptPanelConstraints);
		
		controlConstraints.fill = GridBagConstraints.BOTH;
		controlConstraints.gridx = 0;
		controlConstraints.gridy = 0;
		controlConstraints.weightx = 1.0;
		controlConstraints.weighty = 0.65;

		controlPanel.add(promptPanel, controlConstraints);
	}

	private void createFrame() {
		frame = new JFrame();
		frame.setTitle("We Norbs");
		frame.setLayout(new GridBagLayout());
		frame.setLocationRelativeTo(null);
		frame.setMinimumSize(new Dimension(1280 , 720));
		frame.setMaximumSize(new Dimension(1280 , 720));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frameConstraints = new GridBagConstraints();
		
		frame.setVisible(true);
	}
		
	private BackgroundPanel loadImage(String pictureName) throws MalformedURLException, IOException{
		ClassLoader loader = CodeJamUI.class.getClassLoader();
        URL classLocation = loader.getResource("CodeJamUI.class");
        String classLocationToString = classLocation.toString();
        String location = classLocationToString.substring(0, classLocationToString.length() - 11) + pictureName;
        Image returnImage = ImageIO.read(new URL(location));
        BackgroundPanel returnPanel = new BackgroundPanel(returnImage, BackgroundPanel.SCALED, 0.0f, 0.0f);
        returnPanel.setPreferredSize(artPanel.getPreferredSize());
        return returnPanel;
	}
}
