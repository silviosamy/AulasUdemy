package TreinoCarro;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
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
                listCarros.add(new Carro("Ferrari", 2016));
                listCarros.add(new Carro("Fusca", 1950));
            }
            pessoa.setListCarros(listCarros);
        }
        for (Pessoa pessoa : listPessoas) {
            System.out.println("Nome: " + pessoa.getNome());
            for (Carro carros : pessoa.getListCarros()) {
                if (carros <= 2010) {
                    System.out.println("Carros: " + carros.getNome() + " Ano: " + carros.getAno());
                }
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