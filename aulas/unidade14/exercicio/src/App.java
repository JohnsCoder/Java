import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();
        System.out.print("Enter the number of tax payers: ");
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            sc.nextLine();
            System.out.printf("Tax payer #%d data:%n", i + 1);
            System.out.print("Individual or company (i/c)? ");
            char individualOrCompany = sc.nextLine().charAt(0);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            Double anualEarnings = sc.nextDouble();
            switch (individualOrCompany) {
                case 'i':
                    System.out.print("Health expenditures: ");
                    double healthSpents = sc.nextDouble();
                    pessoas.add(new PessoaFisica(name, anualEarnings, healthSpents));
                    break;
                case 'c':
                    System.out.print("Number of employees: ");
                    int workerAmount = sc.nextInt();
                    pessoas.add(new PessoaJuridica(name, anualEarnings, workerAmount));
            }
        }
        System.out.println("\nTAXES PAID:");
        double sum = 0;
        for (Pessoa p : pessoas) {
            sum += p.earningFee();
            System.out.println(p);
        }
        System.out.printf("%nTOTAL TAXES: $ %.2f", sum);
        sc.close();
    }
}
