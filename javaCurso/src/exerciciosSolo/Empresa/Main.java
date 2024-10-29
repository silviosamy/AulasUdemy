package exerciciosSolo.Empresa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Main main = new Main();
        List<Funcionario> listFuncionarios1 = new ArrayList<>();
        List<Funcionario> listFuncionarios2 = new ArrayList<>();
        List<Funcionario> listFuncionarios3 = new ArrayList<>();

        Empresa empresa1 = new Empresa("Amanco");
        Empresa empresa2 = new Empresa("BMW");
        Empresa empresa3 = new Empresa("Tigre");
        empresa1.getListEmpresas().add(empresa1);
        empresa1.getListEmpresas().add(empresa2);
        empresa1.getListEmpresas().add(empresa3);

        listFuncionarios1.add(new Funcionario("André"));
        listFuncionarios1.add(new Funcionario("Diego"));
        empresa1.setListFuncionarios(listFuncionarios1);

        listFuncionarios2.add(new Funcionario("Roberto"));
        listFuncionarios2.add(new Funcionario("Gabriel"));
        listFuncionarios2.add(new Funcionario("Leonardo"));
        empresa2.setListFuncionarios1(listFuncionarios2);

        listFuncionarios3.add(new Funcionario("Roberto"));
        listFuncionarios3.add(new Funcionario("Gabriel"));
        listFuncionarios3.add(new Funcionario("Leonardo"));
        listFuncionarios3.add(new Funcionario("Pamela"));
        listFuncionarios3.add(new Funcionario("Sandro"));
        empresa3.setListFuncionarios2(listFuncionarios3);


        System.out.println(main.qtdFuncionarios(empresa1));
        System.out.println(main.qtdFuncionarios(empresa2));
        System.out.println(main.qtdFuncionarios(empresa3));

    }


    public int qtdFuncionarios(Empresa empresa) {
        return empresa.getListFuncionarios().size();
    }
}