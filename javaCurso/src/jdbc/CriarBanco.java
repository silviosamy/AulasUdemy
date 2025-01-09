package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
    public static void main(String[] args) throws SQLException {

        final String url = "jdbc:mysql://localhost/wm?verifyServerCertificate=false&useSSL=false";
        final String usuario = "root";
        final String senha = "34667008";

        Connection conexao = DriverManager
                .getConnection(url, usuario, senha);

        Statement stmt = conexao.createStatement();
        stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java"); //IF NOT EXISTS garante que o código// execute sem problemas, mesmo que já tenha banco de dados.

        System.out.println("Banco criado com sucesso!");
        conexao.close();
    }
}
