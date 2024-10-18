package TreinoMedia;

import java.util.List;

public class Aluno {

    private String nome;
    private double n1;
    private double n2;
    private double n3;
    private double n4;
    private String status;
    private boolean amigoDoProfessor;
    private boolean amigoDoDiretor;

    public Aluno(String nome, double n1, double n2, double n3, double n4, boolean amigoDoProfessor, boolean amigoDoDiretor) {
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.amigoDoProfessor = amigoDoProfessor;
        this.amigoDoDiretor = amigoDoDiretor;
    }

    public boolean isAmigoDoDiretor() {
        return amigoDoDiretor;
    }

    public void setAmigoDoDiretor(boolean amigoDoDiretor) {
        this.amigoDoDiretor = amigoDoDiretor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }

    public double getN4() {
        return n4;
    }

    public void setN4(double n4) {
        this.n4 = n4;
    }

    public boolean isAmigoDoProfessor() {
        return amigoDoProfessor;
    }

    public void setAmigoDoProfessor(boolean amigoDoProfessor) {
        this.amigoDoProfessor = amigoDoProfessor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

