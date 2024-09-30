package exerciciosSolo.Pessoa;

import java.util.List;

public class Vereador {

    private String nome;
    private String partido;

    public Vereador(String nome, String partido) {
        this.nome = nome;
        this.partido = partido;
    }

    public List<Vereador> getListVereadores() {
        return listVereadores;
    }

    public void setListVereadores(List<Vereador> listVereadores) {
        this.listVereadores = listVereadores;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    List<Vereador> listVereadores;
}
