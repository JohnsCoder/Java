package POO.src.utils;


public class CurrencyConverter {
     public static double getConverterPrice(float dollarPrice, int amount) {
          return (dollarPrice * amount) + (dollarPrice * amount / 100 * 6);
     }
}