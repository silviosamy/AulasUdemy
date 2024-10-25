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


        List<Pessoa> listPessoas = new ArrayList<>();
        listPessoas.add(new Pessoa(25, 'M', 50.0));
        listPessoas.add(new Pessoa(27, 'F', 50.0));
        listPessoas.add(new Pessoa(23, 'F', 50.0));
        listPessoas.add(new Pessoa(19, 'F', 50.0));


    }
}
}
