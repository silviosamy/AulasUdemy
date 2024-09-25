package exerciciosSolo2;

import java.util.List;

public class Pessoa1 {

    private String nome;
    private int idade;
    private List<Carro1> carro1;

    public Pessoa1(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<Carro1> getCarro() {
        return carro1;
    }

    public void setCarro(List<Carro1> carro) {
        this.carro1 = carro;
    }

    public List<Carro1> getCarro1() {
        return carro1;
    }

    public void setCarro1(List<Carro1> carro1) {
        this.carro1 = carro1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
