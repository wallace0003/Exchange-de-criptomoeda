package controller;

import DAO.Conexao;
import DAO.InvestidorDAO;
import model.Investidor;
import view.CadastroFrame;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Carteira;
import model.Moeda;

public class ControllerCadastro {
    private CadastroFrame viewCadastro;
    private Moeda bitcoin, ripple, ethereum;
    private Investidor investido;

    public ControllerCadastro(CadastroFrame viewCadastro) {
        this.viewCadastro = viewCadastro;
    }
    
    public void cadastrarInvestido(){
        String nome = viewCadastro.getTextNome().getText();
        String cpf = viewCadastro.getTextCpf().getText();
        String senha = viewCadastro.getTextSenha().getText();
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
            JOptionPane.showMessageDialog(viewCadastro, "Investidor cadastrado",
                    "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(viewCadastro, "Investidor "
                                          + "não cadastrado!"+ e.getMessage(),
                                          "Erro", JOptionPane.ERROR_MESSAGE);
        }}
        else{
            JOptionPane.showMessageDialog(viewCadastro, 
                                    "A senha deve conter exatamente 6 números."
                                     + "CPF deve conter 11 números exatamente.",
                                    "Erro", JOptionPane.ERROR_MESSAGE);
        } 
    }
}
