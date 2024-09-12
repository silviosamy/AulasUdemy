package exerciciosSilvio;

public class exercicio1 {
//
//    Faça um algoritmo que leia os valores de A, B, C
//    e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C

    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        int c = 5;
        System.out.println(a + b);
        if (a + b <= c) {
            System.out.println(a + b + " é menor que " + c);
        } else {
            System.out.println(a + b + " é maior que " + c);
        }

    }
}
