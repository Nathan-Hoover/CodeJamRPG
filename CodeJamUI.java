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
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.OverlayLayout;

public class CodeJamUI {
	JFrame frame;
	JPanel artPanel, infoPanel, controlPanel, promptPanel, choicePanel, controlBackground;
	JScrollPane promptScroll;
	JLabel choice1, choice2, choice3, choice4, picLabel;
	JTextArea promptText;
	GridBagConstraints frameConstraints, controlConstraints;
	
	public CodeJamUI() throws MalformedURLException, IOException{
		createFrame();
		createArtPanel();
		createControlPanel();
		createInfoPanel();
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
		
		setArt("test.jpg");
		
		artPanel.add(picLabel);
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

	protected void setArt(String pictureName){
		picLabel = new JLabel(new ImageIcon(loadImage(pictureName, 945, 500)));
	}
	
	private void createPromptPanel() {
		promptPanel = new JPanel();
		promptPanel.setPreferredSize(promptPanel.getPreferredSize());
		promptPanel.setOpaque(false);
		
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
		
	private Image loadImage(String pictureName, int width, int height){
		ClassLoader loader = CodeJamUI.class.getClassLoader();
        String classLocationToString = loader.getResource("CodeJamUI.class").toString();
        String location = classLocationToString.substring(0, classLocationToString.length() - "CodeJamUI.class".length()) + pictureName;
        Image returnImage = null;
		try {
			returnImage = ImageIO.read(new URL(location)).getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return returnImage;
	}
}
