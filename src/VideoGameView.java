import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


/**
 * This class creates a JFrame to takes search Text and search the VideoGame
 * Class. When a button is activates it navigates to a JFrame that is specific
 * to a media type or a JFrame that addresses the entire list.
 * Version 1 David Gudeman
 * Version 2 Dominick Scottolini
 */
public class VideoGameView extends JFrame implements ActionListener {
	// set constants for the frame
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 200;
	private static final int FRAME_X_ORIGIN = 150;
	private static final int FRAME_Y_ORIGIN = 250;

	// initialize the elements in the frame
	private JTextField videoGameSearch;
	private JButton videoGameAddButton;
	private JButton videoGameDeleteButton;
	private JButton videoGameBackButton;
	private JLabel videoGamePrompt;
	private JTextField videoGameOutput;

	/**
	 * Non parameterized constructor for this class, creates a JFrame and places
	 * buttons in the frame
	 */
	public VideoGameView() {
		// creates frame
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
		setResizable(false);

		this.setLayout(new FlowLayout());

		// declares the elements in the frame
		
		videoGameAddButton = new JButton("ADD Game");
		videoGameDeleteButton = new JButton("DELETE Game");
		videoGamePrompt = new JLabel("My Video Games");
		videoGameBackButton = new JButton("BACK");
		videoGameOutput = new JTextField("");
		videoGameSearch = new JTextField("                              ");

		// adds the initialized elements to the frame
		this.add(videoGameSearch);
		this.add(videoGamePrompt);
		this.add(videoGameAddButton);
		this.add(videoGameDeleteButton);
		this.add(videoGameBackButton);
		// this.add(videoGameOutput);
		this.setVisible(true);
		
		// adds ActionListener to buttons and search bar
		videoGameSearch.addActionListener(this);
		videoGameAddButton.addActionListener(this);
		videoGameDeleteButton.addActionListener(this);
		videoGameBackButton.addActionListener(this);

		// makes frame visible and exits on close
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	/**
	 * Performs method specific to an event triggered by a specific button
	 */
	// @Override
	public void actionPerformed(ActionEvent e) {
		// if statement to clarify action event
		if( e.getSource() == videoGameAddButton)
		{
			System.out.println("Adding a new Video");
			AddSubViewVideoGame myAddSubViewVideoGame = new AddSubViewVideoGame();
		}
		
		if( e.getSource() == videoGameDeleteButton)
		{
			System.out.println("Deleting Game");
			DeleteSubView myDeleteSubViewVideoGame = new DeleteSubView();
		}
		
		if(e.getSource() == videoGameBackButton)
		 {
			 System.out.println("Returing to Home Screen");
			 MediaView thisMediaView = new MediaView();
		 }


	}

}
