package exerciciosSilvio;

import java.text.DecimalFormat;

public class exercicio17 {
    public static void main(String[] args) {
//Faça um algoritmo que leia uma temperatura em Fahrenheit e
// calcule a temperatura correspondente em grau Celsius. Imprima na tela as duas temperaturas.
//Fórmula: C = (5 * ( F-32) / 9)

        DecimalFormat df = new DecimalFormat("#.##");
        double f = 0;
        double c = (5 * (f - 32) / 9);
        String cFinal = df.format(c);
        String fFinal = df.format(f);

        System.out.printf("Fahrenheit = " + fFinal + " graus.");
        System.out.printf("\nCelsius = %s".formatted(cFinal) + " graus.");
    }
}
