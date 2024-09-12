package exerciciosSilvio;
//Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais,
// deverá somar os dois valores,
//caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos,
// deve-se atribuir o resultado a uma variável C e imprimir seu valor na tela.

public class exercicio3 {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;

        if (a == b) {
            int valoresSomados = a + b;
            System.out.println("A soma dos dois é " + valoresSomados);
        } else {
        System.out.println("A múltiplicação dos dois é " + (a * b));
        }
    }
}
