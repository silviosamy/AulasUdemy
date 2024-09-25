package exerciciosSolo2;

import java.util.ArrayList;
import java.util.List;

public class Teste1 {

    public static void main(String[] args) {

        List<Pessoa1> listaPessoas1 = new ArrayList<>();


        listaPessoas1.add(new Pessoa1("José", 19));
        listaPessoas1.add(new Pessoa1("Ana", 25));
        listaPessoas1.add(new Pessoa1("André", 25));

        for (Pessoa1 p : listaPessoas1) {
            List<Carro1> listaDeCarros1 = new ArrayList<>();
            listaDeCarros1.add(new Carro1("Ferrari", 2016));
            listaDeCarros1.add(new Carro1("Jeep", 2024));
            listaDeCarros1.add(new Carro1("Audi", 2021));
            p.setCarro(listaDeCarros1);
        }
        for (Pessoa1 p1 : listaPessoas1) {
            System.out.println("Nome: " + p1.getNome());
            for (Pessoa1 c1 : listaPessoas1) {
                System.out.println(" " + c1.getCarro1());
            }
        }
    }
}