package TreinoLivroSilvio;

import java.util.List;
import java.util.Scanner;

public class UtilClass {

    // - Verificar Disponibilidade
    // - Emprestar Livro
    // - Devolver Livro
    // - Opcoes livro


    public boolean verificarDisponibilidade(String nomeLivro, List<Livro> listLivros, boolean isDisponivel) {
        for (Livro livro : listLivros) {
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
}