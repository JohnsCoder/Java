package entities;

public class PessoaJuridica extends Pessoa {
     private int workerAmount;

     public PessoaJuridica() {
          super();
     }

     public PessoaJuridica(String name, double anualEarnings, int workerAmount) {
          super(name, anualEarnings);
          this.workerAmount = workerAmount;
     }

     public int getWorkerAmount() {
          return workerAmount;
     }

     public void setWorkerAmount(int workerAmount) {
          this.workerAmount = workerAmount;
     }

     @Override
     public double earningFee() {
          if (workerAmount > 10) {
               return anualEarnings * 0.14;
          }
          return anualEarnings * 0.16;
     }
}
