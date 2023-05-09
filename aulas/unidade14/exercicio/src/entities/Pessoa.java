package entities;

public abstract class Pessoa {
     protected String name;
     protected double anualEarnings;

     public Pessoa() {
          super();
     }

     public Pessoa(String name, double anualEarnings) {
          this.name = name;
          this.anualEarnings = anualEarnings;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public double getAnnualEarnings() {
          return anualEarnings;
     }

     public void setAnnualEarnings(double anualEarnings) {
          this.anualEarnings = anualEarnings;
     }

     @Override
     public String toString() {
          StringBuilder sb = new StringBuilder();
          sb.append(name + ": $ ");
          sb.append(String.format("%.2f", earningFee()));
          return sb.toString();

     }

     public abstract double earningFee();
}
