import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


/**
 * This class creates a JFrame to takes search Text and search the Song Class.
 * When a button is activates it navigates to a JFrame that is specific to a
 * media type or a JFrame that addresses the entire list.
 * Version 1 David Gudeman
 * Version 2 Dominick Scottolini
 */
public class SongView extends JFrame implements ActionListener {
	// set constants for the frame
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 200;
	private static final int FRAME_X_ORIGIN = 150;
	private static final int FRAME_Y_ORIGIN = 250;

	// initialize the elements in the frame
	private JTextField songSearch;
	private JButton songAddButton;
	private JButton songDeleteButton;
	private JButton songBackButton;
	private JButton songTextField;
	private JLabel songPrompt;
	private JTextField songOutput;


	/**
	 * Non parameterized constructor for this class, creates a JFrame and places
	 * buttons in the frame
	 */
	public SongView() {
		// creates frame
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
		setResizable(false);
		this.setLayout(new FlowLayout());

		// declares the elements in the frame
		
		songPrompt = new JLabel("My Songs");
		songAddButton = new JButton("ADD Song");
		songDeleteButton = new JButton("DELETE Song");
		songBackButton = new JButton("BACK");
		songOutput = new JTextField("");
		songSearch = new JTextField("                              ");

		// adds the initialized elements to the frame
		
		this.add(songSearch);
		this.add(songPrompt);
		this.add(songAddButton);
		this.add(songDeleteButton);
		this.add(songBackButton);
	   //  this.add(songOutput);
		this.setVisible(true);

		// adds ActionListener to buttons and search bar
		songSearch.addActionListener(this);
		songAddButton.addActionListener(this);
		songDeleteButton.addActionListener(this);
		songBackButton.addActionListener(this);

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
		if( e.getSource() == songAddButton)
		{
			System.out.println("Adding a new Song");
			AddSubViewSong myAddSubViewSong = new AddSubViewSong();
		}
		
		if( e.getSource() == songDeleteButton)
		{
			System.out.println("Deleting Song");
			DeleteSubView myDeleteSubViewSong = new DeleteSubView();
		}
		
		if(e.getSource() == songBackButton)
		 {
			 System.out.println("Returing to Home Screen");
			 MediaView thisMediaView = new MediaView();
		 }
		

	}

}
