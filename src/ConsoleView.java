import java.util.Scanner;
/**
 * Methods of this class interact with the user. This is implementation of the Viewer in the MVC paradigm.
 * We will attempt to replace this viewer by a JFrame viewer.
 * @author 
 * Version 1: author Shmuel
 *
 */
public class ConsoleView {
	/**
	 * Method prompts the viewer to select media library function
	 * 
	 * @return
	 */
	public static int displayMenu() {

		Scanner console = new Scanner(System.in);
		System.out.println();
		System.out.println("Enter 1 to add a new book to the library");
		System.out.println("Enter 2 to add a new song to the library");
		System.out.println("Enter 3 to add a new video to the library");
		System.out.println("Enter 4 to add a new video game to the library");
		System.out.println("Enter 5 to print the content of the library");
		System.out.println("Enter 6 to print all media of a certain type");
		System.out.println("Enter 7 to print all media with a certain title");
		System.out
				.println("Enter 8 to print all media  of a specific type & title");
		System.out.println("Enter 9 to delete media");
		System.out.println("Enter other number to exit the application");
		String input = console.nextLine();
		int selection = Integer.parseInt(input);
		return selection;
	}

	/**
	 * Method populates book object with info entered by the user 
	 * 
	 * @param 
	 * @return Book object populated with user entered info
	 */

	public static Book getBookInfo() {
		Book book = new Book();
		String inputString = "";
		// Scanner console;
		// console = new Scanner(inputString);
		book.setAuthor(getAuthor());
		book.setFormat(getFormat());
		book.setLocation(getLocation());
		book.setTitle(getTitle());
		book.setNotes(getNotes());
		System.out.println("Done populating the book info");
		return book;

	}

	/**
	 * Method populates song object with info entered by the user.
	 *  @return Song object  populated with user entered info
	 * 
	 */

	public static Song getSongInfo() {
		Song song = new Song();
		String inputString = "";
		// Scanner console;
		// console = new Scanner(inputString);
		song.setArtist(getArtist());
		song.setFormat(getFormat());
		song.setLocation(getLocation());
		song.setTitle(getTitle());
		song.setNotes(getNotes());
		song.setGenre(getGenre());
		System.out.println("Done populating the song info");
		return song;

	}

	/**
	 * Method populates video object with info entered by the user.
	 * 
	 */

	public static Video  getVideoInfo() {
		Video video = new Video();
		String inputString = "";
		// Scanner console;
		// console = new Scanner(inputString);
		video.setStar(getStar());
		video.setFormat(getFormat());
		video.setLocation(getLocation());
		video.setTitle(getTitle());
		video.setNotes(getNotes());
		System.out.println("Done populating the song info");
		return  video;
	}

	/**
	 * Method populates video game object with info entered by the user.
	 * 
	 */

	public static VideoGame  getVideoGameInfo() {
		VideoGame newVideoGame = new VideoGame();
		String inputString = "";
		// Scanner console;
		// console = new Scanner(inputString);
		newVideoGame.setFormat(getFormat());
		newVideoGame.setLocation(getLocation());
		newVideoGame.setTitle(getTitle());
		newVideoGame.setNotes(getNotes());
		System.out.println("Done populating the video game info");
		return  newVideoGame;
	}

	/**
	 * method reads star name from console and returns the corresponding string
	 * 
	 * @return
	 */
	public static String getStar() {
		String star = "";
		System.out.println("Obtaining star name");
		return star;
	}

	/**
	 * method reads song genre from console and returns the corresponding string
	 * 
	 * @return
	 */
	public static String getGenre() {
		String genre = "";
		System.out.println("Obtaining genre");
		return genre;
	}

	/**
	 * method reads Artist name from console and returns the corresponding
	 * string
	 * 
	 * @return
	 */
	public static String getArtist() {
		String artist = "";
		System.out.println("Obtaining artist name");

		return artist;
	}

	/**
	 * Method returns user's input regarding type of media
	 */
	public static String getTypeOfMedia() {
		String mediaType = "";
		System.out.println("Please enter media type");
		return mediaType;
	}

	/**
	 * Method returns user's input regarding title of media
	 */
	public static String getTitleOfMedia() {
		String mediaTitle = "";
		System.out.println("Please enter media title");
		return mediaTitle;
	}

	/**
	 * Method requests confirmation for deleting media elements from library
	 */
	public static boolean requestDeletionConfirmation() {
		Boolean requestApproved = true;
		System.out
				.println("Please enter \"Y\" to confirm deletion of these media element(s):");
		return requestApproved;
	}

	/**
	 * Method informs user that deletion parameters will be requested
	 */
	public static void requestDeletionParameters() {
		System.out.println("Please enter deletion parameters");
	}

	/**
	 * method reads title from console and returns the corresponding string
	 * 
	 * @return
	 */
	public static String getTitle() {
		String title = "";
		System.out.println("Obtaining title");

		return title;
	}

	/**
	 * method reads location from console and returns the corresponding string
	 * 
	 * @return
	 */
	public static String getLocation() {
		String location = "";
		System.out.println("Obtaining location");

		return location;
	}

	/**
	 * method reads format from console and returns the corresponding string
	 * 
	 * @return
	 */
	public static String getFormat() {
		String format = "";
		System.out.println("Obtaining format");

		return format;
	}

	/**
	 * method reads notes from console and returns the corresponding string
	 * 
	 * @return
	 */
	public static String getNotes() {
		String notes = "";
		System.out.println("Obtaining notes");

		return notes;
	}

	/**
	 * method reads author name from console and returns the corresponding
	 * string
	 * 
	 * @return
	 */
	public static String getAuthor() {
		String author = "";
		System.out.println("Obtaining author's name");
		return author;
	}
}
