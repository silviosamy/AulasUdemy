package TreinoMedia;

import java.util.ArrayList;
import java.util.List;

public class UtilClass {

    List<Aluno> listAluno = new ArrayList<>();

    public Aluno newAluno(String nome, double n1, double n2, double n3, double n4,
                          boolean amigoDoProfessor, boolean amigoDoDiretor) {
        Aluno novoAluno = new Aluno(nome, n1, n2, n3, n4, amigoDoProfessor, amigoDoDiretor);
        return novoAluno;
    }

    public double mediaNota(Aluno aluno) {
        return (aluno.getN1() + aluno.getN2() + aluno.getN3() + aluno.getN4()) / 4;
    }

    // public double mediaNotav2(double n1, double n2, double n3, double n4) {
    //    return (n1 + n2 + n3 + n4) / 4;
    //}

    public boolean isAprovado(Aluno aluno) {
        double mediaNota = this.mediaNota(aluno);
        //     double mediaNota = this.mediaNotav2(aluno.getN1(), aluno.getN2(), aluno.getN3(), aluno.getN4());
        if (((aluno.isAmigoDoDiretor())) || mediaNota >= 7 || (mediaNota >= 5 && aluno.isAmigoDoProfessor())) {
            return true;
        } else {
            return false;
        }
    }

}

