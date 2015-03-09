import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


/**
 * This class creates a JFrame to takes search Text and search the video Class.
 * When a button is activates it navigates to a JFrame that is specific to a
 * media type or a JFrame that addresses the entire list.
 * Version 1 David Gudeman
 * Version 2 Dominick Scottolini
 */
public class VideoView extends JFrame implements ActionListener {
	// set constants for the frame
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 200;
	private static final int FRAME_X_ORIGIN = 150;
	private static final int FRAME_Y_ORIGIN = 250;

	// initialize the elements in the frame
	private JTextField videoSearch;
	private JButton videoAddButton;
	private JButton videoDeleteButton;
	private JButton videoBackButton;
	private JLabel videoPrompt;
	private JTextField videoOutput;

	/**
	 * Non parameterized constructor for this class, creates a JFrame and places
	 * buttons in the frame
	 */
	public VideoView() {
		// creates frame
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
		setResizable(false);
		this.setLayout(new FlowLayout());

		// declares the elements in the frame
		
		videoAddButton = new JButton("ADD Video");
		videoDeleteButton = new JButton("DELETE Video");
		videoBackButton = new JButton("BACK");
		videoPrompt = new JLabel("My Videos");
		videoOutput = new JTextField("");
		videoSearch = new JTextField("                              ");

		// adds the initialized elements to the frame
		this.add(videoSearch);
		this.add(videoPrompt);
		this.add(videoAddButton);
		this.add(videoDeleteButton);
		this.add(videoBackButton);
		// this.add(videoOutput);
		this.setVisible(true);
		
		// adds ActionListener to buttons and search bar
		videoSearch.addActionListener(this);
		videoAddButton.addActionListener(this);
		videoDeleteButton.addActionListener(this);
		videoBackButton.addActionListener(this);

		this.setVisible(true);

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
		if( e.getSource() == videoAddButton)
		{
			System.out.println("Adding a new Video");
			AddSubViewVideo myAddSubViewVideo = new AddSubViewVideo();
		}
		
		if( e.getSource() == videoDeleteButton)
		{
			System.out.println("Deleting Video");
			DeleteSubView myDeleteSubViewVideo = new DeleteSubView();
		}
		
		if(e.getSource() == videoBackButton)
		 {
			System.out.println("Returing to Home Screen");
			MediaView thisMediaView = new MediaView();
		 }

	}

}
