package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio15 {
     public static void main(String[] args) {
          Locale.setDefault(Locale.US);
          Scanner sc = new Scanner(System.in);
          int x = sc.nextInt();
          int y = sc.nextInt();
          int[][] arr = new int[x][y];

          for (int i = 0; i < x; i++) {

               for (int j = 0; j < y; j++) {
                    arr[i][j] = sc.nextInt();
               }
          }

          int num = sc.nextInt();
          int numCount = 0;
          for (int i = 0; i < x; i++) {

               for (int j = 0; j < y; j++) {
                    if (arr[i][j] == num) {
                         numCount += 1;
                    }
               }
          }

          int[][] pos = new int[2][numCount];

          int matrixIndex = 0;
          for (int i = 0; i < x; i++) {
               for (int j = 0; j < y; j++) {
                    if (arr[i][j] == num) {
                         pos[0][matrixIndex] = i;
                         pos[1][matrixIndex] = j;
                         matrixIndex += 1;
                    }
               }
          }

          for (int i = 0; i < numCount; i++) {
               int coluna = pos[i][1];
               int linha = pos[i][0];
               System.out.printf("Position %d, %d:%n", pos[i][0], pos[i][1]);
               if (coluna > 0) {
                    System.out.printf("Left: %d%n", arr[pos[i][0]][pos[i][1] - 1]);

               }

               if (coluna < y - 1) {
                    System.out.printf("Right: %d%n", arr[pos[i][0]][pos[i][1] + 1]);

               }

               if (linha > 0) {
                    System.out.printf("Up: %d%n", arr[pos[i][0] - 1][pos[i][1]]);

               }

               if (linha < x - 1) {
                    System.out.printf("Down: %d%n", arr[pos[i][0] + 1][pos[i][1]]);

               }
          }
          // for (int i = 0; i < x + y; i++) {

          // System.out.printf("%d ", arr[i][i]);
          // }

          sc.close();
     }
}
