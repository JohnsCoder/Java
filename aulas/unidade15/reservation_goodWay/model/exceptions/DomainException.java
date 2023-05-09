package unidade15.reservation_goodWay.model.exceptions;

public class DomainException extends RuntimeException {
     private static final long serialVersionUID = 1L;

     public DomainException(String message) {
          super(message);
     }
}
