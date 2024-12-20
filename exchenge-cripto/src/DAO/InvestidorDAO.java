package DAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Investidor;
import java.sql.PreparedStatement;
import model.Extrato;

public class InvestidorDAO {
    private Connection conn;

    public InvestidorDAO(Connection conn) {
        this.conn = conn;
    }
    
    //lógica da tabela investidor abaixo.
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
    
    public ResultSet consultarInvestidor (Investidor investidor)
        throws SQLException{
        String sql = "select * from investidores.investidor"
                     + " where cpf = ? AND senha = ?";
        
        PreparedStatement statement =  conn.prepareStatement(sql);
        statement.setString(1, investidor.getCpf());
        statement.setString(2, investidor.getSenha());
        statement.execute();
        ResultSet resultado = statement.getResultSet();
        return resultado;
    }
    
    public ResultSet consultarInvestidorPorCpf(Investidor investidor) 
            throws SQLException {
        String sql = "select * from investidores.investidor where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, investidor.getCpf());
        statement.execute();
        return statement.getResultSet();
    }
    
    public void atualizarSaldoReais(Investidor investidor, 
                                    double novoSaldoReais) throws SQLException 
    {
       String sql = "UPDATE investidores.investidor SET real = ? WHERE cpf = ?";
       PreparedStatement statement = conn.prepareStatement(sql);
       // Define o novo valor para o saldo em reais
       statement.setDouble(1, novoSaldoReais); 
       // Define o CPF do investidor para a busca
       statement.setString(2, investidor.getCpf());  
       statement.execute();
       
    }
    
    public void atualizarSaldoBitcoin(Investidor investidor, 
                                    double novoSaldoBitcoin) throws SQLException 
    {
       String sql = "UPDATE investidores.investidor "
                    + "SET bitcoin = ? WHERE cpf = ?";
       PreparedStatement statement = conn.prepareStatement(sql);
       statement.setDouble(1, novoSaldoBitcoin);
       statement.setString(2, investidor.getCpf());  
       statement.execute();
       
    }
    
    public void atualizarSaldoEthereum(Investidor investidor, 
                                    double novoSaldoEthereum) throws SQLException 
    {
       String sql = "UPDATE investidores.investidor "
                    + "SET ethereum = ? WHERE cpf = ?";
       PreparedStatement statement = conn.prepareStatement(sql);
       statement.setDouble(1, novoSaldoEthereum);
       statement.setString(2, investidor.getCpf());  
       statement.execute();
    }
    
    public void atualizarSaldoRipple(Investidor investidor, 
                                    double novoSaldoRipple) throws SQLException 
    {
       String sql = "UPDATE investidores.investidor "
                    + "SET ripple = ? WHERE cpf = ?";
       PreparedStatement statement = conn.prepareStatement(sql);
       statement.setDouble(1, novoSaldoRipple);
       statement.setString(2, investidor.getCpf());  
       statement.execute();
    }
    
    //Lógica da tabela extrato abaixo.
    public void inserirExtrato (Extrato extrato) throws SQLException{
    String sql = "INSERT INTO investidores.extrato (cpf, nome, real, bitcoin, "
            + "ethereum, ripple, taxa, tipomoeda, valor, ct, data, hora, sinal) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

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
        stmt.setString(11, extrato.getDataOperacao());
        stmt.setString(12, extrato.getHoraOperacao());
        stmt.setString(13, extrato.getMaisOuMenos());
        stmt.executeUpdate();
        }
    }
    
    public ResultSet consultarExtratoPorCpf(Investidor investidor) 
            throws SQLException {
        String sql = "select * from investidores.extrato where cpf = ?";
        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setString(1, investidor.getCpf());
        statement.execute();
        return statement.getResultSet();
    }
    
    //lógica da tabela preço abaixo
    public ResultSet consultarPreco() throws SQLException {
        String sql = "SELECT bitcoin, ethereum, ripple FROM investidores.preco";

        PreparedStatement statement = conn.prepareStatement(sql);
        statement.execute();
        return statement.getResultSet();
    }
    
    public void atualizarCotacao(double precoBitcoin, double precoEthereum, 
                                 double precoRipple) throws SQLException{
        String sql = "UPDATE investidores.preco "
                   + "SET bitcoin = ?, ethereum = ?, ripple = ?";

        PreparedStatement statement = conn.prepareStatement(sql);
        statement.setDouble(1, precoBitcoin);
        statement.setDouble(2, precoEthereum);
        statement.setDouble(3, precoRipple);

        statement.executeUpdate();
    }

    
}
