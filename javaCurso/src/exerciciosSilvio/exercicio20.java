package exerciciosSilvio;

public class exercicio20 {
    public static void main(String[] args) {
//Faça um algoritmo que receba um valor inteiro e imprima na tela a sua tabuada.

        int valor = 10;

        for (int i = 0; i < 1; i++) {
            System.out.println("Tabuada do " + valor + ":");

            for (int j = 1; j <= 10; j++) {
                int multi = valor * j;
                System.out.println(valor + " x " + j + " = " + multi);
            }

        }
    }
}
