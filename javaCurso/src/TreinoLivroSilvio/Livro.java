package TreinoLivroSilvio;

public class Livro {

    private String nome;
    private String autor;
    private boolean isDisponivel;

    public Livro(String nome, String autor, boolean isDisponivel) {
        this.nome = nome;
        this.autor = autor;
        this.isDisponivel = isDisponivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponivel() {
        return isDisponivel;
    }

    public void setDisponivel(boolean disponivel) {
        isDisponivel = disponivel;
    }
}
