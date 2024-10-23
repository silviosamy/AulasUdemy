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
        String nomeLivro = solicitaTexto();
        if (verificaLivroExiste(nomeLivro, listLivros)) {
            for (Livro livro : listLivros) {
                if (livro.getNome().equals(nomeLivro)) {
                    if (livro.isDisponivel()) {
                        System.out.println("Livro emprestado!");
                        livro.setDisponivel(false);
                    } else {
                        System.out.println("Livro já emprestado");
                    }
                }
            }
        } else {
            System.out.println("Livro não encontrado");
        }
    }

    public boolean verificaLivroExiste(String nomeLivro, List<Livro> listLivros) { // metodoo pra
        // verificar se o livro existe para não rodar várias vezes a ListaLivros
        for (Livro livro : listLivros) {
            if (livro.getNome().equals(nomeLivro)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }


    public void devolverLivro(List<Livro> listLivros) {
        System.out.println("Qual livro você quer devolver?");
        String nomeLivro = solicitaTexto();
        for (Livro livro : listLivros) {
            if (livro.getNome().equals(nomeLivro) && !livro.isDisponivel()) {
                System.out.println("Livro devolvido!");
                livro.setDisponivel(true);
            } else {
                if (livro.getNome().equals(nomeLivro) && livro.isDisponivel()) {
                    System.out.println("O Livro já foi devolvido");

                }
            }
        }
    }


    private static String solicitaTexto() {
        return new Scanner(System.in).nextLine();
    }
}