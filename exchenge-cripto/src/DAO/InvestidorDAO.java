package DAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Investidor;
import java.sql.PreparedStatement;

public class InvestidorDAO {
    private Connection conn;

    public InvestidorDAO(Connection conn) {
        this.conn = conn;
    }
    
    public void inserir(Investidor investidor) throws SQLException {
    String sql = "INSERT INTO aluno (nome, cpf, senha, real, bitcoin, "
                + "ethereum, ripple) VALUES (?, ?, ?, ?, ?, ?, ?)";

    try (PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setString(1, investidor.getNome());
        stmt.setString(2, investidor.getCpf());
        stmt.setString(3, investidor.getSenha());
        stmt.setDouble(4, 0.0);  // Valor para "real"
        stmt.setDouble(5, 0.0);  // Valor para "bitcoin"
        stmt.setDouble(6, 0.0);  // Valor para "ethereum"
        stmt.setDouble(7, 0.0);  // Valor para "ripple"
        stmt.executeUpdate();
    }
}
}
