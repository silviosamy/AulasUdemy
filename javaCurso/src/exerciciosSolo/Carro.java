package exerciciosSolo;

public class Carro {

    String nome;
    int ano;
    String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public String getNome() {
        return nome;
    }

    Carro(String nome, int ano) {
        this.nome = nome;
        this.ano = ano;

    }

    @Override
    public String toString() {
        return "Carro: " + getNome() + ". Ano: " + getAno() + " Modelo: " + getStatus();
    }
}

