package DAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Investidor;
import java.sql.PreparedStatement;
import model.Extrato;
import model.Data;

public class InvestidorDAO {
    private Connection conn;

    public InvestidorDAO(Connection conn) {
        this.conn = conn;
    }
    
    public void inserirInvestidor (Investidor investidor) throws SQLException {
    String sql = "INSERT INTO investidores.investidor (nome, cpf, senha, real, "
                + "bitcoin, ethereum, ripple) VALUES (?, ?, ?, ?, ?, ?, ?)";

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
    
    public ResultSet consultarInvestidor (Investidor investidor)throws SQLException{
        //Este comando é vunerável
        //String sql = "select * from aluno where usuario = '"
              //  + aluno.getUsuario() + "' AND senha = '"
               // + aluno.getSenha() + "'";
        String sql = "select * from investidores.investidor"
                     + " where cpf = ? AND senha = ?";
        
        PreparedStatement statement =  conn.prepareStatement(sql);
        statement.setString(1, investidor.getCpf());
        statement.setString(2, investidor.getSenha());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    }
    
    public void inserirExtrato (Extrato extrato) throws SQLException{
    String sql = "INSERT INTO investidores.extrato (cpf, nome, real, bitcoin, "
            + "ethreum, ripple, taxa, tipoMoeda, valor, ct, data, hora) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    try (PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setString(1, extrato.getCpf());
        stmt.setString(2, extrato.getNome());
        stmt.setDouble(3, extrato.getSaldoReal());
        stmt.setDouble(4, extrato.getSaldoBitcoin());
        stmt.setDouble(5, extrato.getSaldoEthereum());
        stmt.setDouble(6, extrato.getSaldoRipple());
        stmt.setDouble(7, extrato.getTaxaTransacao());
        stmt.setString(8, extrato.getTipoMoeda());
        stmt.setDouble(9, extrato.getValorOperacao());
        stmt.setDouble(10, extrato.getCt());
        stmt.setString(11, String.valueOf(extrato.getDataOperacao()));
        stmt.setString(12, String.valueOf(extrato.getHoraOperacao()));
        stmt.executeUpdate();
        }
    }
    
}
