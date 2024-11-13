package excecao;

public class Causa {

    public static void main(String[] args) {

        metodoA(null);
    }

    static void metodoA(Aluno aluno) {
        metodoA(aluno);
    }

    static void metodoB(Aluno aluno) {
        if (aluno == null) {
            throw new NullPointerException("ALUNO ESTÁ NULO!!!");
        }
        System.out.println(aluno.nome);
    }
}
