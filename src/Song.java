import java.io.Serializable;

/**
 * One object of Song Type class and holds information about one Media object.
 * This subclass extends Media Class. Adds parameters artist, genre and Song
 * type to the Media class information Version 1: Author DG Version 2: Shmuel
 * added non parameterized constructor
 * Version 3: Shmuel added implements Serializable
 */
public class Song extends Media implements Serializable{

	private String artist;
	private String genre;

	/**
	 * Constructor utilizing the Media Superclass constructor with parameters:
	 * title location, format and notes. It adds parameters artist, genre and
	 * type. Author DG
	 */
	public Song(String title, String location, String format, String notes,
			String artist, String genre) {
		super(title, location, format, notes, "Song");
		this.artist = artist;
		this.genre = genre;

	}

	/**
	 * Non parameterized Constructor added by Shmuel
	 */
	public Song() {
		this("none", "none", "none", "none", "none", "none");

	}

	// getters and setters for subclass, DG
	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	/**
	 * Returns a String containing all the data stored in this object. It
	 * utilizes the superClass toString method. Author DG. Shmuel replaced the
	 * getters with the instance variables
	 */

	public String toString() {
		String result = super.toString() + "Artist: " + artist + "\nGenre: "
				+ genre + "\n";
		return result;
	}
}
