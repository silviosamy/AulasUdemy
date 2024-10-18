package TreinoMedia;

public class UtilClass {


    public double mediaNota(Aluno aluno) {
        return (aluno.getN1() + aluno.getN2() + aluno.getN3() + aluno.getN4()) / 4;
    }

    // public double mediaNotav2(double n1, double n2, double n3, double n4) {
    //    return (n1 + n2 + n3 + n4) / 4;
    //}

    public boolean isAprovado(Aluno aluno) {
        double mediaNota = this.mediaNota(aluno);
        this.mostraMensagem("aaa");
        //     double mediaNota = this.mediaNotav2(aluno.getN1(), aluno.getN2(), aluno.getN3(), aluno.getN4());
        if (((aluno.isAmigoDoDiretor())) || mediaNota >= 7 || (mediaNota >= 5 && aluno.isAmigoDoProfessor())) {
            return true;
        } else {
            return false;
        }
    }

    public void mostraMensagem(String msg) {
        System.out.println(msg);
    }
}
