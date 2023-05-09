
import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
     public static void main(String[] args) {
          Locale.setDefault(Locale.US);
          Scanner sc = new Scanner(System.in);
          float radx;
          System.out.println("Calcular circunferência do circulo.");
          System.out.print("Insira o Comprimento do raio: ");
          radx = sc.nextFloat();
          System.out.printf("A circunferência do circulo é: %.4f", 3.14159 * Math.pow( radx, 2));
          sc.close();
     }
}
