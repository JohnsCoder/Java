package exercicios;

import java.util.Scanner;

public class Exercicio07 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          float x;
          float y;
          System.out.println("Insira as coordenadas:");
          System.out.print("X: ");
          x = sc.nextFloat();
          System.out.print("Y: ");
          y = sc.nextFloat();
          sc.close();
          if (y == 0 && x == 0) {
               System.out.println("Origem");
          } else {

               if (x > 0) {

                    if (y > 0) {
                         System.out.println("Q1");
                    } else {
                         System.out.println("Q4");
                    }
               } else {
                    if (y > 0) {
                         System.out.println("Q2");
                    } else {
                         System.out.println("Q3");
                    }
               }

          }

     }
}
