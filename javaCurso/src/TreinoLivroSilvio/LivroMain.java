package TreinoLivroSilvio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LivroMain {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<Livro> listLivros = new ArrayList<>();
        listLivros.add(new Livro("Harry Potter", "J K Rowling", true));
        listLivros.add(new Livro("O Senhor dos Anéis", "J. R. R. Tolkien", true));
        listLivros.add(new Livro("O Código da Vinci", "Dan Brown", true));

        int option;

        //aqui pra baixo , por padrão, irá passar as opções para o usuário escolher.
        do {
            System.out.println("");
            System.out.println("Escolha uma Opção: ");
            System.out.println("0-Sair");
            System.out.println("1-Emprestar Livro");
            System.out.println("2-Devolver Livro");
            System.out.println("3-Verificar Disponibilidade");

            option = input.nextInt();

        } while (option != 3);
    }
}
