package TreinoMedia;

import java.util.List;

public class Aluno {

    private double n1;
    private double n2;
    private double n3;
    private double n4;
    private String nome;
    private String status;


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private boolean amigoDoProfessor;

    public Aluno(String nome, double n1, double n2, double n3, double n4, boolean amigoDoProfessor) {
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.amigoDoProfessor = amigoDoProfessor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

