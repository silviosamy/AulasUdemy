package exerciciosSolo;

import java.util.ArrayList;
import java.util.List;

public class ExercicioArray {
    public static void main(String[] args) {

        List<String> lista1 = new ArrayList();
        List<String> lista2 = new ArrayList();

        lista1.add("aaa");
        lista1.add("bbb");
        lista1.add("ccc");

        lista2.add("aaa");
        lista2.add("bbb");
        lista2.add("ccc");

        for (int i = 0; i < lista1.size(); i++) {
            lista2.add(lista1.get(i));
        }
        lista1.clear();
        System.out.println("Lista 2: " + lista2);
        System.out.println("Lista 1: " + lista1);

    }
}
