package aplication;
import java.util.Scanner;

public class ProgramaIterativo {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int celcius ;
          char init = 's';
          
          while (init == 's') {
               System.out.println("Insira um temperatura em celcius, para saber seu equivalente em Fareheint!");
               celcius = sc.nextInt();
               System.out.printf("%d fareheint.%n", celcius * 9 / 5 + 32);
               System.out.print("Deseja repetir (s/n)? ");
               init = sc.next().charAt(0);
          }
          sc.close();
          
     }
}
