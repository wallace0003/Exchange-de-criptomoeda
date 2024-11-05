package controller;
import DAO.Conexao;
import DAO.InvestidorDAO;
import model.Investidor;
import view.LoginFrame;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import model.Carteira;
import model.Extrato;
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
    
    
    //Constroller para a lógica do login do usuário
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
                ResultSet resPreco = dao.consultarPreco();
                    //Verificando se deu certo a consulta a tabela precos.
                    if (resPreco.next()) { 
                        double valorBitcoin = resPreco.getDouble("bitcoin");
                        double valorEthereum = resPreco.getDouble("ethereum");
                        double valorRipple = resPreco.getDouble("ripple");

                        
                        String valorBitcoinStr = String.format
                        ("%.2f", valorBitcoin);
                        String valorEthereumStr = String.format
                        ("%.2f", valorEthereum);
                        String valorRippleStr = String.format
                        ("%.2f", valorRipple);

                        // Fechar a janela de login e abrir a janela do menu
                        loginFrame.setVisible(false);
                        // Passa os dados para a próxima janela
                        menuFrame.setjLNome(nome);
                        menuFrame.setjLCpf(cpf);
                        menuFrame.getjLBitcoin().setText(valorBitcoinStr);
                        menuFrame.getjLEthereum().setText(valorEthereumStr);
                        menuFrame.getjLRipple().setText(valorRippleStr);
                        menuFrame.setVisible(true);
                        // Limpa os campos de login
                        loginFrame.getTextSenha().setText("");
                        loginFrame.getTextCpf().setText("");
                    } else {
                        JOptionPane.showMessageDialog(loginFrame, 
                            "Erro ao obter os preços das criptomoedas.", 
                            "Erro", JOptionPane.ERROR_MESSAGE);
                    }


                // Fechar a janela de login e abrir a janela do menu
                loginFrame.setVisible(false);

                // Passa os dados para a próxima janela
                menuFrame.setjLNome(nome);
                menuFrame.setjLCpf(cpf);
                menuFrame.setVisible(true);
                loginFrame.getTextSenha().setText("");
                loginFrame.getTextCpf().setText("");
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
    
    
    //Controller para a lógica do cadastro.
    public void irCadastrar(){
        loginFrame.setVisible(false);
        cadastroFrame.setVisible(true);
        loginFrame.getTextSenha().setText("");
        loginFrame.getTextCpf().setText("");
    }
    
    public void cadastroParaLogin(){
        cadastroFrame.setVisible(false);
        loginFrame.setVisible(true);
        loginFrame.getTextSenha().setText("");
        loginFrame.getTextCpf().setText("");
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
    
    //Controller para a Lógica do saldo.
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
    
    //Controller para a lógica de depositar.
    public void menuParaDepositar(){
        menuFrame.setVisible(false);
        depositarFrame.getjLValorAtualRef().setText
                               ("");
        depositarFrame.setVisible(true);
    }
    
    public void depositarParaMenu(){
        depositarFrame.setVisible(false);
        menuFrame.setVisible(true);
        depositarFrame.getjLValorAtual().setText
                               ("");
        depositarFrame.getjLValorAtualRef().setText
                               ("");
    }
    
    public void depositar(){
        // Obtém o valor do depósito do campo de texto
        String valorDepositoStr = depositarFrame.getTextValorDeposito()
                                  .getText();

        // Verifica se o valor inserido é válido
        if (valorDepositoStr.isEmpty()) {
            JOptionPane.showMessageDialog(depositarFrame, 
                    "Por favor, insira um valor para depósito.", 
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Converte o valor de depósito para um número
        double valorDeposito;
        try {
            valorDeposito = Double.parseDouble(valorDepositoStr);
            if (valorDeposito <= 0) {
                JOptionPane.showMessageDialog(depositarFrame, 
                    "O valor de depósito deve ser positivo.", "Erro", 
                    JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(depositarFrame, 
                "Por favor, insira um valor numérico válido.", "Erro", 
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Obtém o CPF do usuário logado
        String cpf = menuFrame.getjLCpf().getText();
        String nome = menuFrame.getjLNome().getText();
        Investidor investidor = new Investidor(null, null, nome, cpf);

        try (Connection conn = new Conexao().getConnection()) {
            InvestidorDAO dao = new InvestidorDAO(conn);

            // Obtém o saldo atual do investidor
            ResultSet res = dao.consultarInvestidorPorCpf(investidor);
            if (res.next()){
                double saldoAtual = res.getDouble("real");
                double saldoBitcoin = res.getDouble("bitcoin");
                double saldoEthereum = res.getDouble("ethereum");
                double saldoRipple = res.getDouble("ripple");
                

                // Calcula o novo saldo
                double novoSaldo = saldoAtual + valorDeposito;
                
                //Jogando Extrato para o banco de dados
                String data = LocalDate.now().format
                                    (DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                String hora = LocalTime.now().format
                                         (DateTimeFormatter.ofPattern("HH:mm"));
                Extrato extrato = new Extrato(nome, cpf, data, hora, 
                        valorDeposito, "real", novoSaldo, saldoRipple,
                        saldoEthereum, saldoBitcoin, 0.0, 0.0, "+");
                dao.inserirExtrato(extrato);
                // Atualiza o saldo do investidor no banco de dados
                dao.atualizarSaldoReais(investidor, novoSaldo);

                // Atualiza o label de saldo com o novo valor
                depositarFrame.getjLValorAtualRef().setText
                               ("Valor Atual:");
                depositarFrame.getjLValorAtual().setText
                               (String.format("%.2f", novoSaldo));
                JOptionPane.showMessageDialog(depositarFrame, 
                                    "Depósito realizado com sucesso!", 
                                    "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            }else {
                JOptionPane.showMessageDialog(depositarFrame, 
                   "Erro ao localizar investidor.", "Erro", 
                    JOptionPane.ERROR_MESSAGE);
            }
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(depositarFrame, 
                "Erro ao realizar depósito: " + e.getMessage(), "Erro", 
                JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    //Controller para a lógica do  extrato
    public void menuParaExtrato(){
        menuFrame.setVisible(false);
        consulExtratoFrame.setVisible(true);
        consulExtratoFrame.getTextAreaExtrato().setText("");
        consulExtratoFrame.getTextSenha().setText("");
    }
    
    public void extratoParaMenu(){
        consulExtratoFrame.setVisible(false);
        menuFrame.setVisible(true);
        consulExtratoFrame.getTextAreaExtrato().setText("");
        consulExtratoFrame.getTextSenha().setText("");
    }
    
    public void consulExtrato() {
        String senhaFornecida = consulExtratoFrame.getTextSenha().getText();

        // Verifica se a senha foi fornecida
        if (senhaFornecida.isEmpty()) {
            JOptionPane.showMessageDialog(consulExtratoFrame,
                    "Por favor, insira a senha para consultar o Extrato.",
                    "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String cpf = menuFrame.getjLCpf().getText();
        Investidor investidor = new Investidor(senhaFornecida, null, null, cpf);

        try (Connection conn = new Conexao().getConnection()) {
            InvestidorDAO dao = new InvestidorDAO(conn);

            // Verifica se a senha está correta
            ResultSet res = dao.consultarInvestidor(investidor);
            if (res.next()) {
                // Limpa o textAreaExtrato antes de exibir novos dados
                consulExtratoFrame.getTextAreaExtrato().setText("");
                //não deixando o usuário editar o textArea
                consulExtratoFrame.getTextAreaExtrato().setEditable(false);
                

                // Consulta o extrato pelo CPF
                ResultSet extratoRes = dao.consultarExtratoPorCpf(investidor);

                // Monta e exibe o extrato no textAreaExtrato
                StringBuilder extrato = new StringBuilder();
                extrato.append("Segue seu extrato abaixo:\n\n");

                while (extratoRes.next()) {
                    extrato.append("Data: ").append
                    (extratoRes.getString("data")).append("\n");
                    extrato.append("Hora: ").append
                    (extratoRes.getString("hora")).append("\n");
                    extrato.append("Operação: ")
                    .append(extratoRes.getString("sinal")).append(" ")
                    .append(extratoRes.getString("valor")).append(" ")
                    .append(extratoRes.getString("tipomoeda")).append("\n");
                    extrato.append("CT: ").append
                    (extratoRes.getDouble("ct")).append("\n");
                    extrato.append("Taxa: ").append
                    (extratoRes.getDouble("taxa")).append("\n");
                    extrato.append("Saldo Real: ").append
                    (extratoRes.getDouble("real")).append("\n");
                    extrato.append("Saldo Bitcoin: ")
                    .append(extratoRes.getDouble("bitcoin")).append("\n");
                    extrato.append("Saldo Ethereum: ")
                    .append(extratoRes.getDouble("ethereum")).append("\n");
                    extrato.append("Saldo Ripple: ")
                    .append(extratoRes.getDouble("ripple")).append("\n");
                    extrato.append("--------------------------------------\n");
                }
                consulExtratoFrame.getTextAreaExtrato()
                                   .setText(extrato.toString());
                //Limpando a senha
                consulExtratoFrame.getTextSenha().setText("");

            } else {
                JOptionPane.showMessageDialog(consulExtratoFrame,
                        "Senha incorreta! Tente novamente.", "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(consulExtratoFrame,
                    "Erro ao consultar Extrato: " + e.getMessage(), "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    //Controller para lógica do sacar
    public void menuParaSacar(){
        menuFrame.setVisible(false);
        sacarFrame.setVisible(true);
    }
    
    public void sacarParaMenu(){
        sacarFrame.setVisible(false);
        menuFrame.setVisible(true);
    }
    
    public void sacar() {
        // Obtém o valor do saque do campo de texto
        String valorSaqueStr = sacarFrame.getTextValorSaque().getText();

        // Verifica se o valor inserido é válido
        if (valorSaqueStr.isEmpty()) {
            JOptionPane.showMessageDialog(sacarFrame, 
                    "Por favor, insira um valor para saque.", 
                    "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Converte o valor de saque para um número
        double valorSaque;
        try {
            valorSaque = Double.parseDouble(valorSaqueStr);
            if (valorSaque <= 0) {
                JOptionPane.showMessageDialog(sacarFrame, 
                    "O valor de saque deve ser positivo.", "Erro", 
                    JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(sacarFrame, 
                "Por favor, insira um valor numérico válido.", "Erro", 
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Obtém o CPF do usuário logado
        String cpf = menuFrame.getjLCpf().getText();
        String nome = menuFrame.getjLNome().getText();
        Investidor investidor = new Investidor(null, null, nome, cpf);

        try (Connection conn = new Conexao().getConnection()) {
            InvestidorDAO dao = new InvestidorDAO(conn);

            // Obtém o saldo atual do investidor
            ResultSet res = dao.consultarInvestidorPorCpf(investidor);
            if (res.next()) {
                double saldoAtual = res.getDouble("real");
                double saldoBitcoin = res.getDouble("bitcoin");
                double saldoEthereum = res.getDouble("ethereum");
                double saldoRipple = res.getDouble("ripple");

                // Verifica se o saldo é suficiente para o saque
                if (saldoAtual < valorSaque) {
                    JOptionPane.showMessageDialog(sacarFrame, 
                            "Saldo insuficiente para realizar o saque.", 
                            "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Calcula o novo saldo
                double novoSaldo = saldoAtual - valorSaque;

                // Jogando Extrato para o banco de dados
                String data = LocalDate.now().
                format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                String hora = LocalTime.now().
                format(DateTimeFormatter.ofPattern("HH:mm"));
                Extrato extrato = new Extrato(nome, cpf, data, hora, 
                        valorSaque, "real", novoSaldo, saldoRipple, 
                        saldoEthereum, saldoBitcoin, 0.0, 0.0, "-");
                dao.inserirExtrato(extrato);

                // Atualiza o saldo do investidor no banco de dados
                dao.atualizarSaldoReais(investidor, novoSaldo);

                // Atualiza o label de saldo com o novo valor
                sacarFrame.getjLValorAtualRef().setText("Saldo Atual:");
                sacarFrame.getjLValorAtual().setText
                (String.format("%.2f", novoSaldo));

                JOptionPane.showMessageDialog(sacarFrame, 
                        "Saque realizado com sucesso!", 
                        "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(sacarFrame, 
                        "Erro ao localizar investidor.", "Erro", 
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(sacarFrame, 
                    "Erro ao realizar saque: " + e.getMessage(), 
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

}
