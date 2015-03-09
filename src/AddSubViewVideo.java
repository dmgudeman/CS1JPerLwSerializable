


/**
 * Contains a GUI View for an interface that allows you to add a new video entry based on title, format, location, notes,
 and star
 * Author Dominick Scottolini
 * 
<<<<<<< HEAD
=======
 * 
>>>>>>> e5d69dd67718c233c7b81d5a02501092a2a4a192
 */
 
import javax.swing.*;   

import java.awt.event.*;     
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddSubViewVideo extends JFrame implements ActionListener
													
{	
	// create a frame
	private static final int FRAME_WIDTH = 400;
	private static final int FRAME_HEIGHT = 350;
	private static final int FRAME_X_ORIGIN = 150;
	private static final int FRAME_Y_ORIGIN = 200;
	
	// declare variables needed 
	private JLabel videoprompt;
	private JButton addButton;
	private JButton addVideoHomeButton;
	private JButton addVideoBackButton;
	private JTextField title;
	private JTextField format;
	private JTextField location;
	private JTextField notes;
	private JTextField star;
	private JLabel titlePrompt;
	private JLabel formatPrompt;
	private JLabel locationPrompt;
	private JLabel notesPrompt;
	private JLabel starPrompt;
	/**
	 * constructor instantiates widgets and adds them to the Frame
	 */
	public AddSubViewVideo() 
	{
		//creates frame
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setResizable(false);
		setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
		this.setLayout(new FlowLayout());
		
		// declares the elements in the frame
		videoprompt = new JLabel("Add New Video Entry");
		titlePrompt = new JLabel("Enter title of Video: ");
		formatPrompt = new JLabel("Enter format of Video: ");
		locationPrompt = new JLabel("Enter location of Video: ");
		notesPrompt = new JLabel("Enter notes for Video: ");
		starPrompt = new JLabel("Enter star of Video: ");
		title = new JTextField("                              ");
		format = new JTextField("                              ");
		location = new JTextField("                              ");
		notes = new JTextField("                              ");
		star = new JTextField("                              ");
		addButton = new JButton("          Add Video            ");
		addVideoHomeButton = new JButton("            HOME            ");
		addVideoBackButton = new JButton("            BACK            ");
		// adds the initialized elements to the frame
		
		this.add(videoprompt);
		this.add(addButton);
		this.add(titlePrompt);
		this.add(title);
		this.add(formatPrompt);
		this.add(format);
		this.add(locationPrompt);
		this.add(location);
		this.add(notesPrompt);
		this.add(notes);		
		this.add(starPrompt);
		this.add(star);
		this.add(addVideoHomeButton);
		this.add(addVideoBackButton);
		this.setVisible(true);
		
		// add action listeners
		addButton.addActionListener(this);
		addVideoHomeButton.addActionListener(this);
		addVideoBackButton.addActionListener(this);
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
			if(e.getSource() == addVideoHomeButton)
			 {
				 System.out.println("Returing to Home Screen");
				 MediaView thisMediaView = new MediaView();
			 }
			
			if(e.getSource() == addVideoBackButton)
			 {
				 System.out.println("Returing to previous Screen");
				 VideoView myVideoView = new VideoView();
			 }
		}	
		
		

		
		
		



		
		
		
		
		
		
	
	


}


