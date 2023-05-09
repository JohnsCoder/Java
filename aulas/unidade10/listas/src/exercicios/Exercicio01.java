package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {
     public static void main(String[] args) {
          Locale.setDefault(Locale.US);
          Scanner sc = new Scanner(System.in);
          System.out.print("Quantos numeros voce vao digitar? ");
          int[] arr = new int[sc.nextInt()];

          for (int i = 0; i < arr.length; i++) {
               System.out.print("Digite um numero: ");
               arr[i] = sc.nextInt();
          }
          System.out.println("Numeros negativos: ");
          for (int i = 0; i < arr.length; i++) {
               if (arr[i] < 0) {
                    System.out.println(arr[i]);
               }
          }
          sc.close();
     }
}
