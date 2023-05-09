package unidade15.exercicios.exercicio01.model.exceptions;

public class LimitBalanceException extends RuntimeException {
     private static final long serialVersionUID = 1L;

     public LimitBalanceException(String message) {
          super(message);
     }
}
