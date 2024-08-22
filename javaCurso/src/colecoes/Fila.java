package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Ana"); //.add() lançará uma exceção caso a fila esteja cheia.
		fila.offer("Bia"); //.offer() retorna falso caso a fila esteja cheia.
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		System.out.println(fila.peek()); //Retorna Null se a fila não tiver valor.
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.element());
		
//		fila.size(); - Tamanho da Fila
//		fila.clear(); - Limpa a fila
//		fila.isEmpty(); - Se estiver vazio, retorna true/false.
//		fila.poll(); - Retorna o primeiro elemento da fila, removendo os dados anteriores até retornar nulo.
//		fila.remove(); - Remove elemento da fila.
//		fila.contains(); - Verifica se contém x valor na lista, retornando true/false.
//		Entre outros a serem estudados posteriormente.
	}
}

//.add() lançará uma exceção caso a fila esteja cheia.

//.offer() retorna falso caso a fila esteja cheia.
