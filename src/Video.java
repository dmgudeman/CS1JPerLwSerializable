import java.io.Serializable;

/**
 * One object of Video Type class and holds information about one Media object.
 * This subclass extends Media Class. Adds parameters star and Video type
 * information. Version 1: Author DG. Version 2: Shmuel added non parameterized
 * constructor. Changed "author" to "star".
 * Version 3: Shmuel Added implements Serializable
 */
public class Video extends Media implements Serializable{
	private String star;

	/**
	 * Constructor utilizing the Media Superclass constructor with parameters:
	 * title location, format and notes. It adds parameters star and Video type.
	 * Author DG
	 */
	public Video(String title, String location, String format, String notes,
			String star) {
		super(title, location, format, notes, "Video");
		this.star = star;
	}

	/**
	 * Non Parameterized Constructor Author Shmuel
	 */
	public Video() {
		this("none", "none", "none", "none", "none");

	}

	// getters and setters. DG
	public String getStar() {
		return star;
	}

	public void setStar(String star) {
		this.star = star;
	}

	/**
	 * Returns a String containing all the data stored in this object. It
	 * utilizes the superClass toString method. DG
	 */

	public String toString() {
		String result = super.toString() + "Author: " + this.getStar() + "\n";
		return result;
	}

}
