package entities;

public class PessoaFisica extends Pessoa {
     private double healthSpents;

     public PessoaFisica() {
          super();
     }

     public PessoaFisica(String name, double anualEarnings, double healthSpents) {
          super(name, anualEarnings);
          this.healthSpents = healthSpents;
     }

     public double getHealthSpents() {
          return healthSpents;
     }

     public void setHealthSpents(double healthSpents) {
          this.healthSpents = healthSpents;
     }

     @Override
     public double earningFee() {
          double heathDiscount = healthSpents / 2;
          if (anualEarnings <= 20000) {
               return anualEarnings * 0.15 - heathDiscount;
          } else {
               return anualEarnings * 0.25 - heathDiscount;
          }
     }
}
