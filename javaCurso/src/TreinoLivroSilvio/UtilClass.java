package TreinoLivroSilvio;

import java.util.List;
import java.util.Scanner;

public class UtilClass {
// Aqui verifica a disponibilidade do livro. Se ele estiver disponível, manterá true, se não, define false.

    public boolean verificarDisponibilidade(String nomeLivro, List<Livro> listLivros) {
        for (Livro livro : listLivros) {
            if (livro.getNome().equals(nomeLivro)) {
                if (livro.isDisponivel()) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public void emprestarLivro(List<Livro> listLivros) {
        System.out.println("Qual livro você quer emprestar?");
        String nomeLivro = solicitaTexto();

        boolean isDisponivel = this.verificarDisponibilidade(nomeLivro, listLivros); // Aqui cria uma
        // variável dentro do méto.do pra verificar a disponibilidade do livro

        if (isDisponivel) { // Se disponível = true, define false , e a mensagem "Livro emprestado".
            Livro livro = this.findLivro(nomeLivro, listLivros);
            if (livro != null) {
                livro.setDisponivel(false);
                System.out.println("Pronto, livro emprestado com sucessO!");
            } else { // Se não existir, ele diz que não foi encontrado
                System.out.println("Livro não encontrado");
            }
        } else {
            System.out.println("O Livro não está disponível"); // Se o isDisponivel é false, ele vai printar que não está disponível.
        }
    }

    private static String solicitaTexto() { // Aqui é um méto.do que falicita o input.
        return new Scanner(System.in).nextLine();
    }

    public Livro findLivro(String nomeLivro, List<Livro> listLivros) {
        for (Livro livro : listLivros) {
            if (livro.getNome().equals(nomeLivro)) {
                return livro;
            }
        }
        return null;
    }
}