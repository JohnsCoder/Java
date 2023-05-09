import java.util.Scanner;

public class Exercicio04 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int id;
          float hours;
          float hourPrice;
          System.out.println("Calc salary, based on, worked hours!");
          System.out.print("ID number: ");
          id = sc.nextInt();
          System.out.print("Worked hours: ");
          hours = sc.nextInt();
          System.out.print("Earning by hour: ");
          hourPrice = sc.nextInt();
          System.out.printf("ID: %d.%nSalary: U$ %.2f", id, hours * hourPrice);
          sc.close();
     }
}
