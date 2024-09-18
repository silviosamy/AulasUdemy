package exerciciosSolo;

import java.util.Scanner;

public class Sorteio {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 100;
        int random = (int) (Math.random() * (max - min + 1)) + min;
        boolean acertou = false;
        int tentativa = 0;

        System.out.println("Adivinhe um número de " + min + " a " + max + ": ");
        tentativa = scanner.nextInt();
        do {

            if (tentativa > random) {
                System.out.println("Numero menor, tente novamente: ");
                tentativa = scanner.nextInt();
            } else if (tentativa < random) {
                System.out.println("Numero maior, tente novamente: ");
                tentativa = scanner.nextInt();
            } else {
                acertou = true;
                System.out.println("Você acertou! O Numero era o : " + random);
            }
        } while (!acertou);

        scanner.close();
    }
}
