package exerciciosSolo2;

import java.util.ArrayList;
import java.util.List;

public class Teste {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("João", 23);
        Pessoa pessoa2 = new Pessoa("Maria", 30);

        List<Carro> listaDeCarros = new ArrayList<>();
        listaDeCarros.add(new Carro("458", "Ferrari", 2018));
        listaDeCarros.add(new Carro("M5", "BMW", 2015));
        listaDeCarros.add(new Carro("Aventador", "Lamborghini", 2012));

        pessoa1.setCarro(listaDeCarros);

        System.out.println(listaDeCarros);
    }
}
