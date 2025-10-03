import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {



        // Being main CLI loop, only ends if user inputs 0 to exit

        System.out.println("Currently loaded catalog from catalog.csv:");
        MediaParser.listItems();
        System.out.println();
        printOptions();

        Scanner scanner = new Scanner(System.in);

        while (scanner.nextLine() != "0") {
            switch (scanner.next()) {
                case "1":
                    MediaParser.listItems();
                    printOptions();
                    break;
                case "2":
                    MediaParser.addItem();
                    printOptions();
                    break;
                case "3":
                    MediaParser.saveCatalogCSV();
                    printOptions();
                    break;
                case "4":
                    MediaParser.exportCatalogBIN();
                    printOptions();
                    break;
                case "5":
                    printOptions();
                    break;
                case "0":
                    System.out.println("Exiting the Media Catalog. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void printOptions() {
        System.out.println("1. List all the items in the catalog");
        System.out.println("2. Add a new item to the catalog (Book, Movie, or Album)");
        System.out.println("3. Save the current catalog to the file");
        System.out.println("4. Export the catalog to a binary file");
        System.out.println("5. List the options again.");
        System.out.println("0. Exit");
    }
}