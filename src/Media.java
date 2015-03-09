import java.io.Serializable;
import java.util.List;

/**
 * One Object of this class represents media object which is identified by
 * title. It contains information location, format and notes. This is the
 * SuperClass that provides basic information common to all Media Types. Version
 * 1: Author DG 
 * Version 2: Shmuel added non parameterizes constructor. Took out
 * references to type and searchable text
 * Version 3: Shmuel Added implements Serializable
 */

// variables holding basic information that all media types have in common DG
public class Media implements Serializable{
	private String title;
	private String location;
	private String format;
	private String notes;
	private String type;

	/**
	 * Constructor that takes all four identifiers for this class: title,
	 * location, format and notes notes. Needs at least a null string in each of
	 * the parameters. Should not take a null string for title. Author DG
	 */
	public Media(String title, String location, String format, String notes,
			String newType) {
		this.title = title;
		this.location = location;
		this.format = format;
		this.notes = notes;
		this.type = newType;
	}

	/**
	 * Non parameterized Constructor Author Shmuel
	 */
	public Media() {
		this("None", "None", "None", "None", "None");
	}

	/*
	 * Type getter
	 */
	public String getType() {
		return type;
	}

	/*
	 * Type setter
	 */
	public void setType(String newType) {
		this.type = newType;
	}

	/*
	 * Title getter
	 */
	public String getTitle() {
		return title;
	}

	/*
	 * Title setter
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/*
	 * location getter
	 */
	public String getLocation() {
		return location;
	}

	/*
	 * location setter
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/*
	 * format getter
	 */
	public String getFormat() {
		return format;
	}

	/*
	 * format setter
	 */
	public void setFormat(String format) {
		this.format = format;
	}

	/*
	 * notes getter
	 */
	public String getNotes() {
		return notes;
	}

	/*
	 * notes setter
	 */
	public void setNotes(String notes) {
		this.notes = notes;
	}

	/**
	 * Returns a String containing all the data stored in this object. Author
	 * DG. Shmuel removed getters and replaced them with the instance variables
	 */

	public String toString() {
		String result = "Title: " + title + "\nLocation: " + location
				+ "\nFormat: " + format + "\ntype: " + type + "\nNotes: "
				+ notes + "\n";
		return result;
	}

}
