/**
 * Contains a GUI View for an interface that allows you to add a new book entry based on title, format, location, notes, 
and author
 * Author Dominick Scottolini
 * 
 */
 
import javax.swing.*;   

import java.awt.event.*;     
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddSubViewBook extends JFrame implements ActionListener
													
{	
	// create a frame
	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_HEIGHT = 350;
	private static final int FRAME_X_ORIGIN = 150;
	private static final int FRAME_Y_ORIGIN = 200;
	
	// declare variables needed 
	private JLabel bookprompt;
	private JButton addButton;
	private JButton addBookHomeButton;
	private JButton addBookBackButton;
	private JTextField title;
	private JTextField format;
	private JTextField location;
	private JTextField notes;
	private JTextField author;
	private JLabel titlePrompt;
	private JLabel formatPrompt;
	private JLabel locationPrompt;
	private JLabel notesPrompt;
	private JLabel authorPrompt;
	/**
	 * constructor instantiates widgets and adds them to the Frame
	 */
	public AddSubViewBook() 
	{
		//creates frame
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setResizable(false);
		setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
		this.setLayout(new FlowLayout());
		
		// declares the elements in the frame
		bookprompt = new JLabel("Add New Book Entry");
		titlePrompt = new JLabel("Enter title of Book: ");
		formatPrompt = new JLabel("Enter format of Book: ");
		locationPrompt = new JLabel("Enter location of Book: ");
		notesPrompt = new JLabel("Enter notes for Book: ");
		authorPrompt = new JLabel("Enter author of Book: ");
		title = new JTextField("                              ");
		format = new JTextField("                              ");
		location = new JTextField("                              ");
		notes = new JTextField("                              ");
		author = new JTextField("                              ");
		addButton = new JButton("          Add Book            ");
		addBookHomeButton = new JButton("            HOME            ");
		addBookBackButton = new JButton("            BACK            ");
		// adds the initialized elements to the frame
		this.add(bookprompt);
		this.add(addButton);
		this.add(titlePrompt);
		this.add(title);
		this.add(formatPrompt);
		this.add(format);
		this.add(locationPrompt);
		this.add(location);
		this.add(notesPrompt);
		this.add(notes);		
		this.add(authorPrompt);
		this.add(author);
		this.add(addBookHomeButton);
		this.add(addBookBackButton);
		this.setVisible(true);
		
		// add action listeners
		addButton.addActionListener(this);
		addBookHomeButton.addActionListener(this);
		addBookBackButton.addActionListener(this);
		
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
			if(e.getSource() == addBookHomeButton)
			 {
				 System.out.println("Returing to Home Screen");
				 MediaView thisMediaView = new MediaView();
			 }
			
			if(e.getSource() == addBookBackButton)
			 {
				 System.out.println("Returing to previous Screen");
				 BookView myBookView = new BookView();
			 }
				
		}	
		
		

		
		
		



		
		
		
		
		
		
	
	


}


