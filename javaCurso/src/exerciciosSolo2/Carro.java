package exerciciosSolo2;

public class Carro {

    private String marca;
    private int ano;

    public Carro(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
