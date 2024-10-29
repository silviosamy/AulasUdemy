package exerciciosSolo.Intermediario;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Main main = new Main();
        List<Pessoa> listPessoas = new ArrayList<>();

        listPessoas.add(new Pessoa(30, 70.4, 1.91, "Azul", "Preto"));
        listPessoas.add(new Pessoa(59, 50.4, 1.70, "Preto", "Castanho"));
        listPessoas.add(new Pessoa(51, 59.4, 1.85, "Verde", "Louro"));
        listPessoas.add(new Pessoa(22, 69.3, 1.59, "Castanho", "Castanho"));
        listPessoas.add(new Pessoa(29, 85.4, 1.91, "Preto", "Preto"));
        listPessoas.add(new Pessoa(36, 100.4, 1.70, "Preto", "Castanho"));
        listPessoas.add(new Pessoa(49, 55.4, 1.49, "Castanho", "Louro"));
        listPessoas.add(new Pessoa(48, 80.3, 1.59, "Castanho", "Ruivo"));
        listPessoas.add(new Pessoa(19, 73.1, 1.91, "Azul", "Preto"));
        listPessoas.add(new Pessoa(50, 59.7, 1.70, "Preto", "Castanho"));
        listPessoas.add(new Pessoa(58, 55.1, 1.45, "Verde", "Louro"));
        listPessoas.add(new Pessoa(30, 82.9, 1.59, "Castanho", "Ruivo"));
        listPessoas.add(new Pessoa(29, 74.0, 1.91, "Verde", "Ruivo"));
        listPessoas.add(new Pessoa(51, 79.1, 1.70, "Verde", "Castanho"));
        listPessoas.add(new Pessoa(93, 70.7, 1.49, "Verde", "Louro"));
        listPessoas.add(new Pessoa(60, 70.9, 1.59, "Castanho", "Preto"));
        listPessoas.add(new Pessoa(43, 85.3, 1.91, "Azul", "Preto"));
        listPessoas.add(new Pessoa(47, 60.1, 1.70, "Preto", "Ruivo"));
        listPessoas.add(new Pessoa(39, 59.0, 1.85, "Verde", "Preto"));
        listPessoas.add(new Pessoa(23, 70.8, 1.59, "Preto", "Ruivo"));

        System.out.println("Quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 quilos: " + main.idadeSuperior(listPessoas));
        System.out.println("Média das idades das pessoas com altura inferior a 1,50: " + main.mediaIdadeAltura(listPessoas) + " anos.");
        System.out.println("Porcentagem de pessoas com olhos azuis entre as pessoas analisadas: " + main.porcentagemOlhosAzuis(listPessoas) + "% .");
        System.out.println("Quantidade de pessoas ruivas que não possuem olhos azuis: " + main.ruivasNaoAzuis(listPessoas));

    }

    public int ruivasNaoAzuis(List<Pessoa> listPessoas) {
        int total = 0;
        for (Pessoa pessoa : listPessoas) {
            if (pessoa.getCorCabelo().equals("Ruivo") && !pessoa.getCorOlhos().equals("Azul")) {
                total++;
            }
        }
        return total;
    }

    public double porcentagemOlhosAzuis(List<Pessoa> listPessoas) {
        int total = 0;
        double porcentagem = 0;

        for (Pessoa pessoa : listPessoas) {
            if (pessoa.getCorOlhos().equals("Azul")) {
                total++;
            }
        }
        porcentagem = (total * 100) / listPessoas.size();
        return porcentagem;
    }

    public int mediaIdadeAltura(List<Pessoa> listPessoas) {
        int qtdPessoas = 0;
        int idadeTotal = 0;
        for (Pessoa pessoa : listPessoas) {
            if (pessoa.getAltura() < 1.50) {
                qtdPessoas++;
                idadeTotal += pessoa.getIdade();
            }

        }
        return idadeTotal / qtdPessoas;
    }

    public int idadeSuperior(List<Pessoa> listPessoas) {
        int total = 0;
        for (Pessoa pessoa : listPessoas) {
            if (pessoa.getIdade() > 50 && pessoa.getPeso() < 60.0) {
                total++;
            }
        }
        return total;
    }
}
