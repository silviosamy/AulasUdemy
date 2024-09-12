package exerciciosSilvio;

public class exercicio14 {
    public static void main(String[] args) {
//14 - Faça um algoritmo que receba um valor A e B,
// e troque o valor de A por B e o valor de B por A e imprima na tela os valores.
        int a = 20;
        int b = 50;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);

    }
}
