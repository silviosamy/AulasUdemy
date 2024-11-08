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

        Empresa empresa1 = new Empresa("Amanco", "1111", 8901.0);
        Empresa empresa2 = new Empresa("BMW", "2222", 300.0);
        Empresa empresa3 = new Empresa("Tigre", "3333", 9000.0);


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
        System.out.println("Empresa com maior numero de Funcionários: " + main.maiorQtdFuncionarios(listEmpresas).toString());
        System.out.println("Empresas em ordem decrescente por faturamento: ");

        listEmpresas.stream()
                .sorted((e1, e2) -> Double.compare(e2.getFaturamento(), e1.getFaturamento()))
                .forEach(System.out::println);
    }

    public Empresa maiorQtdFuncionarios(List<Empresa> listEmpresas) {
        int maior = 0;
        String cnpjDaEmpresaMaior = "";
        for (Empresa empresa : listEmpresas) {
            if (empresa.getListFuncionarios().size() > maior) {
                maior = empresa.getListFuncionarios().size();
                cnpjDaEmpresaMaior = empresa.getCnpjEmpresa();
            }
        }
        for (Empresa empresa : listEmpresas) {
            if (empresa.getCnpjEmpresa().equals(cnpjDaEmpresaMaior)) {
                return empresa;
            }
        }
        return null;
    }


    public int qtdFuncionarios(Empresa empresa) {
        return empresa.getListFuncionarios().size();
    }

    //public Object faturamentoEmpresa(List<Empresa> listEmpresas) {
    //  sort(listEmpresas, new Comparator<Empresa>() {
    //      public int compare(Empresa e1, Empresa e2) {
    //          return Double.compare(e2.getFaturamento(), e1.getFaturamento());
    //      }
    //  } return compare;
    //}
}