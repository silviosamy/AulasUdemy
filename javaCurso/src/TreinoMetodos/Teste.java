package TreinoMetodos;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {


        UtilClass utilClass = new UtilClass();
        List<Pessoa> listPessoas = new ArrayList<>();
        listPessoas.add(utilClass.novaPessoa("Silvio", 28));
        listPessoas.add(utilClass.novaPessoa("Henrique", 32));

        // for (Pessoa pessoa : listPessoas) {
        //   List<Carro> listaCarros = new ArrayList<>();
        //    listaCarros.add(utilClass.novoCarro("Ferrari", 2024));
        //    listaCarros.add(utilClass.novoCarro("Lamborghini", 2016));
        //    listaCarros.add(utilClass.novoCarro("Fusca", 1950));
        //    pessoa.setListCarros(listaCarros);
        // }
        // for (
        //          Pessoa pessoa : listPessoas) {
        //      System.out.println("\nNome:" + pessoa.getNome() + "\nIdade:" + pessoa.getIdade());
        //      for (Carro carro : pessoa.listCarros) {
        //        System.out.println("\nCarro: " + carro.getNome()
        //                + "\nAno: " + carro.getAno() + "\nÉ Antigo? " + carro.isehVelho());
        //   }
        //  }

    }
}
