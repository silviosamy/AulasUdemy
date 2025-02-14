package modelo.heranca;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Aluno {

    @Id
    private Long matricula;

    private String nome;

    public Aluno() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public Aluno(Long matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }
}
