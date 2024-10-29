package exerciciosSolo.Intermediario;

public class Pessoa {

    private int idade;
    private double peso;
    private double altura;
    private String corOlhos;
    private String corCabelo;

    public Pessoa(int idade, double peso, double altura, String corOlhos, String corCabelo) {
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.corOlhos = corOlhos;
        this.corCabelo = corCabelo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getCorOlhos() {
        return corOlhos;
    }

    public void setCorOlhos(String corOlhos) {
        this.corOlhos = corOlhos;
    }

    public String getCorCabelo() {
        return corCabelo;
    }

    public void setCorCabelo(String corCabelo) {
        this.corCabelo = corCabelo;
    }
}
