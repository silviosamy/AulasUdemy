package exerciciosSolo.Empresa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Main main = new Main();
        List<Empresa> listEmpresas = new ArrayList<>();
        List<Funcionario> listFuncionarios1 = new ArrayList<>();
        List<Funcionario> listFuncionarios2 = new ArrayList<>();
        List<Funcionario> listFuncionarios3 = new ArrayList<>();

        Empresa empresa1 = new Empresa("Amanco");
        Empresa empresa2 = new Empresa("BMW");
        Empresa empresa3 = new Empresa("Tigre");


        listFuncionarios1.add(new Funcionario("André"));
        listFuncionarios1.add(new Funcionario("Diego"));
        empresa1.setListFuncionarios(listFuncionarios1);

        listFuncionarios2.add(new Funcionario("Roberto"));
        listFuncionarios2.add(new Funcionario("Gabriel"));
        listFuncionarios2.add(new Funcionario("Leonardo"));
        empresa2.setListFuncionarios(listFuncionarios2);

        listFuncionarios3.add(new Funcionario("Roberto"));
        listFuncionarios3.add(new Funcionario("Gabriel"));
        listFuncionarios3.add(new Funcionario("Leonardo"));
        listFuncionarios3.add(new Funcionario("Pamela"));
        listFuncionarios3.add(new Funcionario("Sandro"));
        empresa3.setListFuncionarios(listFuncionarios3);

        listEmpresas.add(empresa1);
        listEmpresas.add(empresa2);
        listEmpresas.add(empresa3);

        System.out.println(empresa1.getNome() + " : " + main.qtdFuncionarios(empresa1) + " funcionários.");
        System.out.println(empresa2.getNome() + " : " + main.qtdFuncionarios(empresa2) + " funcionários.");
        System.out.println(empresa3.getNome() + " : " + main.qtdFuncionarios(empresa3) + " funcionários.");

    }


    public int qtdFuncionarios(Empresa empresa) {
        return empresa.getListFuncionarios().size();
    }


}