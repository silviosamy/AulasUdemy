package oo.encapsulamento;

public class Pessoa {

    private String nome;
    private String sobrenome;

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getNomeCompleto() {
        return getNome() + " " + getSobrenome();
    }

    private int idade;

    public Pessoa(String nome, String sobrenome, int idade) {
        setNome(nome);
        setIdade(idade);
        setSobrenome(sobrenome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getIdade() {
        return idade;
    }

    public void setIdade(int novaIdade) {
        novaIdade = Math.abs(novaIdade);
        if (novaIdade >= 0 && novaIdade <= 120) {
            this.idade = novaIdade;
        }
    }

    @Override
    public String toString() {
        return "Me chamo " + getNomeCompleto() + " e tenho " + getIdade() + " anos.";
    }
}
