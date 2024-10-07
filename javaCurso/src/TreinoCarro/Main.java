package TreinoCarro;

import java.util.ArrayList;
import java.util.List;

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
                listCarros.add(new Carro("Ferrari", 1996));
                listCarros.add(new Carro("Jeep", 2024));
            }
            pessoa.setListCarros(listCarros);
        }
        for (Pessoa pessoa : listPessoas) {
            for (Carro carros : pessoa.getListCarros()) {
                System.out.println("\nNome: " + pessoa.getNome());
                System.out.println("Carros: " + carros.getNome() + " Ano: " + carros.getAno());
            }
        }
    }
}