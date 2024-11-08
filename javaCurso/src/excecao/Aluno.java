package excecao;

public class Aluno {

    public final String nome;
    public double nota;
    public final boolean bomComportamento;

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", nota=" + nota +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public boolean isBomComportamento() {
        return bomComportamento;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Aluno(String nome, double nota, boolean bomComportamento) {
        this.nome = nome;
        this.nota = nota;
        this.bomComportamento = bomComportamento;
    }
}
