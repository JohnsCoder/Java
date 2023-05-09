package exercicios;

import java.util.Scanner;

public class Exercicio04 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int timeStart;
          int timeEnd;
          System.out.println("Digite o horário de inicio e o de termino para o calculo da duração!");
          System.out.printf("Hórario de ínicio: ");
          timeStart = sc.nextInt();
          System.out.printf("Hórario de termino: ");
          timeEnd = sc.nextInt();
          sc.close();
          int time = (timeStart < timeEnd) ? timeEnd - timeStart : 24 - timeStart + timeEnd;

          System.out.printf("O jogo durou %d hora(s)!", time);

     }
}
