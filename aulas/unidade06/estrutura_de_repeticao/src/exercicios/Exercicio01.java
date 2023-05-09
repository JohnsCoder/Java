
import java.util.Scanner;

public class Exercicio01 {
     public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          String password ;
          System.out.print("Insira a senha: ");
          password = input.nextLine();
          while (!password.equals("2002")) {
               System.out.println("Senha incorreta!");
               password = input.nextLine();
          }
          System.out.println("Senha Correta!");
          input.close();
     }
}
