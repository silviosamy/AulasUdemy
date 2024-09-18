package exerciciosSolo;

import java.util.ArrayList;
import java.util.List;

public class CarroMain {
    public static void main(String[] args) {

        List<Carro> carros = new ArrayList<>();

        carros.add(new Carro("Ferrari", 2016));
        carros.add(new Carro("Jeep", 2023));
        carros.add(new Carro("Mustang", 1969));

        for (Carro lista : carros) {
            System.out.println("Nome: " + lista.nome + ". Ano: " + lista.ano);
        }
    }
}
