import java.io.Serializable;

/**
 * One object of class Book holds information about one Media object. This
 * subclass extends Media Class. Adds parameters author and Book type to the
 * Media class information . Version 1: Author DG. Version 2: Shmuel added non
 * parameterized constructor.
 * Version 3: Shmuel added implements Serializable
 */
public class Book extends Media implements Serializable{

	private String author;

	/**
	 * Constructor utilizing the Media Superclass constructor with parameters:
	 * title location, format and notes. It adds parameters author and Book
	 * type. Author DG
	 */
	public Book(String title, String location, String format, String notes,
			String author) {
		super(title, location, format, notes, "Book");
		this.author = author;

	}

	/**
	 * 
	 * Non Parameterized constructor //Added by Shmuel
	 */
	public Book() {

		this("none", "none", "none", "none", "none");

	}

	// Getters and setters DG
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * Returns a String containing all the data stored in this object. DG Shmuel
	 * replaces getters with the parameter name.
	 */
	public String toString() {
		String result = super.toString() + "Author: " + author + "\n";
		return result;
	}

}
