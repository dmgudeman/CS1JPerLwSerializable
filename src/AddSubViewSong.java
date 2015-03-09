/**
 * Contains a GUI View for an interface that allows you to add a new book entry based on title, format, location, notes,
 * artist and genre 
 * Author Dominick Scottolini
 * 
 */
 
import javax.swing.*;   

import java.awt.event.*;     
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddSubViewSong extends JFrame implements ActionListener
													
{	
	// create a frame
	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_HEIGHT = 350;
	private static final int FRAME_X_ORIGIN = 150;
	private static final int FRAME_Y_ORIGIN = 200;
	
	// declare variables needed 
	private JLabel songprompt;
	private JButton addButton;
	private JButton addSongHomeButton;
	private JButton addSongBackButton;
	private JTextField title;
	private JTextField format;
	private JTextField location;
	private JTextField notes;
	private JTextField artist;
	private JTextField genre;
	private JLabel titlePrompt;
	private JLabel formatPrompt;
	private JLabel locationPrompt;
	private JLabel notesPrompt;
	private JLabel artistPrompt;
	private JLabel genrePrompt;
	/**
	 * constructor instantiates widgets and adds them to the Frame
	 */
	public AddSubViewSong() 
	{
		//creates frame
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setResizable(false);
		setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
		this.setLayout(new FlowLayout());
		
		// declares the elements in the frame
		songprompt = new JLabel("Add New Song Entry");
		titlePrompt = new JLabel("Enter title of Song: ");
		formatPrompt = new JLabel("Enter format of Song: ");
		locationPrompt = new JLabel("Enter location of Song: ");
		notesPrompt = new JLabel("Enter notes for Song: ");
		artistPrompt = new JLabel("Enter artist of Song: ");
		genrePrompt = new JLabel("Enter genre of Song: ");
		title = new JTextField("                              ");
		format = new JTextField("                              ");
		location = new JTextField("                              ");
		notes = new JTextField("                              ");
		artist = new JTextField("                              ");
		genre = new JTextField("                              ");
		addButton = new JButton("          Add Song            ");
		addSongHomeButton = new JButton("            HOME            ");
		addSongBackButton = new JButton("            BACK            ");
		
		
		
		
	
		// adds the initialized elements to the frame
		
		this.add(songprompt);
		this.add(addButton);
		this.add(titlePrompt);
		this.add(title);
		this.add(formatPrompt);
		this.add(format);
		this.add(locationPrompt);
		this.add(location);
		this.add(notesPrompt);
		this.add(notes);		
		this.add(artistPrompt);
		this.add(artist);
		this.add(genrePrompt);
		this.add(genre);
		this.add(addSongHomeButton);
		this.add(addSongBackButton);
		this.setVisible(true);
		
		// add action listeners
		addButton.addActionListener(this);
		addSongHomeButton.addActionListener(this);
		addSongBackButton.addActionListener(this);
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
				// triggers add method
			if(e.getSource() == addSongHomeButton)
			 {
				 System.out.println("Returing to Home Screen");
				 MediaView thisMediaView = new MediaView();
			 }
			
			if(e.getSource() == addSongBackButton)
			 {
				 System.out.println("Returing to previous Screen");
				 SongView mySongView = new SongView();
			 }
				
		}	
		
		

		
		
		



		
		
		
		
		
		
	
	


}


