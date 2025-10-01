import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {


        try (BufferedReader in = new BufferedReader(new FileReader("catalog.csv"))) {
            if (in.readLine() != null) {
                while (in.readLine() != null) {
                    System.out.println(in.readLine());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}