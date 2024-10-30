package exerciciosSolo.Empresa;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String nome;
    List<Funcionario> listFuncionarios;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Funcionario> getListFuncionarios() {
        return listFuncionarios;
    }

    public void setListFuncionarios(List<Funcionario> listFuncionarios) {
        this.listFuncionarios = listFuncionarios;
    }

    public Empresa(String nome) {
        this.nome = nome;
    }
}