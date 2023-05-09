import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
     public static void main(String[] args) {
          Locale.setDefault(Locale.US);
          Scanner sc = new Scanner(System.in);
          double a;
          double b;
          double c;
          System.out.println("Cálculos geométricos!");
          System.out.print("Valor A: ");
          a = sc.nextDouble();
          System.out.print("Valor B: ");
          b = sc.nextDouble();
          System.out.print("Valor C: ");
          c = sc.nextDouble();
          System.out.printf("TRIANGULO: %.3f%n", a * c / 2);
          System.out.printf("CIRCULO: %.3f%n", 3.14159 * Math.pow(c, 2));
          // BASE 1: A
          // BASE 2: B
          // ALTURA : C
          System.out.printf("TRAPÉZIO: %.3f%n", (b * c) + ((a - b) * c) / 2);
          System.out.printf("QUADRADO: %.3f%n", Math.pow(b, 2));
          System.out.printf("RETANGULO: %.3f%n", a * b);
          sc.close();

     }
}
