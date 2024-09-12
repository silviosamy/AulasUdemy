package exerciciosSilvio;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class exercicio11 {
    public static void main(String[] args) {
//   11 - Faça um algoritmo que leia quatro notas obtidas por um aluno,
//   calcule a média das nota obtidas, imprima na tela o nome do aluno e
//    se o aluno foi aprovado ou reprovado. Para o aluno ser
//    considerado aprovado sua média final deve ser maior ou igual a 7.
        NumberFormat formatter = new DecimalFormat("##.#");
        double nota1 = 5.6;
        double nota2 = 7.5;
        double nota3 = 9.2;
        double nota4 = 8.8;
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        String mediaFinal = formatter.format(media);;
        String nomeAluno = "Alencar";


        if (media >= 7.0) {
            System.out.printf(nomeAluno + " está Aprovado! Com a média de: " + mediaFinal);
        } else {
            System.out.println(nomeAluno + " está Reprovado! Com a média de: " + mediaFinal);
        }

    }
}
