import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        File file = new File("C:\\Temp\\in.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException err) {
            System.out.println("Error opening file: " + err.getMessage());

        } finally {
            System.out.println("finally block executed!");
            if (sc != null) {
                sc.close();
            }
        }
    }   
}
