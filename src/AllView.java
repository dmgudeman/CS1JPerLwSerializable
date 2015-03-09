import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


/**
 * This class creates a JFrame to takes search Text and search all media contained in the library.
 * When a button is activates it navigates to a JFrame that is specific to a
 * media type or a JFrame that addresses the entire list.
 * Version 1 Dominick Scottolini
 */
public class AllView extends JFrame implements ActionListener {
	// set constants for the frame
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 200;
	private static final int FRAME_X_ORIGIN = 150;
	private static final int FRAME_Y_ORIGIN = 250;

	// initialize the elements in the frame
	private JTextField AllSearch;
	private JButton AllAddButton;
	private JButton AllDeleteButton;
	private JLabel AllPrompt;
	private JTextField AllOutput;
	private JButton AllBackButton;

	/**
	 * Non parameterized constructor for this class, creates a JFrame and places
	 * buttons in the frame
	 */
	public AllView() {
		// creates frame
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
		setResizable(false);
		this.setLayout(new FlowLayout());

		// declares the elements in the frame
		
		AllAddButton = new JButton("ADD Media");
		AllDeleteButton = new JButton("DELETE Media");
		AllBackButton = new JButton("BACK");
		AllPrompt = new JLabel("My Library");
		AllOutput = new JTextField("");
		AllSearch = new JTextField("                              ");
		// adds the initialized elements to the frame
		this.add(AllSearch);
		this.add(AllPrompt);
		this.add(AllAddButton);
		this.add(AllDeleteButton);
		this.add(AllBackButton);
		// this.add(bookOutput);
		this.setVisible(true);
		
		// adds ActionListener to buttons and search bar
		AllSearch.addActionListener(this);
		AllAddButton.addActionListener(this);
		AllDeleteButton.addActionListener(this);
		AllBackButton.addActionListener(this);

		// makes frame visible and exits on close
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	/**
	 * Performs method specific to an event triggered by a specific button
	 */
	// @Override
	public void actionPerformed(ActionEvent e) 
	{
		// if statement to clarify action event

		
		if( e.getSource() == AllDeleteButton)
		{
			System.out.println("Deleting Media");
			DeleteSubView myDeleteSubViewAll = new DeleteSubView();
		}
		
		if(e.getSource() == AllBackButton)
		 {
			 System.out.println("Returing to Home Screen");
			 MediaView thisMediaView = new MediaView();
		 }
		

	}

}
