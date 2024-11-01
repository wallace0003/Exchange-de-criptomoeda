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
import view.ConsulSaldoFrame;
import view.MenuFrame;


public class ControllerLogin {
    private LoginFrame loginFrame;
    private MenuFrame menuFrame;
    private ConsulSaldoFrame consulSaldoFrame;
    private CadastroFrame cadastroFrame;
    private Moeda bitcoin, ripple, ethereum;
    private Investidor investido;

    public ControllerLogin(){
        loginFrame = new LoginFrame(this);
        loginFrame.setVisible(true);    
        menuFrame = new MenuFrame(this);
        consulSaldoFrame = new ConsulSaldoFrame();
        cadastroFrame = new CadastroFrame(this);
    }
    
    
    //Realiza login do usuário.
    public void realizarLogin(){
    Investidor investidor = new 
        Investidor(loginFrame.getTextSenha().getText(), null, null,
                   loginFrame.getTextCpf().getText());
    Conexao conexao = new Conexao();
        try {
            Connection conn = conexao.getConnection();
            InvestidorDAO dao = new InvestidorDAO(conn);
            ResultSet res = dao.consultar(investidor);
        
            if (res.next()) {
                // Captura o nome e o CPF do usuário logado
                String nome = res.getString("nome");
                String cpf = res.getString("cpf");

                JOptionPane.showMessageDialog(loginFrame, 
                        "Login efetuado", "Aviso", 
                        JOptionPane.INFORMATION_MESSAGE);

                // Fechar a janela de login e abrir a janela do menu
                loginFrame.setVisible(false);

                // Passa os dados para a próxima janela
                menuFrame.setjLNome(nome);
                menuFrame.setjLCpf(cpf);
                menuFrame.setVisible(true);

            }
            else {
                JOptionPane.showMessageDialog(loginFrame, 
                        "Senha ou CPF incorreto!", "Erro", JOptionPane.ERROR_MESSAGE);
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
            dao.inserir(investidor);
            JOptionPane.showMessageDialog(cadastroFrame, "Investidor cadastrado",
                    "Aviso", JOptionPane.INFORMATION_MESSAGE);
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
}
