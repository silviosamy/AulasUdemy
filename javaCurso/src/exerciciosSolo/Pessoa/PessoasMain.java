package exerciciosSolo.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class PessoasMain {
    public static void main(String[] args) {

        List<Pessoa> listPessoas = new ArrayList<>();
        listPessoas.add(new Pessoa("Silvio"));
        listPessoas.add(new Pessoa("Henrique"));
        listPessoas.add(new Pessoa("Sandro"));

        for (Pessoa pessoa : listPessoas) {
            List<Vereador> listVereadores = new ArrayList<>();
            listVereadores.add(new Vereador("Fulano", "PT"));
            listVereadores.add(new Vereador("Beltrano", "PMDB"));
            listVereadores.add(new Vereador("Ciclano", "PCDoB"));

            List<Prefeito> listPrefeitos = new ArrayList<>();
            listPrefeitos.add(new Prefeito("Carlito", "PT"));
            listPrefeitos.add(new Prefeito("Adriano", "NOVO"));
            listPrefeitos.add(new Prefeito("Lima", "Não sei"));

        }
    }
}
