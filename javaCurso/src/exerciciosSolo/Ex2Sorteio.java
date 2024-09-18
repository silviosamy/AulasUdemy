package exerciciosSolo;

import java.util.Scanner;

public class Ex2Sorteio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = 1;
        int max = 100;
        int random = (int) (Math.random() * (max - min + 1)) + min;
        int acertou = 0;
        int tentativa = 0;

        System.out.println("Adivinhe um numero entre " + min + " e " + max + ":");
        while (acertou != random) {
            System.out.println();
            tentativa = scanner.nextInt();
            if (tentativa < random) {
                System.out.println("O numero é mais alto");
            } else if (tentativa > random) {
                System.out.println("O numero é mais baixo");
            } else {
                System.out.println("Você acertou! O numero era o : " + random);
            }
        }
        scanner.close();
    }
}
