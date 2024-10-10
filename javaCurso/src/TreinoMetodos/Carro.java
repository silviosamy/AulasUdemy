package TreinoMetodos;

public class Carro {

    private String nome;
    private int ano;
    private boolean ehVelho;

    public boolean isehVelho() {
        return ehVelho;
    }

    public void setehVelho(boolean ehVelho) {
        this.ehVelho = ehVelho;
    }

    public Carro(String nome, int ano, boolean ehVelho) {
        this.nome = nome;
        this.ano = ano;
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
}