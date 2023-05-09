package utils;

public class Employes {
     private int id;
     private String name;
     private double salary;

     public Employes(int id, String name, double salary) {
          this.id = id;
          this.name = name;
          this.salary = salary;
     }

     public int getId() {
          return id;
     }

     public String getName() {
          return name;
     }

     public double getSalary() {
          return salary;
     }

     public void PayRaise(double percent) {
          this.salary += this.salary * (percent / 100);
     }

}
