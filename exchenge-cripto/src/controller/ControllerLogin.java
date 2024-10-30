package controller;
import DAO.Conexao;
import DAO.InvestidorDAO;
import model.Investidor;
import view.LoginFrame;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ControllerLogin {
    private LoginFrame loginFrame;

    public ControllerLogin(LoginFrame loginFrame) {
        this.loginFrame = loginFrame;
    }
    
    public void realizarLogin(){
        Investidor investidor = new 
            Investidor(loginFrame.getTextSenha().getText(),
            null, null, loginFrame.getTextCpf().getText());
        Conexao conexao = new Conexao();
        try{
            Connection conn = conexao.getConnection();
            InvestidorDAO dao = new InvestidorDAO(conn);
            ResultSet res = dao.consultar(investidor);
            if(res.next()){
                JOptionPane.showMessageDialog(loginFrame, "Login efetuado",
                            "aviso", JOptionPane.INFORMATION_MESSAGE);
                
            } else{
                JOptionPane.showMessageDialog(loginFrame, 
                                             "Senha ou CPF incorreto!",
                                            "Erro" , JOptionPane.ERROR_MESSAGE);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(loginFrame, "Erro de conexão: " 
                                          + e.getMessage(),
                                          "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    
    
}
