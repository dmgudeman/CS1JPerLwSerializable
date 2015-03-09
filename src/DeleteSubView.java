/**
 * Contains a GUI View for an interface that allows the user to search media by title, and delete the selected content
 * Author Dominick Scottolini
 * 
 */
 
import javax.swing.*;   

import java.awt.event.*;     
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteSubView extends JFrame implements ActionListener
													
{	
	// create a frame
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 200;
	private static final int FRAME_X_ORIGIN = 150;
	private static final int FRAME_Y_ORIGIN = 250;
	
	// declare variables needed 
	private JLabel prompt;
	private JLabel titlePrompt;
	private JTextField search;
	private JTextField title;
	private JButton searchButton;
	private JButton deleteButton;

	
	
	/**
	 * constructor instantiates widgets and adds them to the Frame
	 */
	public DeleteSubView() 
	{
		//creates frame
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setResizable(false);
		setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
		this.setLayout(new FlowLayout());
		
		// declares the elements in the frame
		prompt = new JLabel("             Delete Menu         ");
		
		title = new JTextField("                              ");
		search = new JTextField("    ");
 searchButton = new JButton("                Search           ");
 deleteButton = new JButton("                Delete           ");
		
	
		// adds the initialized elements to the frame
		this.add(prompt);
	
		this.add(title);
		this.add(searchButton);
		this.add(deleteButton);
		
		this.setVisible(true);
		
		// add action listeners
		searchButton.addActionListener(this);
		deleteButton.addActionListener(this);
		
		// makes frame visible and exits on close
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	
	}
		
	/**
	 * performs action based on incoming event triggered by specific button
	 */
		// @Override
		public void actionPerformed(ActionEvent e) 
		{
				// conditional if statement to clarify action event
				
		}	
		
		

		
		
		



		
		
		
		
		
		
	
	


}

