package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
     public static void main(String[] args) {
          Locale.setDefault(Locale.US);
          Scanner sc = new Scanner(System.in);
          System.out.print("Quantos numeros voce vao digitar? ");
          double[] arr = new double[sc.nextInt()];

          for (int i = 0; i < arr.length; i++) {
               System.out.print("Digite um numero: ");
               arr[i] = sc.nextDouble();
          }
          double greaterNumber = 0;
          int greaterNumberPosition = 0;
          for (int i = 0; i < arr.length; i++) {
               if (greaterNumber < arr[i]) {
                    greaterNumber = arr[i];
                    greaterNumberPosition = i;
               }
               greaterNumber = greaterNumber > arr[i] ? greaterNumber: arr[i];

          }
          System.out.printf("Maior Valor = %.2f%n",greaterNumber);
          System.out.printf("Posicao do maior valor = %d",greaterNumberPosition);
          sc.close();
     }
}
