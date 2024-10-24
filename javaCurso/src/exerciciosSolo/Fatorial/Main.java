package exerciciosSolo.Fatorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Leia um número no Scanner e imprima o resultado do fatorial dele.
        //Faça isso para todos os números abaixo que o usuário digitou.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para calcular o fatorial: ");

        int numero = scanner.nextInt();

        long fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
        scanner.close();
    }
}
