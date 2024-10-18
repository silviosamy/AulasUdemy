package TreinoMetodos;

public class UtilClass {

    public Pessoa novaPessoa(String nome, int idade) {

        return new Pessoa(nome, idade);
    }

    // public Carro novoCarro(String nome, int ano) {
    // Carro c = new Carro(nome, ano);
    // if (c.getAno() < 2010) {
    //   c.setehVelho(true);
    //}
    // return c;
    // }
}
