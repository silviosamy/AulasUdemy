package exerciciosSolo.Pessoa;

public class Vereador {

    private String nome;
    private String partido;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public Vereador(String nome, String partido) {
        this.nome = nome;
        this.partido = partido;
    }
}