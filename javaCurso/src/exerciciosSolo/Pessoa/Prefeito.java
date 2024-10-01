package exerciciosSolo.Pessoa;

import java.util.List;

public class Prefeito {

    private String nome;
    private String partido;
    private List<String> listPropostas;


    public List<String> getListPropostas() {
        return listPropostas;
    }

    public void setListPropostas(List<String> listPropostas) {
        this.listPropostas = listPropostas;
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

    public Prefeito(String nome, String partido) {
        this.nome = nome;
        this.partido = partido;
    }
}
