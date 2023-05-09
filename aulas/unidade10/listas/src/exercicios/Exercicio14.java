package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 {
     public static void main(String[] args) {
          Locale.setDefault(Locale.US);
          Scanner sc = new Scanner(System.in);
          int squareLength = sc.nextInt();
          int[][] arr = new int[squareLength][squareLength];

          
          for (int i = 0; i < squareLength; i++) {
               
               for (int j = 0; j < squareLength ; j++) {
                    arr[i][j] = sc.nextInt();
               }
          }
          
          System.out.println("Main diagonal: ");
          for (int i = 0; i < squareLength; i++) {
               
               System.out.printf("%d ", arr[i][i]);
          }

          int negativeNumbers = 0;
          for (int i = 0; i < squareLength; i++) {
               
               for (int j = 0; j < squareLength ; j++) {
                    if (arr[i][j] < 0) {
                         negativeNumbers += 1;
                    }
               }
          }

          System.out.printf("%nNegative numbers = %d", negativeNumbers);

          sc.close();
     }
}
