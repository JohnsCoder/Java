package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
     public static void main(String[] args) {
          Locale.setDefault(Locale.US);
          Scanner sc = new Scanner(System.in);
          System.out.print("Quantos numeros voce vao digitar? ");
          double[] arr = new double[sc.nextInt()];

          for (int i = 0; i < arr.length; i++) {
               System.out.print("Digite um numero: ");
               arr[i] = sc.nextDouble();
          }
          double sum = 0;
          System.out.print("Valores = ");
          for (int i = 0; i < arr.length; i++) {
               System.out.printf("%.2f ",arr[i]);
               sum += arr[i];
          }
          System.out.printf("%nSoma = %.2f %n", sum);
          System.out.printf("Media = %.2f", sum / arr.length);
          sc.close();
     }
}
