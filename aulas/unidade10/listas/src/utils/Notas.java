package utils;

public class Notas {
     private String name;
     private double firstGrade;
     private double secoundGrade;

     public Notas(String name, double firstGrade, double secoundGrade) {
          this.name = name;
          this.firstGrade = firstGrade;
          this.secoundGrade = secoundGrade;
     }
     
     public String getName() {
          return name;
     }
     public double getFirstGrade() {
          return firstGrade;
     }
     public double getSecoundGrade() {
          return secoundGrade;
     }
     
}

