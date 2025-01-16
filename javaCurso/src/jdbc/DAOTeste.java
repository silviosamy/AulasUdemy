package jdbc;

public class DAOTeste {
    public static void main(String[] args) {

        DAO dao = new DAO();

        String sql = "INSERT INTO pessoas (nome) VALUES(?)";

        dao.incluir(null, "João da Silva");
        dao.incluir(null, "Ana Júlia");
        dao.incluir(null, "Djalma Pereira");
    }
}
