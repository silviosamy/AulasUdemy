package exerciciosSolo.Pessoa;

import java.util.List;

public class Prefeito {

    private String nome;
    private String partido;
    List<Prefeito> listPrefeitos;

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

    public List<Prefeito> getListPrefeitos() {
        return listPrefeitos;
    }

    public void setListPrefeitos(List<Prefeito> listPrefeitos) {
        this.listPrefeitos = listPrefeitos;
    }

    public Prefeito(String nome, String partido) {
        this.nome = nome;
        this.partido = partido;
    }
}
