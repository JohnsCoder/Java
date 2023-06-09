package entities;

import java.util.ArrayList;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
     private String name;
     private WorkerLevel level;
     private double baseSalary;

     private Department department;
     private List<HourContract> contracts = new ArrayList<>();

     public Worker() {
     }

     public Worker(String name, WorkerLevel level, double baseSalary, Department department) {
          this.name = name;
          this.level = level;
          this.baseSalary = baseSalary;
          this.department = department;

     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public WorkerLevel getLevel() {
          return level;
     }

     public void setLevel(WorkerLevel level) {
          this.level = level;
     }

     public Double getBaseSalary() {
          return baseSalary;
     }

     public void setBaseSalary(Double baseSalary) {
          this.baseSalary = baseSalary;
     }

     public Department getDepartment() {
          return department;
     }

     public void setDepartment(Department department) {
          this.department = department;
     }

     public List<HourContract> getContracts() {
          return contracts;
     }

     public void addContract(HourContract contract) {
          this.contracts.add(contract);
     }

     public void removeContract(HourContract contract) {
          this.contracts.remove(contract);
     }

     public Double income(Integer year, Integer mounth) {
          Double sum = baseSalary;
          for (HourContract c : contracts) {
               int c_year = c.getDate().getYear();
               int c_mounth = c.getDate().getMonthValue();
               if (c_year == year && c_mounth == mounth) {
                    sum += c.totalValue();
               }
          }
          return sum;
     }

}
