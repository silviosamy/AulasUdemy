package exerciciosSolo1;

import java.util.ArrayList;
import java.util.List;

public class CarroTeste {

    public static void main(String[] args) {
        List<Pessoa> listaPessoas = new ArrayList<>();
        listaPessoas.add(new Pessoa("Ana", 45));
        listaPessoas.add(new Pessoa("José", 61));
        listaPessoas.add(new Pessoa("Guilherme", 21));


        for (Pessoa pessoa : listaPessoas) {
            List<Carro> listCarros = new ArrayList<>();
            listCarros.add(new Carro("Ferrari", 2012));
            listCarros.add(new Carro("Porsche", 2006));


            pessoa.setListaCarros(listCarros);
        }
        for (Pessoa pessoa : listaPessoas) {
            System.out.println(pessoa.getNome());
            for (Carro carro : pessoa.getListaCarros()) {
                System.out.println("Meus carros: " + carro.getModelo());
            }
        }
    }
}