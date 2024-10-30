package controller;
import DAO.Conexao;
import DAO.InvestidorDAO;
import model.Investidor;
import view.LoginFrame;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import view.MenuFrame;


public class ControllerLogin {
    private LoginFrame loginFrame;
    private MenuFrame menuFrame;

    public ControllerLogin(LoginFrame loginFrame,
                           MenuFrame menuFrame){
            this.loginFrame = loginFrame;
            this.menuFrame = menuFrame;
    }
    
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
            
            JOptionPane.showMessageDialog(loginFrame, "Login efetuado", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            
            // Fechar a janela de login e abrir a janela do menu
            loginFrame.setVisible(false);
            
            // Passa os dados para a próxima janela
            menuFrame.setjLNome(nome);
            menuFrame.setjLCpf(cpf);
            menuFrame.setVisible(true);
            
        } else {
            JOptionPane.showMessageDialog(loginFrame, "Senha ou CPF incorreto!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    } 
    catch (SQLException e) {
        JOptionPane.showMessageDialog(loginFrame, "Erro de conexão: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
    }
    }
    
    
    
}
