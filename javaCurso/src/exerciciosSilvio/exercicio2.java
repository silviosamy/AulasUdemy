package exerciciosSilvio;

import java.util.Random;

public class exercicio2 {
    public static void main(String[] args) {
//        Faça um algoritmo para receber um número qualquer
//        e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
        Random random = new Random();

        int valor = random.nextInt();

        if (valor % 2 == 0) {
            if (valor > 0) {
                System.out.println(valor + " é par e positivo");
            } else {
                System.out.println(valor + " é par e negativo");
            }
        } else {
            if (valor > 0) {
                System.out.println(valor + " é impar e positivo");
            }else{
                    System.out.println(valor + " é ímpar e negativo");
                }
            }
        }
}
