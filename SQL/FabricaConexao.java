package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {

    public static Connection getConexao() {
        try {
            final String url = "jdbc:mysql://localhost/wm?verifyServerCertificate=false&useSSL=false";
            final String usuario = "root";
            final String senha = "34667008";

            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
