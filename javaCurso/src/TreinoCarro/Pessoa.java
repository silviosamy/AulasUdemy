package TreinoCarro;

import java.util.List;

public class Pessoa {

    private String nome;
    List<Carro> listCarros;

    public List<Carro> getListCarros() {
        return listCarros;
    }

    public void setListCarros(List<Carro> listCarros) {
        this.listCarros = listCarros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }
}
