import java.io.Serializable;

/**
 * One object of VidoeGame Type class and holds information about one Media object. 
 * This subclass extends Media Class. 
 * Adds parameters VideoGame type to the Media class information.
 * Version 1: Author DG  
 * Version 2: Shmuel added non parameterized constructor
 * VCErsion 3: Shmuel added non parameterized constructor
 */
public class VideoGame extends Media implements Serializable{


	
	/**
	 * Constructor utilizing the Media Superclass constructor with parameters: title
	 * location, format and notes.  It adds parameters VideoGame type.
	 * Author DG
	 */
	public VideoGame(String title, String location, String format, String notes) {
		super(title, location, format, notes, "VideoGame");
	}

	
	/**
	 * non parameterized constructor 
	 * Author Shmuel
	 */
	public VideoGame() {
		this("none", "none", "none", "none");
	}


	/**
	* Returns a String containing all the data stored in this object.
    */

    public String toString()
    {
        String result = super.toString() + "\n";
        return result;
    }	
    
}

