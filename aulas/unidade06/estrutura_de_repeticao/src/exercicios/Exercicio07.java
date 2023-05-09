package exercicios;

import java.util.Scanner;

public class Exercicio07 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int time;
          float divisor;
          float dividendo;
          System.out.print("Número de execuções: ");
          time = sc.nextInt();
          for (int i = 0; i < time; i++) {
               System.out.print("Dividendo: ");
               dividendo = sc.nextFloat();
               System.out.print("Divisor: ");
               divisor = sc.nextFloat();
               if (divisor == 0) {
                    System.out.println("Divisão Impossível!");
               } else {

                    System.out.println(dividendo / divisor);
               }
          }
     }
}
