package arrays;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantas notas: ");
        //solicitado ao usuário para digitar a quantidade de notas, criando o array
        int qtdeNotas = entrada.nextInt();
        System.out.println(qtdeNotas);

        double[] notas = new double[qtdeNotas]; //número digitado = número instâncias.

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Informe a nota " + (i + 1) + " :"); //Pega o valor digitado e define o valor do índice.
            notas[i] = entrada.nextDouble(); //Aqui solicita a próxima nota
        }
        double total = 0; //Parte da posição 0
        for (double nota : notas) {
            total += nota; //Soma de todas as notas.
        }

        double media = total / notas.length;
        System.out.println("A média é: " + media + "!"); //Depois de parar, ele pega a quantidade dos índices, e divide conforme valores.
        entrada.close();
    }
}
