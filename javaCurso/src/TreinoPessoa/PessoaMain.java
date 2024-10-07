package TreinoPessoa;

import java.util.ArrayList;
import java.util.List;

public class PessoaMain {
    public static void main(String[] args) {

        List<Pessoa> listPessoas = new ArrayList<>();

        listPessoas.add(new Pessoa("Silvio"));
        listPessoas.add(new Pessoa("Roberta"));
        listPessoas.add(new Pessoa("João"));


        for (Pessoa pessoa : listPessoas) {
            List<Prefeito> listPrefeitos = new ArrayList<>();
            List<Vereador> listVereadores = new ArrayList<>();
            if (pessoa.getNome().equals("Silvio")) {
                listPrefeitos.add(new Prefeito("Adriano", "Novo"));
            } else {
                listPrefeitos.add(new Prefeito("João", "Velho"));
                listPrefeitos.add(new Prefeito("Ana", "PT"));
            }
            listVereadores.add(new Vereador("Fulano", "PT"));
            listVereadores.add(new Vereador("Ciclano", "Novo"));
            listVereadores.add(new Vereador("Zézinho", "PCdoB"));
            pessoa.setListVereadores(listVereadores);
            pessoa.setListPrefeitos(listPrefeitos);
        }
        for (Pessoa pessoa : listPessoas) {
            System.out.println("\n\nEleitor: " + pessoa.getNome());
            for (Prefeito prefeito : pessoa.getListPrefeitos()) {
                System.out.println(" \nPrefeito:" + prefeito.getNome());
                System.out.println("Partido: " + prefeito.getPartido());
            }
            for (Vereador vereador : pessoa.getListVereadores()) {
                System.out.println("\nVereador: " + vereador.getNome());
                System.out.println("Partido: " + vereador.getPartido());
            }
        }
    }
}
