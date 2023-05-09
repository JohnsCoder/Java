
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        method1();
        System.out.println("End of program!");
    }
    public static void method1() {
        System.out.println("method 1 start");
        method2();
        System.out.println("method 1 end");
    }

    public static void method2() {
        System.out.println("method 2 start");
        Scanner sc = new Scanner(System.in);
        String[] vect = sc.nextLine().split(" ");
        try {
        int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch ( ArrayIndexOutOfBoundsException err) {
            System.out.println("Invalid position!");
            err.printStackTrace();
            sc.next();
        }

        catch (InputMismatchException err) {
            System.out.println("input error");
        }
        sc.close();
        System.out.println("method 2 end");

    }
}
