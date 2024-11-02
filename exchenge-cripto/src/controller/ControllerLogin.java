package controller;
import DAO.Conexao;
import DAO.InvestidorDAO;
import model.Investidor;
import view.LoginFrame;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Carteira;
import model.Moeda;
import view.CadastroFrame;
import view.ComprarCripFrame;
import view.ConsulExtratoFrame;
import view.ConsulSaldoFrame;
import view.DepositarFrame;
import view.MenuFrame;
import view.SacarFrame;
import view.SenhaCompraCripFrame;
import view.SenhaVendeCripFrame;
import view.VendeCripFrame;


public class ControllerLogin {
    private Moeda bitcoin, ripple, ethereum;
    private Investidor investido;
    private LoginFrame loginFrame;
    private MenuFrame menuFrame;
    private ConsulSaldoFrame consulSaldoFrame;
    private CadastroFrame cadastroFrame;
    private ComprarCripFrame compraCripFrame;
    private ConsulExtratoFrame consulExtratoFrame;
    private DepositarFrame depositarFrame;
    private SacarFrame sacarFrame;
    private SenhaCompraCripFrame senhaCompraCripFrame;
    private SenhaVendeCripFrame senhaVendeCripFrame;
    private VendeCripFrame vendeCripFrame;

    public ControllerLogin(){
        loginFrame = new LoginFrame(this);
        loginFrame.setVisible(true);    
        menuFrame = new MenuFrame(this);
        consulSaldoFrame = new ConsulSaldoFrame(this);
        cadastroFrame = new CadastroFrame(this);
        compraCripFrame = new ComprarCripFrame(this);
        consulExtratoFrame = new ConsulExtratoFrame(this);
        depositarFrame = new DepositarFrame(this);
        sacarFrame = new SacarFrame(this);
        senhaCompraCripFrame = new SenhaCompraCripFrame(this);
        senhaVendeCripFrame = new SenhaVendeCripFrame(this);
        vendeCripFrame = new VendeCripFrame(this);
    }
    
    
    //Construtor para a lógica do login do usuário
    public void realizarLogin(){
    Investidor investidor = new 
        Investidor(loginFrame.getTextSenha().getText(), null, null,
                   loginFrame.getTextCpf().getText());
    Conexao conexao = new Conexao();
        try {
            Connection conn = conexao.getConnection();
            InvestidorDAO dao = new InvestidorDAO(conn);
            ResultSet res = dao.consultarInvestidor(investidor);
        
            if (res.next()) {
                // Captura o nome e o CPF do usuário logado
                String nome = res.getString("nome");
                String cpf = res.getString("cpf");


                // Fechar a janela de login e abrir a janela do menu
                loginFrame.setVisible(false);

                // Passa os dados para a próxima janela
                menuFrame.setjLNome(nome);
                menuFrame.setjLCpf(cpf);
                menuFrame.setVisible(true);

            }
            else {
                JOptionPane.showMessageDialog(loginFrame, 
                        "Senha ou CPF incorreto!", "Erro", 
                         JOptionPane.ERROR_MESSAGE);
                }
        } 
    
        catch (SQLException e) {
            JOptionPane.showMessageDialog(loginFrame, "Erro de conexão: " + 
                        e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
    }
    
  
    public void sair(){
        menuFrame.setVisible(false);
        loginFrame.setVisible(true);
    }
    
    
    //Construtor para a lógica do cadastro.
    public void irCadastrar(){
        loginFrame.setVisible(false);
        cadastroFrame.setVisible(true);
    }
    
    public void cadastroParaLogin(){
        cadastroFrame.setVisible(false);
        loginFrame.setVisible(true);
    }
    
    public void cadastrarInvestido(){
        String nome = cadastroFrame.getTextNome().getText();
        String cpf = cadastroFrame.getTextCpf().getText();
        String senha = cadastroFrame.getTextSenha().getText();
        Moeda real = new Moeda ("real", 0.0);
        Moeda bitcoin = new Moeda("bitcoin", 0.0);
        Moeda ripple = new Moeda ("ripple", 0.0);
        Moeda ethereum = new Moeda ("ethereum" , 0.0);
        Carteira carteira = new Carteira(real, ripple, bitcoin, ethereum);
        Investidor investidor = new Investidor(senha, carteira, nome, cpf);
        
        Conexao conexao = new Conexao();
        if(senha.matches("\\d{6}") && cpf.matches("\\d{11}")){
       
        try{
            Connection conn = conexao.getConnection();
            InvestidorDAO dao = new InvestidorDAO(conn);
            dao.inserirInvestidor(investidor);
            JOptionPane.showMessageDialog(cadastroFrame, "Investidor cadastrado"
                    ,"Aviso", JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(cadastroFrame, "Investidor "
                                          + "não cadastrado!"+ e.getMessage(),
                                          "Erro", JOptionPane.ERROR_MESSAGE);
        }}
        else{
            JOptionPane.showMessageDialog(cadastroFrame, 
                                    "A senha deve conter exatamente 6 números."
                                     + "CPF deve conter 11 números exatamente.",
                                    "Erro", JOptionPane.ERROR_MESSAGE);
        } 
    }
    
    //Construtor para a Lógica do saldo.
    public void menuParaConsul(){
        menuFrame.setVisible(false);
        consulSaldoFrame.setVisible(true);
    }
    
    public void consulParaMenu(){
        consulSaldoFrame.setVisible(false);
        menuFrame.setVisible(true);
        consulSaldoFrame.getjLvalorReais().
                                    setText("?");
                consulSaldoFrame.getjLValorBitcoin().
                                   setText("?");
                consulSaldoFrame.getjLValorRipple().
                                    setText("?");
                consulSaldoFrame.getjLValorEthereum().
                                  setText("?");
    }
    
    public void exibeSaldo(){
        String senhaFornecida = consulSaldoFrame.getTextSenha().getText();

        // Verifica se a senha foi fornecida
        if (senhaFornecida.isEmpty()) {
            JOptionPane.showMessageDialog(consulSaldoFrame, 
                    "Por favor, insira a senha para consultar o saldo.", 
                    "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String cpf = menuFrame.getjLCpf().getText();
        Investidor investidor = new Investidor(senhaFornecida, null, null, cpf);

        try(Connection conn = new Conexao().getConnection()) {
            InvestidorDAO dao = new InvestidorDAO(conn);
            ResultSet res = dao.consultarInvestidor(investidor);

            if (res.next()) {
                double saldoReais = res.getDouble("real");
                double saldoBitcoin = res.getDouble("bitcoin");
                double saldoRipple = res.getDouble("ripple");
                double saldoEthereum = res.getDouble("ethereum");

                // Atualiza os labels com os valores de saldo
                consulSaldoFrame.getjLvalorReais().
                                    setText(String.format("%.2f", saldoReais));
                consulSaldoFrame.getjLValorBitcoin().
                                   setText(String.format("%.8f", saldoBitcoin));
                consulSaldoFrame.getjLValorRipple().
                                    setText(String.format("%.8f", saldoRipple));
                consulSaldoFrame.getjLValorEthereum().
                                  setText(String.format("%.8f", saldoEthereum));
            }else {
                JOptionPane.showMessageDialog(consulSaldoFrame, 
                        "Senha incorreta! Tente novamente.", "Erro", 
                        JOptionPane.ERROR_MESSAGE);
            }
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(consulSaldoFrame, 
                    "Erro ao consultar saldo: " + e.getMessage(), "Erro", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Construtor para a lógica de depositar.
    public void menuParaDepositar(){
        menuFrame.setVisible(false);
        depositarFrame.setVisible(true);
    }
    
    public void depositarParaMenu(){
        depositarFrame.setVisible(false);
        menuFrame.setVisible(true);
    }
    
    


    
    
}
