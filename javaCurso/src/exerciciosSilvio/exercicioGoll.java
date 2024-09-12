package exerciciosSilvio;

public class exercicioGoll {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;
        int maior = 0;
        int menor = 0;

        if (a < b && a < c) {
            menor = a;
        } else if (b < a && b < c) {
            menor = b;
        } else if (c < a && b < c) {
            menor = c;
        }
        if (a > b && a > c) {
            maior = a;
        } else if (b > a && b > c) {
            maior = b;
        } else if (c > a && b < c) {
            maior = c;

            System.out.printf(maior + " é maior que " + menor);
        }
    }
}