package exerciciosSolo.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class PessoasMain {
    public static void main(String[] args) {

        List<Pessoa> listPessoas = new ArrayList<>();
        listPessoas.add(new Pessoa("Silvio"));
        listPessoas.add(new Pessoa("Henrique"));
        listPessoas.add(new Pessoa("Sandro"));

        for (Pessoa pessoa : listPessoas) {//aqui serve para percorrer a lista de pessoas
            // e adicionar prefeitos e vereadores nelas

            //Aqui adiciona os vereadores
            List<Vereador> listVereadores = new ArrayList<>();
            if (pessoa.getNome().equals("Sandro")) {
                listVereadores.add(new Vereador("Fulano", "PT"));
            } else {
                listVereadores.add(new Vereador("Beltrano", "PMDB"));
                listVereadores.add(new Vereador("Ciclano", "PCDoB"));
            }
            pessoa.setListVereadores(listVereadores);

            //Aqui adiciona os prefeitos
            List<Prefeito> listPrefeitos = new ArrayList<>();

            if (pessoa.getNome().equals("Silvio")) {
                listPrefeitos.add(new Prefeito("Adriano", "NOVO"));
            } else {
                listPrefeitos.add(new Prefeito("Carlito", "PT"));
                listPrefeitos.add(new Prefeito("Lima", "PL"));
            }
            pessoa.setListPrefeitos(listPrefeitos);


            for (Prefeito prefeito : listPrefeitos) {
                List<String> listPropostas = new ArrayList<>();
                if (prefeito.getNome().equals("Adriano")) {
                    listPropostas.add("Prometo água");
                    listPropostas.add("Baixar impostos");
                } else {
                    listPropostas.add(new String("Picanha e cerveja"));
                }
                prefeito.setListPropostas(listPropostas);
            }
        }
        for (Pessoa pessoa : listPessoas) { //daqui pra baixo tá certo
            System.out.println("Nome:" + pessoa.getNome());
            for (Vereador vereador : pessoa.getListVereadores()) {
                System.out.println("Indicações p/ vereador: " + vereador.getNome());
            }
            for (Prefeito prefeito : pessoa.getListPrefeitos())
                for (String proposta : prefeito.getListPropostas()) {
                    System.out.println("Indicações p/ Prefeito: " + prefeito.getNome());
                    System.out.println("Propostas: " + prefeito.getListPropostas());
                }
        }
    }

}

