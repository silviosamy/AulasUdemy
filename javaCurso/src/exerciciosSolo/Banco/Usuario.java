package exerciciosSolo.Banco;

import java.util.List;

public class Usuario {

    private String nome;
    private int idade;
    private char sexo;
    private String nacionalidade;
    List<Banco> contasBanco;

    public List<Banco> getContasBanco() {
        return contasBanco;
    }

    public void setContasBanco(List<Banco> contasBanco) {
        this.contasBanco = contasBanco;
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

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Usuario(String nome, int idade, char sexo, String nacionalidade) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.nacionalidade = nacionalidade;
    }
}
