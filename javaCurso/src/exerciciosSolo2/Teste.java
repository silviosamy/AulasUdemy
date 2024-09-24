package exerciciosSolo2;

import java.util.ArrayList;
import java.util.List;

public class Teste {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("João", 23);
        Pessoa pessoa2 = new Pessoa("Maria", 30);

        List<Carro> listaDeCarros = new ArrayList<>();
        listaDeCarros.add(new Carro("Ferrari", 2018));
        listaDeCarros.add(new Carro("Porsche", 2004));
        listaDeCarros.add(new Carro("Jeep", 2023));

        List<Carro> listaEsportivos = new ArrayList<>();
        listaEsportivos.add(new Carro("Fusca", 2012));
        listaEsportivos.add(new Carro("BMW", 2023));

        pessoa1.setCarro(listaDeCarros);
        pessoa2.setCarro(listaEsportivos);

        String carrosPessoa1 = "";
        String carrosPessoa2 = "";

        for (Carro carros1 : pessoa1.getCarro()) {
            carrosPessoa1 = carrosPessoa1 + "\nModelo: "
                    + carros1.getMarca() + ". Ano: " +
                    carros1.getAno();
        }
        for (Carro carros2 : pessoa2.getCarro()) {
            carrosPessoa2 = carrosPessoa2 + "\nModelo: "
                    + carros2.getMarca() + ". Ano: " +
                    carros2.getAno();
        }
        System.out.println("O nome da Pessoa 1 é: " + pessoa1.getNome() + " e ele possui "
                + pessoa1.getCarro().size() + " carros.\n " + carrosPessoa1);
        System.out.println();
        System.out.println("O nome da Pessoa 2 é: " + pessoa2.getNome() + " e ela possui "
                + pessoa2.getCarro().size() + " carros.\n " + carrosPessoa2);
    }
}
