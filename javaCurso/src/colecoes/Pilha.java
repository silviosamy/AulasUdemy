package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
//		LIFO - Último a entrar, é o primeiro a sair.
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O pequeno príncipe");
		livros.push("Dom Quixote");
		livros.push("O Hobbit"); // Último a entrar, primeiro a sair.
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.remove());
		
		//é possível usar o for each
	}
}
