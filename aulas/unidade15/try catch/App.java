
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String[] vect = sc.nextLine().split(" ");
        try {
        int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch ( ArrayIndexOutOfBoundsException err) {
            System.out.println("Invalid position!");
        }

        catch (InputMismatchException err) {
            System.out.println("input error");
        }

        System.out.println("End of program!");
        sc.close();
    }
}
