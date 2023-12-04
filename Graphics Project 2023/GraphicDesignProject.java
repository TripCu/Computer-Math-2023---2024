import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.*;
//import javax.swing.JFrame;
//import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GraphicDesignProject extends JPanel {

	public static final int CLEAR_SCREEN = -1;
	public static final int WIDTH = 500;
	public static final int HEIGHT = 500;

	public String[] buttonNames = {"Vertical Lines", "Horizontal Lines", 
			"Diagonal Lines", "Corner", 
			"Web: Top-Right", "Web: Top-Left",
			"Web: Center", "Starburst",
			"Vertical Bars", "Triangles",
			"Bullseye", "Checkerboard",
			"Dots", "Pacman",
			"American Flag", "Bricks",
			"Pizza", "Pencil"};

	private int buttonRows = buttonNames.length / 2;

	//private JPanel screenPanel;
	private GraphicImage screen;
	private JLabel captionText;

	private JPanel screenPanel;  // consists of a border layout with screen and caption
	private JPanel buttonPanel;
	private JPanel buttonSubPanel;


	public GraphicDesignProject() {

		// Create a panel for the Screen and Caption
		screenPanel = new JPanel();
		screenPanel.setLayout(new BorderLayout());
		screenPanel.setPreferredSize(new Dimension(500, 600));
		add(screenPanel);

		// Create a panel for the buttons and clear button
		buttonPanel = new JPanel();
		buttonPanel.setPreferredSize(new Dimension(300, 600));

		buttonSubPanel = new JPanel(new BorderLayout());
		buttonSubPanel.setLayout(new GridLayout(buttonRows, 2));
		buttonSubPanel.setPreferredSize(new Dimension(300, 500));
		buttonPanel.add(buttonSubPanel);
		add(buttonPanel);

		
		drawScreen(WIDTH, HEIGHT);
		
		drawCaptionText("Click a Button");

		drawButtons(140, 20);
		drawClearButton(300, 50);



	}


	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}


	/**
	 * Draws the screen.
	 * @param width the width of the screen
	 * @param height the height of the screen
	 */
	private void drawScreen(int width, int height) {
		screen = new GraphicImage();
		screenPanel.add(screen, BorderLayout.CENTER);
	}


	/**
	 * Creates the caption text
	 * @param caption the phrase to appear as the caption
	 */
	private void drawCaptionText(String caption) {

		captionText = new JLabel(caption);
		captionText.setFont(new Font("Arial", Font.BOLD, 40));
		screenPanel.add(captionText, BorderLayout.SOUTH);

	}


	/**
	 * Creates all the buttons in two columns
	 * @param width the width of each button
	 * @param height the height of each button
	 */
	private void drawButtons(int width, int height) {

		JButton[] buttons = new JButton[buttonNames.length];
	
		// Create each button
		for (int i = 0; i < buttons.length; i++) {
			
			buttons[i] = new JButton(buttonNames[i]);
			buttons[i].setPreferredSize(new Dimension(width, height));
			buttons[i].addActionListener(new ButtonListener(i));
			buttonSubPanel.add(buttons[i]);
		}





	}


	/**
	 * Draws the Clear button at the specified width and height
	 * @param width the width of the button
	 * @param height the height of the button
	 */
	private void drawClearButton(int width, int height) {
		JButton clearButton = new JButton("Clear Screen");
		clearButton.setPreferredSize(new Dimension(width, height));
		clearButton.addActionListener(new ClearListener());
		buttonPanel.add(clearButton);

	}



	/**
	 * The picture is drawn form the button that is clicked.  
	 * The caption changes to describe the picture drawn.
	 * @author DPOLAND
	 * 
	 */
	private class ButtonListener implements ActionListener {

		private int buttonName;

		public ButtonListener (int name) {
			buttonName = name;
		}

		public void actionPerformed(ActionEvent e) {
			screen.setPictureName(buttonName);
			captionText.setText(buttonNames[buttonName]);
		}
	}


	/**
	 * Clears the screen to a black background
	 * @author DPOLAND
	 *
	 */
	private class ClearListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			clearScreen(WIDTH, HEIGHT);
		}
	}

	/**
	 * Clears the screen to a black background
	 * @param width the width of the screen
	 * @param height the height of the screen
	 */
	public void clearScreen(int width, int height) {
		screen.setPictureName(CLEAR_SCREEN);		
	}



	public static void main(String[] args) {
		JFrame frame = new JFrame("Graphic Design Project");
		frame.setSize(850, 700);
		frame.setLocation(0, 0);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new GraphicDesignProject());
		frame.setVisible(true);

	}

}
