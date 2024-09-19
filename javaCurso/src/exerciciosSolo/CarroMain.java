package exerciciosSolo;

import java.util.ArrayList;
import java.util.List;

public class CarroMain {
    public static void main(String[] args) {

        List<Carro> carros = new ArrayList<>();

        carros.add(new Carro("Ferrari", 2016));
        carros.add(new Carro("Jeep", 2023));
        carros.add(new Carro("Mustang", 1969));

        for (Carro c : carros) {

            if (c.getNome().equals("Ferrari")) {
                c.setNome("Ferrari excluída");
            }
            if (c.getAno() < 2010) {
                c.setStatus(" Antigo");
                System.out.println(carros.toString());
            } else {
                c.setStatus(" Novo");
            }
        }
        System.out.println(carros.toString());
    }
}