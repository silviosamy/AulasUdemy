package exerciciosSolo.Banco;

import java.util.ArrayList;
import java.util.List;

public class Teste {

    public static void main(String[] args) {

        List<Usuario> clientesList = new ArrayList<>();
        clientesList.add(new Usuario("Henrique", 32, 'M', "Brasileiro"));

        for (Usuario usuario : clientesList) {
            List<Banco> bancoList = new ArrayList<>();
            bancoList.add(new Banco("Santander", "415", "1234567"));
            bancoList.add(new Banco("Nubank", "100", "9876543"));
            usuario.setContasBanco(bancoList);

        }
        System.out.println();
    }
}
