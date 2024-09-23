package exerciciosSolo2;

import java.util.List;

public class Pessoa {

    private String nome;
    private int idade;
    private List<Carro> carro;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Carro> getCarro() {
        return carro;
    }

    public void setCarro(List<Carro> carro) {
        this.carro = carro;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", carro=" + carro +
                '}';
    }

    public void setCarro() {
        this.carro = carro;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
