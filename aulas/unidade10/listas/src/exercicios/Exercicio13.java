package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import utils.Employes;

public class Exercicio13 {
     public static void main(String[] args) {
          Locale.setDefault(Locale.US);
          Scanner sc = new Scanner(System.in);
          System.out.print("how many employes will be registered? ");
          int employesCount = sc.nextInt();
          List<Employes> arr = new ArrayList<>();
          for (int i = 0; i < employesCount; i++) {
               System.out.printf("Emplyoee #%d:%n", i + 1);
               System.out.print("Id: ");
               int id = sc.nextInt();
               System.out.print("Name: ");
               sc.nextLine();
               String name = sc.nextLine();
               System.out.print("Salary: ");
               double salary = sc.nextDouble();
               arr.add(new Employes(id, name, salary));
               sc.nextLine();

          }

          System.out.print("Enter the employee id that will have salary increase: ");
          int employeeId = sc.nextInt();
          System.out.print("Enter the percentage: ");
          double salaryRaise = sc.nextDouble();

          arr.stream().filter(e -> e.getId() == employeeId).collect(Collectors.toList()).get(0).PayRaise(salaryRaise);

          System.out.println("List of employees: ");
          for (Employes e : arr) {
               System.out.printf("%d, %s, %.2f%n", e.getId(), e.getName(), e.getSalary());
          }

          sc.close();
     }
}
