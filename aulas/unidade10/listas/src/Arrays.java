import java.util.Locale;
import java.util.Scanner;

public class Arrays {
     public static void main(String[] args) {
          Locale.setDefault(Locale.US);
          Scanner sc = new Scanner(System.in);
          System.out.print("Determine uma quantidade de pessoas: ");
          int n = sc.nextInt();
          double[] vect = new double[n];
          for (int i = 0; i < n; i++) {
               System.out.print("Insira uma altura: ");
               vect[i] = sc.nextDouble();
          }

          double sum = 0;
          for (int i = 0; i < n; i++) {
               sum += vect[i];
          }
          System.out.printf("Average height = %.2f", sum / n);
          sc.close();
     }
}
