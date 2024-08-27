package ExerciciosSilvio;

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
        double peso = 70;
        double altura = 1.80;

        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.printf("%.2f",imc);
        }
        if (imc >= 18.6 && imc < 24.9) {
            System.out.printf("%.2f",imc);
        }
        if (imc >= 25 && imc < 29.9) {
            System.out.printf("%.2f",imc);
        }
        if (imc >= 30 && imc < 34.9) {
            System.out.printf("%.2f",imc);
        }
        if (imc >= 35 && imc < 39.9) {
            System.out.printf("%.2f",imc);
        }
        if (imc >= 40) {
            System.out.printf("%.2f",imc);
        }
    }
}
