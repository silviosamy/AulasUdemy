package TreinoCarro;

import java.util.ArrayList;
import java.util.List;

public class TesteFinal {
    public static void main(String[] args) {


        List<Pessoa> listPessoas = new ArrayList<>();
        listPessoas.add(new Pessoa("Silvio"));
        listPessoas.add(new Pessoa("Henrique"));

        for (Pessoa pessoa : listPessoas) {
            List<Carro> listCarros = new ArrayList<>();
            if (pessoa.getNome().equals("Silvio")) {
                listCarros.add(new Carro("Lamborghini", 2012));
            } else {
                listCarros.add(new Carro("Jeep", 2024));
                listCarros.add(new Carro("Ferrari", 1996));
                listCarros.add(new Carro("Fusca", 1950));
            }
            pessoa.setListCarros(listCarros);
        }
        TesteFinal asdf = new TesteFinal();

        for (Pessoa pessoa : listPessoas) {
            for (Carro carros : pessoa.getListCarros()) {
                Carro carro = asdf.defineSeEhVelho(carros);
            }
        }
        for (Pessoa pessoa : listPessoas) {
            System.out.println("Nome: " + pessoa.getNome());
            for (Carro carros : pessoa.getListCarros()) {
                System.out.println("Carros: " + carros.getNome() + " Ano: " + carros.getAno());
                System.out.println(carros.isOld);
            }
        }
    }

    public Carro defineSeEhVelho(Carro carros) {
        if (carros.getAno() <= 2010) {
            carros.setOld(true);
        }
        return carros;
    }
}
