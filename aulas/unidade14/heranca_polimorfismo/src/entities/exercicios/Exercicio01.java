package entities.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Exercicio01 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

          List<Employee> employees = new ArrayList<>();

          System.out.print("Enter the number os employees: ");
          int employeesCount = sc.nextInt();

          for (int i = 0; i < employeesCount; i++) {
               sc.nextLine();

               System.out.printf("%nEmployee #%d data:%n", i + 1);
               System.out.print("Outsourced (y/n)? ");
               char isOutSourced = sc.nextLine().charAt(0);
               System.out.print("Name: ");
               String name = sc.nextLine();
               System.out.print("Hours: ");
               int hours = sc.nextInt();
               System.out.print("Value per hour: ");
               double valuePerHour = sc.nextDouble();
               if (isOutSourced == 'y') {
                    System.out.print("Additional charge: ");
                    double aditionalCharge = sc.nextDouble();
                    Employee outsourEmployee = new OutsourcedEmployee(name, hours, valuePerHour, aditionalCharge);
                    employees.add(outsourEmployee);
               } else {
                    Employee employee = new Employee(name, hours, valuePerHour);
                    employees.add(employee);

               }
          }
          System.out.println("\nPAYMENTS:");
          for (Employee e : employees) {
               System.out.println(e);
          }

          sc.close();
     }
}
