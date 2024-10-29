package exerciciosSolo.Empresa;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    List<Empresa> listEmpresas = new ArrayList<>();

    public List<Empresa> getListEmpresas() {
        return listEmpresas;
    }

    public void setListEmpresas(List<Empresa> listEmpresas) {
        this.listEmpresas = listEmpresas;
    }

    List<Funcionario> listFuncionarios = new ArrayList<>();
    List<Funcionario> listFuncionarios1 = new ArrayList<>();
    List<Funcionario> listFuncionarios2 = new ArrayList<>();

    public Empresa(List<Funcionario> listFuncionarios) {
        this.listFuncionarios = listFuncionarios;
    }

    public List<Funcionario> getListFuncionarios1() {
        return listFuncionarios1;
    }

    public void setListFuncionarios1(List<Funcionario> listFuncionarios1) {
        this.listFuncionarios1 = listFuncionarios1;
    }

    public List<Funcionario> getListFuncionarios2() {
        return listFuncionarios2;
    }

    public void setListFuncionarios2(List<Funcionario> listFuncionarios2) {
        this.listFuncionarios2 = listFuncionarios2;
    }

    private String nome;

    public Empresa(String nome) {
        this.nome = nome;
    }

    public List<Funcionario> getListFuncionarios() {
        return listFuncionarios;
    }

    public void setListFuncionarios(List<Funcionario> listFuncionarios) {
        this.listFuncionarios = listFuncionarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
