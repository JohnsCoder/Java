package exercicios;

import java.util.Scanner;

public class Exercicio02 {

     public static String getQuadrante(String x, String y) {

          if (x == "" && y == "") {
               return "";
          }
          if (Float.parseFloat(x) > 0) {
               if (Float.parseFloat(y) > 0) {
                    return "Primeiro";
               } else {
                    return "Quarto";
               }
          } else {
               if (Float.parseFloat(y) > 0) {
                    return "Segundo";
               } else {
                    return "Terceiro";
               }
          }
     }

     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          String x = "x";
          String y = "y";
          
          
          while (!x.equals("") && !y.equals("")) {
               System.out.println("Dê as coordenadas para encontrar o quandrante: ");
               System.out.print("Cordenada X: ");
               x = sc.nextLine();
               System.out.print("Cordenada Y: ");
               y = sc.nextLine();
               System.out.println(getQuadrante(x, y));
               
          }

          // do {
          //      System.out.print("Cordenada X: ");
          //      x = sc.nextLine();
          //      System.out.print("Cordenada Y: ");
          //      y = sc.nextLine();
          //      System.out.println(getQuadrante(x, y));
          // } while (!x.equals("") && !y.equals(""));

          sc.close();
     }
}
