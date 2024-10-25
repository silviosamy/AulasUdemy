package exerciciosSolo.Media;

import java.util.List;

public class Pessoa {

    private int idade;
    private char sexo;
    private double salario;

    public Pessoa(int idade, char sexo, double salario) {
        this.idade = idade;
        this.sexo = sexo;
        this.salario = salario;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double mediaSalario(List<Pessoa> listPessoas) {
        double somaSalario = 0;
        for (Pessoa pessoa : listPessoas) {
            somaSalario = somaSalario + pessoa.getSalario(); // Aqui ele soma todos os salarios dentro da listPessoas.
        }
        return somaSalario / listPessoas.size();
    }

}
