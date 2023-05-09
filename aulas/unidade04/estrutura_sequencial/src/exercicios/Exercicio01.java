import java.util.Scanner;

public class Exercicio01 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int x;
          int y;
          System.out.println("Insira dois números!");
          System.out.print("Primeiro número: ");
          x = sc.nextInt();
          System.out.print("Segundo número: ");
          y = sc.nextInt();
          System.out.printf("A soma dos dois números é: %d", x + y);
          sc.close();
     }
}