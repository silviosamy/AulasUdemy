package Teste;

public class Carro {
    private String nome;
    private int ano;
    private double valor;

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", ano=" + ano +
                ", valor=" + valor +
                '}';
    }

    public Carro(String nome, int ano, double valor) {
        this.nome = nome;
        this.ano = ano;
        this.valor = valor;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


}
