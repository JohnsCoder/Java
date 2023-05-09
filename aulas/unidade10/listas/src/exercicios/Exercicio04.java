package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

     public static void main(String[] args) {
          Locale.setDefault(Locale.US);
          Scanner sc = new Scanner(System.in);
          System.out.print("Quantos numeros voce vao digitar? ");
          int[] arr = new int[sc.nextInt()];

          for (int i = 0; i < arr.length; i++) {
               System.out.print("Digite um numero: ");
               arr[i] = sc.nextInt();
          }
          int allPairs = 0;
          System.out.println("Numeros pares: ");
          for (int i = 0; i < arr.length; i++) {
               if (arr[i] % 2 == 0) {
                    System.out.printf("%d  ", arr[i]);
                    allPairs += 1;
               }
          }

          System.out.printf("%nQuantidade de Pares = %d", allPairs);
          sc.close();

     }
}
