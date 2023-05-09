package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Composition {
     public static void main(String[] args) {
          DateTimeFormatter contractDateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
          DateTimeFormatter incomeDateTimeFormatter = DateTimeFormatter.ofPattern("MM/yyyy");
          Scanner sc = new Scanner(System.in);

          System.out.print("Enter department's name: ");
          Department department = new Department(sc.nextLine());
          System.out.println("Enter worker data: ");
          System.out.print("Name: ");
          String workerName = sc.nextLine();
          System.out.print("Level: ");
          WorkerLevel workerLevel = WorkerLevel.valueOf(sc.nextLine());
          System.out.print("Base salary: ");
          double baseSalary = sc.nextDouble(); 

          Worker worker = new Worker(workerName, workerLevel, baseSalary, department);

          System.out.print("How many contracts to this worker? ");
          int contractsCount = sc.nextInt();

          for (int i = 0; i < contractsCount; i++) {
               sc.nextLine();
               System.out.printf("%nEnter contract #%d data:%n", i + 1);
               System.out.print("Date (DD/MM/YYYY): ");
               LocalDate dateContract = LocalDate.parse(sc.nextLine(), contractDateTimeFormatter);
               System.out.print("Value per hour: ");
               double valuePerHour = sc.nextDouble();
               System.out.print("Duration (hours): ");
               int hours = sc.nextInt();
               
               worker.addContract(new HourContract(dateContract, valuePerHour, hours));
               
          }
          sc.nextLine();

          System.out.print("Enter a year to calculate income (MM/YYYY): ");
          LocalDate dateIncome = LocalDate.parse("01/"+ sc.nextLine(), contractDateTimeFormatter);

          System.out.printf("%nName: %s%n", worker.getName());
          System.out.printf("Department: %s%n", worker.getDepartment().getName());
          System.out.println("Income for " + dateIncome.format(incomeDateTimeFormatter) + ": " + worker.income(dateIncome.getYear(), dateIncome.getMonthValue()));

          sc.close();
     }
}
