package exerciciosSolo;

import java.util.ArrayList;
import java.util.List;

public class numeroMaiorMenor {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();

        lista.add(24);
        lista.add(125);
        lista.add(612);
        lista.add(251);
        lista.add(42);
        lista.add(32);
        lista.add(10);
        lista.add(57);
        lista.add(85);
        lista.add(99);

        int maior = lista.get(0);
        int menor = lista.get(0);

        for (int numero : lista) {
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }
        System.out.println("O maior é: " + maior);
        System.out.println("O menor é: " + menor);
    }
}
