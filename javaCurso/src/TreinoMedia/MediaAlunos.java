package TreinoMedia;

import java.util.ArrayList;
import java.util.List;

public class MediaAlunos {
    public static void main(String[] args) {

        UtilClass utilClass = new UtilClass();

        List<Aluno> listAluno = new ArrayList<>();
        listAluno.add(new Aluno("Silvio", 4.5, 2.6, 1.9, 5.3, false, true));
        listAluno.add(new Aluno("Henrique", 7.0, 7.0, 6.0, 6.0, false, false));
        listAluno.add(new Aluno("Alberto", 5.0, 5.0, 5.0, 5.0, true, false));


        for (Aluno aluno : listAluno) {
            if (utilClass.isAprovado(aluno)) {
                aluno.setStatus("Aprovado");
            } else {
                aluno.setStatus("Reprovado");
            }
        }
        for (Aluno aluno : listAluno) {
            System.out.println(aluno.getNome() + "\n" + aluno.getStatus() + "\n" + utilClass.mediaNota(aluno));
        }
    }
}