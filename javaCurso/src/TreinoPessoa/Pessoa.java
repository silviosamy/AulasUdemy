package TreinoPessoa;

import java.util.List;

public class Pessoa {

    public String nome;
    List<Prefeito> listPrefeitos;

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

    List<Vereador> listVereadores;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
