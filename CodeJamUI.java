import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class CodeJamUI {
	Interact theInteractions;
	Player thePlayer;
	JFrame frame;
	JPanel artPanel, infoPanel, controlPanel, promptPanel, choicePanel, controlBackground, statusPanel, mapPanel;
	JProgressBar moralityProgress;
	JScrollPane promptScroll;
	JLabel strengthProgress, intelectProgress, dexterityProgress, choice1, choice2, choice3, choice4, picLabel, mapLabel;
	JTextArea promptText;
	GridBagConstraints frameConstraints, controlConstraints;
	
	private void titleScreen() {
		JPanel titleScreenPanel = new JPanel();
		titleScreenPanel.setLayout(new GridBagLayout());
		titleScreenPanel.setBackground(Color.BLACK);
		
		GridBagConstraints titleScreenConstraints = new GridBagConstraints();
		titleScreenConstraints.fill = GridBagConstraints.BOTH;
		titleScreenConstraints.gridx = 0;
		titleScreenConstraints.gridy = 0;
		titleScreenConstraints.weightx = 1.0;
		titleScreenConstraints.weighty = 0.70;
		
		JLabel title = new JLabel("Title Pending", SwingConstants.CENTER);
		title.setFont(new Font("Serif", Font.PLAIN, 100));
		title.setForeground(Color.white);
		JLabel by = new JLabel("BY: Nathaniel Hoover, Brandon Bauman, Wes Letcher", SwingConstants.CENTER);
		by.setFont(new Font("Serif", Font.PLAIN, 40));
		by.setForeground(Color.white);
		JLabel startLabel = new JLabel("Start Game", SwingConstants.CENTER);
		startLabel.setFont(new Font("Serif", Font.PLAIN, 40));
		startLabel.setBackground(Color.white);
		startLabel.setForeground(Color.white);
		
		startLabel.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				artPanel.setVisible(true);
				infoPanel.setVisible(true);
				controlPanel.setVisible(true);
				titleScreenPanel.setVisible(false);
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
		
		titleScreenPanel.add(title, titleScreenConstraints);
		titleScreenConstraints.gridy = 1;
		titleScreenPanel.add(by, titleScreenConstraints);
		titleScreenConstraints.gridy = 2;
		titleScreenConstraints.gridheight = 2;
		titleScreenPanel.add(startLabel, titleScreenConstraints);
		
		frameConstraints.fill = GridBagConstraints.BOTH;
		frameConstraints.gridx = 0;
		frameConstraints.gridy = 0;
		frameConstraints.weightx = 1.0;
		frameConstraints.weighty = 1.0;
		
		frame.add(titleScreenPanel, frameConstraints);
	}
	
	public CodeJamUI() throws MalformedURLException, IOException{
		createFrame();
		createArtPanel();
		artPanel.setVisible(false);
		createControlPanel();
		controlPanel.setVisible(false);
		createInfoPanel();
		infoPanel.setVisible(false);
		titleScreen();
		frame.pack();
	}
	
	private void createArtPanel() {
		artPanel = new JPanel();
		artPanel.setBackground(Color.black);
			
		frameConstraints.fill = GridBagConstraints.BOTH;
		frameConstraints.gridx = 0;
		frameConstraints.gridy = 0;
		frameConstraints.weightx = 1.0;
		frameConstraints.weighty = 1.0;
		artPanel.setPreferredSize(artPanel.getPreferredSize());
		
		
		artPanel.setPreferredSize(artPanel.getPreferredSize());

		frame.add(artPanel, frameConstraints);
		
		setArt("scenePlaceHolder.jpg");
		
		artPanel.add(picLabel);
	}

	private void createInfoPanel() {
		infoPanel = new JPanel();
		infoPanel.setBackground(Color.BLUE);
		infoPanel.setLayout(new GridBagLayout());
		
		createMapPanel();
		createStatusPanel();
		
		GridBagConstraints infoPanelConstraints = new GridBagConstraints();
		infoPanelConstraints.fill = GridBagConstraints.BOTH;
		infoPanelConstraints.gridx = 0;
		infoPanelConstraints.gridy = 0;
		infoPanelConstraints.weightx = 1.0;
		infoPanelConstraints.weighty = 0.70;
		
		infoPanel.add(mapPanel, infoPanelConstraints);
		
		infoPanelConstraints.gridx = 0;
		infoPanelConstraints.gridy = 1;
		infoPanelConstraints.weightx = 1.0;
		infoPanelConstraints.weighty = 1.0;
		
		infoPanel.add(statusPanel, infoPanelConstraints);
		
		frameConstraints.fill = GridBagConstraints.BOTH;
		frameConstraints.gridx = 1;
		frameConstraints.gridy = 0;
		frameConstraints.gridheight = 2;
		frameConstraints.weightx = 0.35;
		frameConstraints.weighty = 1.0;
		
		frame.add(infoPanel, frameConstraints);
		
	}

	private void createStatusPanel() {
		statusPanel = new JPanel();
		statusPanel.setLayout(new GridBagLayout());
		statusPanel.setBackground(Color.WHITE);
		
		strengthProgress = new JLabel(); 
		strengthProgress.setBackground(Color.BLUE);
		intelectProgress  = new JLabel();
		intelectProgress.setBackground(Color.DARK_GRAY);
		dexterityProgress  = new JLabel();
		dexterityProgress.setBackground(Color.DARK_GRAY);
		
		moralityProgress  = new JProgressBar(0, 40);

		statusPanel.setPreferredSize(statusPanel.getPreferredSize());
		
		GridBagConstraints statusPanelConstraints = new GridBagConstraints();
		statusPanelConstraints.fill = GridBagConstraints.NONE;
		statusPanelConstraints.gridx = 0;
		statusPanelConstraints.gridy = 0;
		statusPanelConstraints.weightx = 1.0;
		statusPanelConstraints.weighty = 1.0;
		
		statusPanel.add(strengthProgress, statusPanelConstraints);
		
		statusPanelConstraints.gridx = 0;
		statusPanelConstraints.gridy = 1;
		statusPanel.add(intelectProgress, statusPanelConstraints);
		
		statusPanelConstraints.gridx = 0;
		statusPanelConstraints.gridy = 2;
		statusPanel.add(dexterityProgress, statusPanelConstraints);
		
		statusPanelConstraints.gridx = 0;
		statusPanelConstraints.gridy = 3;
		statusPanel.add(moralityProgress, statusPanelConstraints);
		
	}

	private void createMapPanel() {
		mapPanel = new JPanel();
		mapPanel.setBackground(Color.BLACK);
		mapPanel.setPreferredSize(mapPanel.getPreferredSize());
		
		setMap("mapPlaceHolder.jpg");
		
		mapPanel.add(mapLabel);
	}

	private void createControlPanel() throws MalformedURLException, IOException {
		controlPanel = new JPanel();
		controlPanel.setLayout(new GridBagLayout());
		controlPanel.setBackground(Color.DARK_GRAY);
		
		controlPanel.setPreferredSize(controlPanel.getPreferredSize());
		
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
		choicePanel.setOpaque(false);
		
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
				theInteractions.setResponse(1);
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
				theInteractions.setResponse(2);
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
				theInteractions.setResponse(3);
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
				theInteractions.setResponse(4);
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

	protected void setChoices(String textOptionOne, String textOptionTwo, String textOptionThree, String textOptionFour) {
		choice1.setText(textOptionOne);
		choice2.setText(textOptionTwo);
		choice3.setText(textOptionThree);
		choice4.setText(textOptionFour);
	}

	protected void setPrompt(String inputPromptText) {
		promptText.setText(inputPromptText);
		promptPanel.revalidate();
		promptPanel.repaint();
	}

	protected void setArt(String pictureName){
		artPanel.removeAll();
		picLabel = new JLabel(new ImageIcon(loadImage(pictureName, 925, 400)));
		artPanel.add(picLabel);
		artPanel.revalidate();
		artPanel.repaint();
	}
	
	protected void setMap(String mapName){
		mapPanel.removeAll();
		mapLabel = new JLabel(new ImageIcon(loadImage(mapName, 325, 275)));
		mapPanel.add(mapLabel);
		mapPanel.revalidate();
		mapPanel.repaint();
		
	}
	
	public void setInteract(){
		theInteractions = main.theInteractions;
	}
	
	public void setPlayer(){
		thePlayer = main.thePlayer;
	}
	
	public void setStatus(){
		strengthProgress.setText("Strength: " + thePlayer.getStrength());
		strengthProgress.setBackground(Color.DARK_GRAY);
		intelectProgress.setText("Intelect: " + thePlayer.getIntelect());
		dexterityProgress.setText("Dexterity: " + thePlayer.getDexterity());
		moralityProgress.setValue(thePlayer.getMorality());
	}
	
	private void createPromptPanel() {
		promptPanel = new JPanel();
		promptPanel.setPreferredSize(promptPanel.getPreferredSize());
		promptPanel.setOpaque(false);
		
		promptText = new JTextArea("");
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
		
	private Image loadImage(String pictureName, int width, int height){
		ClassLoader loader = CodeJamUI.class.getClassLoader();
        String classLocationToString = loader.getResource("CodeJamUI.class").toString();
        String location = classLocationToString.substring(0, classLocationToString.length() - "CodeJamUI.class".length()) + pictureName;
        Image returnImage = null;
		try {
			returnImage = ImageIO.read(new URL(location)).getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		} catch (IOException e) {
			e.printStackTrace();
		}
        return returnImage;
	}
}
