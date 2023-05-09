package exercicios;
import java.util.Scanner;

public class Exercicio01 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          float num;
          System.out.println("Digite um número para saber se é negativo: ");
          num = sc.nextFloat();
          sc.close();

          if (num >= 0) {
               System.out.println("é positivo");
          } else {
               System.out.println("é negativo");
          }
     }
}