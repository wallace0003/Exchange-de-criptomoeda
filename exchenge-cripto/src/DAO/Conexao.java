package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
    public Connection getConnection() throws SQLException{
            Connection conexao = DriverManager.getConnection(
            "jdbc:postgresql://localhost:5432/cripto",
            "postgres", "1234");
            return conexao;
    }
    
    //Método para testar se conexão está funcionando.
//    public static void main(String[] args) {
//        Conexao conexaoDB = new Conexao();
//        
//        try (Connection conexao = conexaoDB.getConnection()) {
//            if (conexao != null) {
//                System.out.println("Conexão bem-sucedida!");
//            } else {
//                System.out.println("Falha ao conectar.");
//            }
//        } catch (SQLException e) {
//            System.err.println("Erro ao tentar conectar: " + e.getMessage());
//        }
//    }
}
