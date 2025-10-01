import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {


        try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("catalog.csv")))) {
            out.println("bhhh");
            out.println("97");
            out.println("98");
            out.println("hello");

        } catch (IOException e) {
            e.printStackTrace();
        }

        //System.out.println("Welcome to the Media Catalog!");
        //System.out.println("Please choose an option:");
        //System.out.println("1. List all the items in the catalog");
        //System.out.println("2. Add a new item to the catalog (Book, Movie, or Album)");
        //System.out.println("3. Save the current catalog to the file");
        //System.out.println("4. Export the catalog to a binary file");
        //System.out.println("5. List the options again.");
        //System.out.println("0. Exit");


       MediaParser.listItems();

        MediaParser.addItem();

        MediaParser.addItem();

        MediaParser.addItem();








        try (BufferedReader in = new BufferedReader(new FileReader("catalog.csv"))) {
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}