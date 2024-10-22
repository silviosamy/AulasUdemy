package TreinoLivroSilvio;

import java.util.List;
import java.util.Scanner;

public class UtilClass {

    // - Verificar Disponibilidade
    // - Emprestar Livro
    // - Devolver Livro
    // - Opcoes livro


    public boolean verificarDisponibilidade(List<Livro> listLivros) {
        for (Livro livro : listLivros) {
            System.out.println("Qual o livro desejado?");
            String nomeLivro = solicitaTexto();
            if (livro.getNome().equals(nomeLivro) && livro.isDisponivel()) {
                System.out.println("O livro está disponível");
                return true;
            } else {
                System.out.println("O livro não está disponível");
                return false;
            }
        }
        return false;
    }

    public void emprestarLivro(List<Livro> listLivros) {
        System.out.println("Qual Livro você quer emprestar?");
        for (Livro livro : listLivros) {
            String nomeLivro = solicitaTexto();
            if (livro.getNome().equals(nomeLivro) && livro.isDisponivel()) {
                System.out.println("Livro emprestado!");
                livro.setDisponivel(false);
            } else {
                System.out.println("Livro indisponível para empréstimo");
            }
        }
    }

    public void devolverLivro(List<Livro> listLivros) {
        System.out.println("Qual livro você quer devolver?");
        for (Livro livro : listLivros) {
            String nomeLivro = solicitaTexto();
            if (livro.getNome().equals(nomeLivro) && !livro.isDisponivel()) {
                System.out.println("Livro devolvido!");
                livro.setDisponivel(true);
            } else {

            }
        }
    }

    private static String solicitaTexto() {
        return new Scanner(System.in).nextLine();
    }
}