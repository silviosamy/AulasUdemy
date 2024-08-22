package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos alunos? ");
		int qtdeAlunos = entrada.nextInt();
		
		System.out.println("Quantos notas por aluno? ");
		int qtdeNotas = entrada.nextInt();
		
		double[][] notasDaTurma = new double[qtdeAlunos][qtdeNotas]; //new tipo para instanciar o array
		
		double total = 0;
		for (int a = 0; a < notasDaTurma.length; a++) {	
			for(int n = 0; n < notasDaTurma[a].length; n++) { //Conforme os alunos, tem um for interno, com o índice i, o n adiciona a nota de cada aluno.
			
				System.out.printf("Informe a nota %d do aluno %d: ", n + 1 , a + 1);
				notasDaTurma[a][n] = entrada.nextDouble();
				total += notasDaTurma[a][n];
		    }
		}
		
		double media = total / (qtdeAlunos * qtdeNotas);
		System.out.println("Média da turma é: " + media);
		
		for(double[] notasDoAluno: notasDaTurma) {
		    System.out.println(Arrays.toString(notasDoAluno));
		}
		
		entrada.close();
	}

		
		
		
}		
