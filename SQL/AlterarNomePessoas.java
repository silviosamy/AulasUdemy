package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarNomePessoas {
    public static void main(String[] args) throws SQLException {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o código da pessoa: "); //Solicita o código para o usuário
        int codigo = entrada.nextInt(); // Código que o usuário quer fazer o update


        String selectSQL = "SELECT codigo, nome FROM pessoas WHERE codigo = ?"; // Código no mySQL p/ SELECT
        String updateSQL = "UPDATE pessoas SET nome = ? WHERE codigo = ?"; //Código no mySQL p/ UPDATE

        Connection conexao = FabricaConexao.getConexao(); //Conexao com o banco
        PreparedStatement stmt = conexao.prepareStatement(selectSQL); //
        stmt.setInt(1, codigo); //statement em qual parâmetro será feito o Update
        ResultSet r = stmt.executeQuery(); //Selecionou o código da pessoa , a partir do resultSet

        if (r.next()) { //Se encontrar, ele cria a pessoa, mostra o nome atual da pessoa
            Pessoa p = new Pessoa(r.getInt(1), r.getString(2));
            System.out.println("O Nome atual é : " + p.getNome());
            entrada.nextLine();

            System.out.println("Informe o novo nome: ");
            String novoNome = entrada.nextLine(); //Solicita o novo nome

            stmt.close();
            stmt = conexao.prepareStatement(updateSQL); //Aqui faz o update
            stmt.setString(1, novoNome); //Setado os novos parâmetros passados
            stmt.setInt(2, codigo); //Setado os novos parâmetros passados
            stmt.execute(); //Aqui executa o UPDATE(comando SQL)

            System.out.println("Pessoa alterada com sucesso!"); //Caso tenha dado essa mensagem, deu certo.
        } else {
            System.out.println("Pessoa não encontrada."); //Caso não encontre, informa aqui.
        }
        conexao.close();
        entrada.close();


    }
}
