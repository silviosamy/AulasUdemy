package exerciciosSolo.Media;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //foi feita uam pesquisa entre os habitantes de uma região. Foram coletados os dados de idade, sexo M/F e salário
        // Faça um algoritmo que informe:
        //A) A média de salário do grupo;
        //B) Maior e menor idade do grupo;
        //C) Quantidade de mulheres com salário até R$100,00.

        UtilClass utilClass = new UtilClass();
        List<Pessoa> listPessoas = new ArrayList<>();
        listPessoas.add(new Pessoa(25, 'M', 230.0));
        listPessoas.add(new Pessoa(27, 'F', 90.0));
        listPessoas.add(new Pessoa(23, 'F', 103.0));
        listPessoas.add(new Pessoa(19, 'F', 95.0));
        System.out.printf("A) A média de salário do grupo é de: R$" + utilClass.mediaSalario(listPessoas));
        System.out.println();
        System.out.println("B) A pessoa mais velha do grupo tem " +
                utilClass.maiorIdade(listPessoas) + " anos. E a mais nova tem " +
                utilClass.menorIdade(listPessoas) + " anos.");
        System.out.println("C) Quantidade de mulheres com salário abaixo de R$100,00 é : " + utilClass.mostraMenor(listPessoas));
    }


}
