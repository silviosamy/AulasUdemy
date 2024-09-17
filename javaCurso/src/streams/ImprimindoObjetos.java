package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");

        System.out.println("Usando o Foreach...");
        for (String nome : aprovados) {
            System.out.println(nome);
        }
        System.out.println("\nUsando Iterator..");
//        Iterator é uma interface que tem 2 métodos, Tem próximo? Se sim, recebe. Se não, sai do laço.
        Iterator<String> iterator = aprovados.iterator(); //recebe genérico.
        while (iterator.hasNext()) { //Enquanto tiver próximo na lista, ele continua imprimindo o valor.
            System.out.println(iterator.next());
        }
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println); // Laço interno.

    }
}
