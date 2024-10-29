package exerciciosSolo.Media;

import java.util.ArrayList;
import java.util.List;


public class UtilClass {


    public double mediaSalario(List<Pessoa> listPessoas) {
        double somaSalario = 0;
        for (Pessoa pessoa : listPessoas) {
            somaSalario = somaSalario + pessoa.getSalario(); // Aqui ele soma todos os salarios dentro da listPessoas.
        }
        return somaSalario / listPessoas.size();
    }

    public int maiorIdade(List<Pessoa> listPessoas) { // métodoo para pegar a maior idade
        int maiorValor = 0;
        for (Pessoa pessoa : listPessoas) {
            if (pessoa.getIdade() > maiorValor) {
                maiorValor = pessoa.getIdade();
            }
        }
        return maiorValor;
    }

    public int menorIdade(List<Pessoa> listPessoas) { //metodo para pega a menor idade
        int menorValor = 999;
        for (Pessoa pessoa : listPessoas) {
            if (pessoa.getIdade() < menorValor) {
                menorValor = pessoa.getIdade();
            }
        }
        return menorValor;
    }

    public int mostraMenor(List<Pessoa> listPessoas) {
        int quantidade = 0;
        for (Pessoa pessoa : listPessoas) {
            if (pessoa.getSexo() == 'F' && pessoa.getSalario() < 100) {
                quantidade++;
            }
        }
        return quantidade;
    }
}
