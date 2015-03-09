import java.util.ArrayList;

/**
 * This class controls the operation of the media library list program.
 * 
 * Version 1: Author Shmuel
 * 
 */
public class MyController {

	public static void main(String[] args) {
		
		//MediaView myMediaView = new MediaView();
		
		
		// ContactList directoryList;
		// directoryList = new ContactList();
		int menuOptionSelection;
		ConsoleView consoleView;
		consoleView = new ConsoleView();
		MediaLibrary mediaLibrary;
		mediaLibrary = new MediaLibrary();
		MediaLibrary tempMediaLibrary;
		tempMediaLibrary = new MediaLibrary();
		MediaLibrary tempMediaLibrary1;
		tempMediaLibrary1 = new MediaLibrary();
		Book newBook = new Book();
		Song newSong = new Song();
		Video newVideo = new Video();
		VideoGame newVideoGame = new VideoGame();
		String mediaType;
		String mediaTitle;
		Boolean deletionConfirmation = false;
		Disk diskHandler = new Disk();
		mediaLibrary = diskHandler.getDiskFileObject();

		menuOptionSelection = 1; // just to ensure we get into the while loop
		while (menuOptionSelection != 0) {
			menuOptionSelection = consoleView.displayMenu();

			switch (menuOptionSelection) {
			case 1:
				System.out.println("Adding a new book to the libraty");
				newBook=consoleView.getBookInfo();
				mediaLibrary.addMedia((Media) newBook);
				break;
			case 2:
				System.out.println("Adding a new song to the libraty");
				newSong=consoleView.getSongInfo();
				mediaLibrary.addMedia((Media) newSong);
				break;
			case 3:
				System.out.println("Adding a new video to the libraty");
				newVideo=consoleView.getVideoInfo();
				mediaLibrary.addMedia((Media) newVideo);
				break;
			case 4:
				System.out.println("Adding a new video game to the libraty");
				newVideoGame=consoleView.getVideoGameInfo();
				mediaLibrary.addMedia((Media) newVideoGame);
				break;

			case 5:
				System.out.println("Printing the whole library");
				System.out.println(mediaLibrary);
				break;
			case 6:
				System.out.println("Printing media of specific type");
				mediaType = consoleView.getTypeOfMedia();
				tempMediaLibrary=mediaLibrary.getLibraryByType(mediaType);
				System.out.println(tempMediaLibrary);
				break;
			case 7:
				System.out.println("Printing media of specific title");
				mediaTitle = consoleView.getTitleOfMedia();
				tempMediaLibrary=mediaLibrary.getLibraryByTitle(mediaTitle);
				System.out.println(tempMediaLibrary);
				break;
			case 8:
				System.out
						.println("Printing the media of a specific type & title");
				mediaType = consoleView.getTypeOfMedia();
				tempMediaLibrary=mediaLibrary.getLibraryByType(mediaType);
				mediaTitle = consoleView.getTitleOfMedia();
				tempMediaLibrary1=tempMediaLibrary.getLibraryByTitle(mediaTitle);
				System.out.println(tempMediaLibrary1);
				break;
			case 9:
				System.out
						.println("Deleting an entry from the Personal Library.");
				consoleView.requestDeletionParameters();
				mediaType = consoleView.getTypeOfMedia();
				tempMediaLibrary=mediaLibrary.getLibraryByType(mediaType);
				mediaTitle = consoleView.getTitleOfMedia();
				tempMediaLibrary1=tempMediaLibrary.getLibraryByTitle(mediaTitle);
				deletionConfirmation = consoleView
						.requestDeletionConfirmation();
				System.out.println(tempMediaLibrary1);
				if (deletionConfirmation) {
					mediaLibrary.deleteEntries(mediaType, mediaTitle);
				}
				break;
			default:
				System.out
						.println("Thank you for using our media library progeram");
			}

		}
		
		diskHandler.writeToDisk(mediaLibrary);
		System.out.println("Exiting library program");
		System.exit(0);
	}

}
/**
 * 
 ** Please see below the output of our run **
 ********************************************
 
Retrieved Media Library from hard disk

Enter 1 to add a new book to the library
Enter 2 to add a new song to the library
Enter 3 to add a new video to the library
Enter 4 to add a new video game to the library
Enter 5 to print the content of the library
Enter 6 to print all media of a certain type
Enter 7 to print all media with a certain title
Enter 8 to print all media  of a specific type & title
Enter 9 to delete media
Enter other number to exit the application
1
Adding a new book to the libraty
Obtaining author's name
Obtaining format
Obtaining location
Obtaining title
Obtaining notes
Done populating the book info
Added media to library

Enter 1 to add a new book to the library
Enter 2 to add a new song to the library
Enter 3 to add a new video to the library
Enter 4 to add a new video game to the library
Enter 5 to print the content of the library
Enter 6 to print all media of a certain type
Enter 7 to print all media with a certain title
Enter 8 to print all media  of a specific type & title
Enter 9 to delete media
Enter other number to exit the application
2
Adding a new song to the libraty
Obtaining artist name
Obtaining format
Obtaining location
Obtaining title
Obtaining notes
Obtaining genre
Done populating the song info
Added media to library

Enter 1 to add a new book to the library
Enter 2 to add a new song to the library
Enter 3 to add a new video to the library
Enter 4 to add a new video game to the library
Enter 5 to print the content of the library
Enter 6 to print all media of a certain type
Enter 7 to print all media with a certain title
Enter 8 to print all media  of a specific type & title
Enter 9 to delete media
Enter other number to exit the application
3
Adding a new video to the libraty
Obtaining star name
Obtaining format
Obtaining location
Obtaining title
Obtaining notes
Done populating the song info
Added media to library

Enter 1 to add a new book to the library
Enter 2 to add a new song to the library
Enter 3 to add a new video to the library
Enter 4 to add a new video game to the library
Enter 5 to print the content of the library
Enter 6 to print all media of a certain type
Enter 7 to print all media with a certain title
Enter 8 to print all media  of a specific type & title
Enter 9 to delete media
Enter other number to exit the application
4
Adding a new video game to the libraty
Obtaining format
Obtaining location
Obtaining title
Obtaining notes
Done populating the video game info
Added media to library

Enter 1 to add a new book to the library
Enter 2 to add a new song to the library
Enter 3 to add a new video to the library
Enter 4 to add a new video game to the library
Enter 5 to print the content of the library
Enter 6 to print all media of a certain type
Enter 7 to print all media with a certain title
Enter 8 to print all media  of a specific type & title
Enter 9 to delete media
Enter other number to exit the application
5
Printing the whole library
Library as a printable string

Enter 1 to add a new book to the library
Enter 2 to add a new song to the library
Enter 3 to add a new video to the library
Enter 4 to add a new video game to the library
Enter 5 to print the content of the library
Enter 6 to print all media of a certain type
Enter 7 to print all media with a certain title
Enter 8 to print all media  of a specific type & title
Enter 9 to delete media
Enter other number to exit the application
6
Printing media of specific type
Please enter media type
 Method populates temp library with elements of a specific type
Library as a printable string

Enter 1 to add a new book to the library
Enter 2 to add a new song to the library
Enter 3 to add a new video to the library
Enter 4 to add a new video game to the library
Enter 5 to print the content of the library
Enter 6 to print all media of a certain type
Enter 7 to print all media with a certain title
Enter 8 to print all media  of a specific type & title
Enter 9 to delete media
Enter other number to exit the application
7
Printing media of specific title
Please enter media title
 Method populates temp library with elements of a specific title
Library as a printable string

Enter 1 to add a new book to the library
Enter 2 to add a new song to the library
Enter 3 to add a new video to the library
Enter 4 to add a new video game to the library
Enter 5 to print the content of the library
Enter 6 to print all media of a certain type
Enter 7 to print all media with a certain title
Enter 8 to print all media  of a specific type & title
Enter 9 to delete media
Enter other number to exit the application
8
Printing the media of a specific type & title
Please enter media type
 Method populates temp library with elements of a specific type
Please enter media title
 Method populates temp library with elements of a specific title
Library as a printable string

Enter 1 to add a new book to the library
Enter 2 to add a new song to the library
Enter 3 to add a new video to the library
Enter 4 to add a new video game to the library
Enter 5 to print the content of the library
Enter 6 to print all media of a certain type
Enter 7 to print all media with a certain title
Enter 8 to print all media  of a specific type & title
Enter 9 to delete media
Enter other number to exit the application
9
Deleting an entry from the Personal Library.
Please enter deletion parameters
Please enter media type
 Method populates temp library with elements of a specific type
Please enter media title
 Method populates temp library with elements of a specific title
Please enter "Y" to confirm deletion of these media element(s):
Library as a printable string
Deleted specific entries from the media library

Enter 1 to add a new book to the library
Enter 2 to add a new song to the library
Enter 3 to add a new video to the library
Enter 4 to add a new video game to the library
Enter 5 to print the content of the library
Enter 6 to print all media of a certain type
Enter 7 to print all media with a certain title
Enter 8 to print all media  of a specific type & title
Enter 9 to delete media
Enter other number to exit the application
0
Thank you for using our media library progeram
Saving Media Library to hard disk
Exiting library program

**/