package TreinoLivroSilvio;

import java.util.List;
import java.util.Scanner;

public class UtilClass {

    // - Verificar Disponibilidade ok
    // - Emprestar Livro ok
    // - Devolver Livro ok
    // - Opcoes livro tá no main, ok


    public boolean verificarDisponibilidade(List<Livro> listLivros) {
        for (Livro livro : listLivros) {
            System.out.println("Qual o livro desejado?");
            String nomeLivro = solicitaTexto();
            if (livro.getNome().equals(nomeLivro) && livro.isDisponivel()) {
                System.out.println("O livro está disponível");
                solicitaTexto();
                return true;
            } else {
                System.out.println("O livro não está disponível");
                solicitaTexto();
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
                solicitaTexto();
            } else {
                System.out.println("Livro indisponível para empréstimo");
                solicitaTexto();
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
                if (livro.getNome().equals(nomeLivro) && livro.isDisponivel()) {
                    System.out.println("O Livro já foi devolvido");

                } else {
                    System.out.println("Livro não encontrado");
                }
            }
        }
    }

    private static String solicitaTexto() {
        return new Scanner(System.in).nextLine();
    }
}