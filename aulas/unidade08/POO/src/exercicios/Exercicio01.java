package POO.src.exercicios;

import java.util.Locale;
import java.util.Scanner;

import POO.src.utils.CurrencyConverter;

public class Exercicio01 {
     public static void main(String[] args) {
          Locale.setDefault(Locale.US);
          Scanner sc = new Scanner(System.in);
          System.out.print("What is the dollar price? ");
          float dollarPrice = sc.nextFloat();
          System.out.print("How many dollars will be bought? ");
          int amount = sc.nextInt();
          System.out.printf("Amount tot be paid in reais = %.2f",
                    CurrencyConverter.getConverterPrice(dollarPrice, amount));

          sc.close();
     }
}
