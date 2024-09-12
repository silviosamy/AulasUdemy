package exerciciosSilvio;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class exercicio9 {
    public static void main(String[] args) {
//Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa,
// leia o seu peso e sua altura e imprima na tela sua condição
//de acordo com a tabela abaixo:
//Fórmula do IMC = peso / (altura) ²
////Tabela Condições IMC
/// Abaixo de 18,5   | Abaixo do peso
/// Entre 18,6 e 24,9 | Peso ideal (parabéns)
/// Entre 25,0 e 29,9 | Levemente acima do peso
/// Entre 30,0 e 34,9 | Obesidade grau I
/// Entre 35,0 e 39,9 | Obesidade grau II (severa)
/// Maior ou igual a 40 | Obesidade grau III (mórbida)

        float peso = 70.0f;
        float altura = 1.80f;
        double imc = calculoIMC(peso,altura);

        if (imc <= 18.5) {
            System.out.printf("O IMC é: %.2f. Está abaixo do peso", imc);
        } else if (imc >= 18.6 && imc < 24.9) {
            System.out.printf("O IMC é: %.2f. Está no peso ideal!", imc);
        } else if (imc >= 25 && imc < 29.9) {
            System.out.printf("O IMC é: %.2f. Está levemente acima do peso", imc);
        } else if (imc >= 30 && imc < 34.9) {
            System.out.printf("O IMC é: %.2f. Está em Obesidade Grau I", imc);
        } else if (imc >= 35 && imc < 39.9) {
            System.out.printf("O IMC é: %.2f. Está em Obesidade Grau II", imc);
        } else if (imc >= 40) {
            System.out.printf("O IMC é: %.2f.Está em Obesidade Grau III", imc);
        }
    }

    public static float calculoIMC(float peso, float altura) {
        float imc = (peso / (altura * altura));
        return imc;
    }
}
