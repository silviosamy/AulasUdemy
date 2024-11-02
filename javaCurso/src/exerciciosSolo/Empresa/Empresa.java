package exerciciosSolo.Empresa;

import java.util.List;

public class Empresa {

    private String cnpjEmpresa;
    private double faturamento;

    public Empresa(String nome, String cnpjEmpresa, double faturamento) {
        this.nome = nome;
        this.cnpjEmpresa = cnpjEmpresa;
        this.faturamento = faturamento;
    }

    public double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(double faturamento) {
        this.faturamento = faturamento;
    }

    public String toString() {
        return nome;
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