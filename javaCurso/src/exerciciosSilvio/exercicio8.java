package exerciciosSilvio;

import java.util.Arrays;
import java.util.Collections;

public class exercicio8 {
    //    Faça um algoritmo que leia três valores inteiros diferentes e
//    imprima na tela os valores em ordem decrescente.
    public static void main(String[] args) {
        Integer[] arrayPequeno = {5, 2, 7};
        Arrays.sort(arrayPequeno, Collections.reverseOrder());
        for (int numero : arrayPequeno) {
            System.out.println(numero);

        }
    }
}
