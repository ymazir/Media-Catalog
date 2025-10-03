import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * MediaParser class handles operations related to media items such as listing,
 * adding, saving, and exporting items in different formats.
 */
public class MediaParser {

    /**
     * Constructor for MediaParser.
     */
    public MediaParser() {

    }
    /**
    * Lists all items in the catalog by reading from "catalog.csv".
     * If the file does not exist, it informs the user.
     */
    public static void listItems() {
        try (BufferedReader in = new BufferedReader(new FileReader("catalog.csv"))) {
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist yet, you must add an item to create it.");;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Adds a new item (Book, Movie, or Album) to the catalog by prompting the user for details.
     * The new item is appended to "catalog.csv".
     *
     * @throws IOException if an I/O error occurs
     */
    public static void addItem() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What type of item would you like to add? (Book, Movie, or Album)");
        String itemType = scanner.nextLine();


        // begins the thing change this thing later bruh

        if (itemType.equalsIgnoreCase("book")) {
            System.out.println("Enter the title of the book:");
            String title = scanner.nextLine();
            System.out.println("Enter the author of the book:");
            String author = scanner.nextLine();
            System.out.println("Enter the year of publication:");
            String year = scanner.nextLine();
            System.out.println("Enter the number of pages:");
            String pageCount = scanner.nextLine();

            Book newBook = new Book(0, title, author, Integer.parseInt(year), Integer.parseInt(pageCount));
            System.out.println("New book added: " + newBook.summary());

            try (java.io.PrintWriter out = new java.io.PrintWriter(new java.io.BufferedWriter(new java.io.FileWriter("catalog.csv", true)))) {
                out.println(newBook.summary());
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else if (itemType.equalsIgnoreCase("movie")) {
            System.out.println("Enter the title of the movie:");
            String title = scanner.nextLine();
            System.out.println("Enter the director of the movie:");
            String director = scanner.nextLine();
            System.out.println("Enter the year of release:");
            String year = scanner.nextLine();
            System.out.println("Enter the runtime in minutes:");
            String runtimeMinutes = scanner.nextLine();

            Movie newMovie = new Movie(0, title, director, Integer.parseInt(year), Integer.parseInt(runtimeMinutes));
            System.out.println("New movie added: " + newMovie.summary());
            try (java.io.PrintWriter out = new java.io.PrintWriter(new java.io.BufferedWriter(new java.io.FileWriter("catalog.csv", true)))) {
                out.println(newMovie.summary());
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else if (itemType.equalsIgnoreCase("album")) {
            System.out.println("Enter the title of the album:");
            String title = scanner.nextLine();
            System.out.println("Enter the artist of the album:");
            String artist = scanner.nextLine();
            System.out.println("Enter the year of release:");
            String year = scanner.nextLine();
            System.out.println("Enter the number of tracks:");
            String trackCount = scanner.nextLine();

            Album newAlbum = new Album(0, title, artist, Integer.parseInt(year), Integer.parseInt(trackCount));
            System.out.println("New album added: " + newAlbum.summary());
            try (java.io.PrintWriter out = new java.io.PrintWriter(new java.io.BufferedWriter(new java.io.FileWriter("catalog.csv", true)))) {
                out.println(newAlbum.summary());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Invalid item type. Please enter Book, Movie, or Album.");
        }
    }

    /**
     * "saves" the catalog, in reality the catalog is saved with every addition of an item.
     */
    public static void saveCatalogCSV() {
        System.out.println("Catalog automatically saves after each addition!");
    }

    /**
     * Exports the current catalog from "catalog.csv" to a binary file "catalog.bin".
     * Reads all lines from the CSV file, stores them in an ArrayList, and writes
     * the ArrayList to the binary file.
     */
    public static void exportCatalogBIN() {
        ArrayList<String> temp = new ArrayList<String>();

        // Read all lines from catalog.csv and store them in temp
        try(BufferedReader in = new BufferedReader(new FileReader("catalog.csv"))) {
            String line;
            while ((line = in.readLine()) != null) {
                temp.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Write all lines from temp to catalog.bin
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("catalog.bin"))) {
            out.writeObject(temp);
            System.out.println("Catalog exported to catalog.bin");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
