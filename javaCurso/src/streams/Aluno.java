package streams;

import java.util.Objects;

public class Aluno {

    final String nome;
    final double nota;
    final boolean bomComportamento;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
        this.bomComportamento = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Double.compare(nota, aluno.nota) == 0 && bomComportamento == aluno.bomComportamento && Objects.equals(nome, aluno.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, nota, bomComportamento);
    }

    public String toString() {
        return nome + " tem nota " + nota;
    }
}
