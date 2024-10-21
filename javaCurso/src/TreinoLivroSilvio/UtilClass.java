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

    private static String solicitaTexto() {
        return new Scanner(System.in).nextLine();
    }
}