package TreinoPessoa;

public class Prefeito {

    private String nome;

    public String getPartido() {
        return partido;
    }

    public Prefeito(String nome, String partido) {
        this.nome = nome;
        this.partido = partido;
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

    private String partido;
}
