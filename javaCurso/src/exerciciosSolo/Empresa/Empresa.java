package exerciciosSolo.Empresa;

import java.util.List;

public class Empresa {

    String cnpjEmpresa;

    @Override
    public String toString() {
        return nome;
    }

    public Empresa(String nome, String cnpjEmpresa) {
        this.nome = nome;
        this.cnpjEmpresa = cnpjEmpresa;
    }

    public String getCnpjEmpresa() {
        return cnpjEmpresa;
    }

    public void setCnpjEmpresa(String cnpjEmpresa) {
        this.cnpjEmpresa = cnpjEmpresa;
    }

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