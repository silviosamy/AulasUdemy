package ExerciciosSilvio;

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

        NumberFormat formatter = new DecimalFormat("##.#");
        double peso = 70;
        double altura = 1.80;
        double imc = peso / (altura * altura);
        String valorIMC = formatter.format(imc);

        if (imc <= 18.5) {
            System.out.println("O IMC é: " + valorIMC + ". Está abaixo do peso");
        } else if (imc >= 18.6 && imc < 24.9) {
            System.out.printf("O IMC é: " + valorIMC + ". Está no peso ideal!");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.printf("O IMC é: " + valorIMC + ". Está levemente acima do peso");
        } else if (imc >= 30 && imc < 34.9) {
            System.out.printf("O IMC é: " + valorIMC + ". Está em Obesidade Grau I");
        } else if (imc >= 35 && imc < 39.9) {
            System.out.printf("O IMC é: " + valorIMC + ". Está em Obesidade Grau II");
        } else if (imc >= 40) {
            System.out.printf("O IMC é: " + valorIMC + ". Está em Obesidade Grau III");
        }
    }
}
