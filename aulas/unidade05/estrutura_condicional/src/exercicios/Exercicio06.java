package exercicios;

import java.util.Scanner;

public class Exercicio06 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          float value;
          System.out.println("Insira um valor, para saber seu intervalo!");
          value = sc.nextFloat();
          sc.close();
          if (value >= 0 && value < 25) {
               System.out.println("Intervalo [0,25]");
               return;
          } 
          if (value >= 25 && value < 50) {
               System.out.println("Intervalo [25,50]");
               return;
          }
          if (value >= 75 && value < 100) {
               System.out.println("Intervalo [75,100]");
               return;
          }
          System.out.println("Fora do Intervalo!");
          
     }
}
