package arrays;

import java.util.Arrays;

public class Exercicio {
	public static void main(String[] args) {
		
//		Array é uma estrutura estática, com tamanho fixo.
//		Quando criada, no momento na criação, deve ser especificado a quantidade de elementos/valores
//		essa array irá armazenar.
//		Para acessar o Array, deve ser usar uma variável
//		Ele usa dados homogêneos, ou seja, se for definido como int, tudo dentro do array é int.
//		Ele é indexado, ou seja, deve-se acessar através de números/elementos , partindo de 1.
		
//		//	definição do tipo, [SIGNIFICA QUE É ARRAY], nome da array = new TIPO [quantidade dentro];
//		double[] a = new double [6];
//		a[2] = 10.0;
//		a[1] = 0.4;
//		
//		System.out.print(a[1]);
//		usando system.out (nome do array[posição no array]);
		//nome da array [índice no elemento(partindo de 0)] = valor no índice.
//		Para Array multidimensional(Um dentro do outro);
		
		double[] notasAlunoA = new double[4]; //construtor de array no valor atribuído notasAlunoA
		//todos os dados aqui são do tipo double, e tem 3 índices.
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		System.out.println(Arrays.toString(notasAlunoA)); //Tem que importar o util.Arrays, e 
														  //transformar o array em string, boolean, etc.
		double totalAlunoA = 0;
		for(int i = 0; i < notasAlunoA.length; i++)	{ //puxar o nome da array.lenght , 
													//assim pega todos os índices, partindo do 0.
			//continua sendo for, pois ele será repetido até o tamanho total da array.
			totalAlunoA += notasAlunoA [i];
		}
		System.out.println(totalAlunoA / notasAlunoA.length);
		
		final double notaArmazenada = 5.9;
		double[] notasAlunoB = { 6.9, 8.9, notaArmazenada, 10 }; //o [] no começo define que é um array. os dados são inseridos com ,,,,
		
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		System.out.println(totalAlunoB / notasAlunoB.length);
	}
} 
