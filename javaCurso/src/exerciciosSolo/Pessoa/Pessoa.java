package exerciciosSolo.Pessoa;

import java.util.List;

public class Pessoa {

    private String nome;
    List<Prefeito> listPrefeitos;
    List<Vereador> listVereadores;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Vereador> getListVereadores() {
        return listVereadores;
    }

    public void setListVereadores(List<Vereador> listVereadores) {
        this.listVereadores = listVereadores;
    }

    public List<Prefeito> getListPrefeitos() {
        return listPrefeitos;
    }

    public void setListPrefeitos(List<Prefeito> listPrefeitos) {
        this.listPrefeitos = listPrefeitos;
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }
}