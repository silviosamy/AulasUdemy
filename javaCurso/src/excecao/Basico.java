package excecao;

import TreinoMedia.Aluno;

public class Basico {
    public static void main(String[] args) {

        Aluno a1 = null;
        System.out.println(a1);

        System.out.println(7 / 0);

        System.out.println("Fim.");
    }

    public static void imprimirNomeDoAluno(Aluno aluno) {
        System.out.println(aluno.getNome());
    }
}
