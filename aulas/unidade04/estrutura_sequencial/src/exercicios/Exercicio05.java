import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
     public static void main(String[] args) {
          Locale.setDefault(Locale.US);
          Scanner sc = new Scanner(System.in);
          int productID1;
          int productID2;
          int productAmount1;
          int productAmount2;
          float productValue1;
          float productValue2;
          System.out.println("Calculate products value!");
          System.out.print("ID product 1: ");
          productID1 = sc.nextInt();
          System.out.print("Amount product 1: ");
          productAmount1 = sc.nextInt();
          System.out.print("Value product 1: ");
          productValue1 = sc.nextFloat();
          System.out.print("ID product 2: ");
          productID2 = sc.nextInt();
          System.out.print("Amount product 2: ");
          productAmount2 = sc.nextInt();
          System.out.print("Value product 2: ");
          productValue2 = sc.nextFloat();
          System.out.printf("The total value are: U$ %.2f",
                    (productAmount1 * productValue1) + (productAmount2 * productValue2));

     }
}
