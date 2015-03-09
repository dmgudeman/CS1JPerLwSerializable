import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


/**
 * This class creates a JFrame to takes search Text and search the Book Class.
 * When a button is activates it navigates to a JFrame that is specific to a
 * media type or a JFrame that addresses the entire list.
 * Version 1 David Gudeman
 * Version 2 Dominick Scottolini
 */
public class BookView extends JFrame implements ActionListener {
	// set constants for the frame
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 200;
	private static final int FRAME_X_ORIGIN = 150;
	private static final int FRAME_Y_ORIGIN = 250;

	// initialize the elements in the frame
	private JTextField bookSearch;
	private JButton bookAddButton;
	private JButton bookDeleteButton;
	private JLabel bookPrompt;
	private JTextField bookOutput;
	private JButton bookBackButton;
	

	/**
	 * Non parameterized constructor for this class, creates a JFrame and places
	 * buttons in the frame
	 */
	public BookView() {
		// creates frame
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
		setResizable(false);
		this.setLayout(new FlowLayout());

		// declares the elements in the frame
		
		bookAddButton = new JButton("ADD Book");
		bookDeleteButton = new JButton("DELETE Book");
		bookPrompt = new JLabel("My Books");
		bookBackButton = new JButton("BACK");
		bookOutput = new JTextField("");
		bookSearch = new JTextField("                              ");
		// adds the initialized elements to the frame
		this.add(bookSearch);
		this.add(bookPrompt);
		this.add(bookAddButton);
		this.add(bookDeleteButton);
		this.add(bookBackButton);
		// this.add(bookOutput);
		this.setVisible(true);
		
		// adds ActionListener to buttons and search bar
		bookSearch.addActionListener(this);
		bookAddButton.addActionListener(this);
		bookDeleteButton.addActionListener(this);
		bookBackButton.addActionListener(this);
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
		if( e.getSource() == bookAddButton)
		{
			System.out.println("Adding a new Book");
			AddSubViewBook myAddSubViewBook = new AddSubViewBook();
		}
		
		if( e.getSource() == bookDeleteButton)
		{
			System.out.println("Deleting Book");
			DeleteSubView myDeleteSubViewBook = new DeleteSubView();
		}
		
		if(e.getSource() == bookBackButton)
		 {
			 System.out.println("Returing to Home Screen");
			 MediaView thisMediaView = new MediaView();
		 }
		

	}

}
