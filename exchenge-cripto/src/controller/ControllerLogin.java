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
import model.Bitcoin;
import model.Carteira;
import model.Ethereum;
import model.Extrato;
import model.Moeda;
import model.Ripple;
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
    private ComprarCripFrame comprarCripFrame;
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
        comprarCripFrame = new ComprarCripFrame(this);
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
        Investidor(new String(loginFrame.getTextSenha().getPassword()), null, null,
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
        String senha = new String (cadastroFrame.getTextSenha().getPassword());
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
            cadastroFrame.getTextNome().setText("");
            cadastroFrame.getTextCpf().setText("");
            cadastroFrame.getTextSenha().setText("");
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(cadastroFrame, "Investidor "
                                          + "não cadastrado!"+ e.getMessage(),
                                          "Erro", JOptionPane.ERROR_MESSAGE);
        }}
        else{
            JOptionPane.showMessageDialog(cadastroFrame, 
                                    "A senha deve conter exatamente 6 números.\n"
                                    + "CPF deve conter 11.",
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
        String senhaFornecida = new String(
                consulSaldoFrame.getTextSenha().getPassword());

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
        depositarFrame.getjLValorAtual().setText("");
        depositarFrame.getjLValorAtualRef().setText("");
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
                               ("Saldo:");
                depositarFrame.getjLValorAtual().setText
                               (String.format("%.2f", novoSaldo));
                JOptionPane.showMessageDialog(depositarFrame, 
                                    "Depósito realizado com sucesso!", 
                                    "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                depositarFrame.getTextValorDeposito().setText("");
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
    
    
    //Controller para a lógica do extrato
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
        String senhaFornecida = new String(
                               consulExtratoFrame.getTextSenha().getPassword());

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
        sacarFrame.getjLValorAtualRef().setText
                               ("");
        sacarFrame.setVisible(true);
    }
    
    public void sacarParaMenu(){
        sacarFrame.setVisible(false);
        menuFrame.setVisible(true);
        sacarFrame.getjLValorAtual().setText("");
        sacarFrame.getjLValorAtualRef().setText("");
    }
    
    public void sacar() {
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
                sacarFrame.getjLValorAtualRef().setText("Saldo:");
                sacarFrame.getjLValorAtual().setText
                (String.format("%.2f", novoSaldo));
                sacarFrame.getTextValorSaque().setText("");

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
    
    //Controller para a lógica de comprar Cripto.
    public void menuParaCompraCrip() {
        // Solicita a senha do usuário
        String senhaFornecida = JOptionPane.showInputDialog(comprarCripFrame, 
            "Digite sua senha para continuar:", "Verificação de Senha", 
            JOptionPane.PLAIN_MESSAGE);

        // Verifica se a senha foi fornecida
        if (senhaFornecida == null || senhaFornecida.isEmpty()) {
            JOptionPane.showMessageDialog(comprarCripFrame, 
                "A senha não foi fornecida. Tente novamente.", "Aviso", 
                JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Obtém o CPF do usuário logado
        String cpf = menuFrame.getjLCpf().getText();
        Investidor investidor = new Investidor(senhaFornecida, null, null, cpf);

        try (Connection conn = new Conexao().getConnection()) {
            InvestidorDAO dao = new InvestidorDAO(conn);

            // Consulta o investidor no banco de dados com CPF e senha fornecidos
            ResultSet res = dao.consultarInvestidor(investidor);

            // Verifica se o investidor foi encontrado e a senha está correta
            if (res.next()) {
                // Realiza a consulta para obter os valores de cotação
                ResultSet resPreco = dao.consultarPreco();

                if (resPreco.next()) {
                    // Obtém os valores de cotação de Bitcoin, Ethereum e Ripple
                    double valorBitcoin = resPreco.getDouble("bitcoin");
                    double valorEthereum = resPreco.getDouble("ethereum");
                    double valorRipple = resPreco.getDouble("ripple");

                    // Formata os valores para exibição
                    String valorBitcoinStr = String.
                    format("%.2f", valorBitcoin);
                    String valorEthereumStr = String.
                    format("%.2f", valorEthereum);
                    String valorRippleStr = String.format("%.2f", valorRipple);

                    // Atualiza as labels na interface com as cotações
                    comprarCripFrame.getjLBitcoin().setText(valorBitcoinStr);
                    comprarCripFrame.getjLEthereum().setText(valorEthereumStr);
                    comprarCripFrame.getjLRipple().setText(valorRippleStr);

                    // Oculta o menu e exibe a tela de compra
                    menuFrame.setVisible(false);
                    comprarCripFrame.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(comprarCripFrame, 
                        "Erro ao obter as cotações. Tente novamente.", "Erro", 
                        JOptionPane.ERROR_MESSAGE);
                }
            } else {
                // Exibe mensagem de erro se a senha estiver incorreta
                JOptionPane.showMessageDialog(comprarCripFrame, 
                    "Senha incorreta! Tente novamente.", "Erro", 
                    JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(comprarCripFrame, 
                "Erro ao verificar senha: " + e.getMessage(), "Erro", 
                JOptionPane.ERROR_MESSAGE);
        }
    }

    
    public void comprarCripParaMenu() {
        comprarCripFrame.setVisible(false);
        menuFrame.setVisible(true);
    }
    
    //Comprar bitcoin
    public void comprarBitcoin() {
        // Obtém o valor desejado para compra de Bitcoin do campo de texto
        String valorBitcoinStr = comprarCripFrame.getTextValorBitcoin()
                                 .getText();

        // Verifica se o campo está vazio ou se o valor inserido não é numérico
        if (valorBitcoinStr == null || valorBitcoinStr.isEmpty()) {
            JOptionPane.showMessageDialog(comprarCripFrame, 
                "Por favor, insira um valor para a compra.", "Erro", 
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        double valorCompra;
        try {
            valorCompra = Double.parseDouble(valorBitcoinStr);
            if (valorCompra <= 0) {
                JOptionPane.showMessageDialog(comprarCripFrame, 
                    "O valor de compra deve ser positivo.", "Erro", 
                    JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(comprarCripFrame, 
                "Por favor, insira um valor numérico válido.", "Erro", 
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Obtém o CPF do usuário logado
        String cpf = menuFrame.getjLCpf().getText();
        String nome = menuFrame.getjLNome().getText();
        Investidor investidor = new Investidor(null, null, null, cpf);

        try (Connection conn = new Conexao().getConnection()) {
            InvestidorDAO dao = new InvestidorDAO(conn);

            // Consulta o saldo atual do investidor
            ResultSet resInvestidor = dao.consultarInvestidorPorCpf(investidor);
            if (resInvestidor.next()) {
                double saldoAtual = resInvestidor.getDouble("real");
                double saldoBitcoin = resInvestidor.getDouble("bitcoin");
                double saldoEthereum = resInvestidor.getDouble("ethereum");
                double saldoRipple = resInvestidor.getDouble("ripple");

                // Consulta o preço atual do Bitcoin
                ResultSet resPreco = dao.consultarPreco();
                if (resPreco.next()) {
                    double precoBitcoin = resPreco.getDouble("bitcoin");
                    double tx = 0.02 * valorCompra;

                    // Calcula o total de bitcoin arrecadado
                    double totalBitcoin = valorCompra / precoBitcoin;

                    // Verifica se o investidor tem saldo suficiente para a compra
                    if (saldoAtual < valorCompra + tx) {
                        JOptionPane.showMessageDialog(comprarCripFrame, 
                            "Saldo insuficiente para realizar a compra. "
                            + "Seu saldo: " + saldoAtual + "\n"
                            + "Total necessário: " + (valorCompra + tx), 
                            "Erro", 
                            JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    // Atualiza o saldo do investidor e a quantidade de Bitcoin
                    double novoSaldoReal = saldoAtual - (valorCompra + tx);
                    double novoSaldoBitcoin = saldoBitcoin + totalBitcoin;
                    dao.atualizarSaldoReais(investidor, novoSaldoReal);
                    dao.atualizarSaldoBitcoin(investidor, novoSaldoBitcoin);

                    // Registro de transação no extrato
                    String data = LocalDate.now().format(DateTimeFormatter
                                  .ofPattern("dd/MM/yyyy"));
                    String hora = LocalTime.now().format(DateTimeFormatter
                                  .ofPattern("HH:mm"));
                    Extrato extrato = new Extrato(nome, cpf, data, hora, 
                    valorCompra, "BTC", novoSaldoReal, saldoRipple,
                    saldoEthereum, novoSaldoBitcoin, 0.02,precoBitcoin, "+");
                    dao.inserirExtrato(extrato);

                    // Mensagem de sucesso
                    JOptionPane.showMessageDialog(comprarCripFrame, 
                        "Compra realizada com sucesso!", "Sucesso", 
                        JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(comprarCripFrame, 
                        "Erro ao obter o preço do Bitcoin.", "Erro", 
                        JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(comprarCripFrame, 
                    "Erro ao localizar investidor.", "Erro", 
                    JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(comprarCripFrame, 
                "Erro ao realizar a compra: " + e.getMessage(), "Erro", 
                JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //comprar ethereum
    public void comprarEthereum() {
        String valorEthereumStr = comprarCripFrame.getTextValorEthereum()
                                 .getText();

        // Verifica se o campo está vazio ou se o valor inserido não é numérico
        if (valorEthereumStr == null || valorEthereumStr.isEmpty()) {
            JOptionPane.showMessageDialog(comprarCripFrame, 
                "Por favor, insira um valor para a compra.", "Erro", 
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        double valorCompra;
        try {
            valorCompra = Double.parseDouble(valorEthereumStr);
            if (valorCompra <= 0) {
                JOptionPane.showMessageDialog(comprarCripFrame, 
                    "O valor de compra deve ser positivo.", "Erro", 
                    JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(comprarCripFrame, 
                "Por favor, insira um valor numérico válido.", "Erro", 
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Obtém o CPF do usuário logado
        String cpf = menuFrame.getjLCpf().getText();
        String nome = menuFrame.getjLNome().getText();
        Investidor investidor = new Investidor(null, null, null, cpf);

        try (Connection conn = new Conexao().getConnection()) {
            InvestidorDAO dao = new InvestidorDAO(conn);

            // Consulta o saldo atual do investidor
            ResultSet resInvestidor = dao.consultarInvestidorPorCpf(investidor);
            if (resInvestidor.next()) {
                double saldoAtual = resInvestidor.getDouble("real");
                double saldoBitcoin = resInvestidor.getDouble("bitcoin");
                double saldoEthereum = resInvestidor.getDouble("ethereum");
                double saldoRipple = resInvestidor.getDouble("ripple");

                ResultSet resPreco = dao.consultarPreco();
                if (resPreco.next()) {
                    double precoEthereum = resPreco.getDouble("ethereum");
                    double tx = 0.01 * valorCompra;

                    
                    double totalEthereum = valorCompra / precoEthereum;

                    if (saldoAtual < valorCompra + tx) {
                        JOptionPane.showMessageDialog(comprarCripFrame, 
                            "Saldo insuficiente para realizar a compra. "
                            + "Seu saldo: " + saldoAtual + "\n"
                            + "Total necessário: " + (valorCompra + tx), 
                            "Erro", 
                            JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    // Atualiza o saldo do investidor e a quantidade de Bitcoin
                    double novoSaldoReal = saldoAtual - (valorCompra + tx);
                    double novoSaldoEthereum = saldoEthereum + totalEthereum;
                    dao.atualizarSaldoReais(investidor, novoSaldoReal);
                    dao.atualizarSaldoEthereum(investidor, novoSaldoEthereum);

                    // Registro de transação no extrato
                    String data = LocalDate.now().format(DateTimeFormatter
                                  .ofPattern("dd/MM/yyyy"));
                    String hora = LocalTime.now().format(DateTimeFormatter
                                  .ofPattern("HH:mm"));
                    Extrato extrato = new Extrato(nome, cpf, data, hora, 
                    valorCompra, "ETH", novoSaldoReal, saldoRipple,
                    novoSaldoEthereum, saldoBitcoin, 0.01, precoEthereum, "+");
                    dao.inserirExtrato(extrato);

                    // Mensagem de sucesso
                    JOptionPane.showMessageDialog(comprarCripFrame, 
                        "Compra realizada com sucesso!", "Sucesso", 
                        JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(comprarCripFrame, 
                        "Erro ao obter o preço do Ethereum", "Erro", 
                        JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(comprarCripFrame, 
                    "Erro ao localizar investidor.", "Erro", 
                    JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(comprarCripFrame, 
                "Erro ao realizar a compra: " + e.getMessage(), "Erro", 
                JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //comprar ripple
    public void comprarRipple() {
        String valorRippleStr = comprarCripFrame.getTextValorRipple().getText();

        if (valorRippleStr == null || valorRippleStr.isEmpty()) {
            JOptionPane.showMessageDialog(comprarCripFrame, 
                "Por favor, insira um valor para a compra.", "Erro", 
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        double valorCompra;
        try {
            valorCompra = Double.parseDouble(valorRippleStr);
            if (valorCompra <= 0) {
                JOptionPane.showMessageDialog(comprarCripFrame, 
                    "O valor de compra deve ser positivo.", "Erro", 
                    JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(comprarCripFrame, 
                "Por favor, insira um valor numérico válido.", "Erro", 
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        String cpf = menuFrame.getjLCpf().getText();
        String nome = menuFrame.getjLNome().getText();
        Investidor investidor = new Investidor(null, null, null, cpf);

        try (Connection conn = new Conexao().getConnection()) {
            InvestidorDAO dao = new InvestidorDAO(conn);

            ResultSet resInvestidor = dao.consultarInvestidorPorCpf(investidor);
            if (resInvestidor.next()) {
                double saldoAtual = resInvestidor.getDouble("real");
                double saldoBitcoin = resInvestidor.getDouble("bitcoin");
                double saldoEthereum = resInvestidor.getDouble("ethereum");
                double saldoRipple = resInvestidor.getDouble("ripple");

                ResultSet resPreco = dao.consultarPreco();
                if (resPreco.next()) {
                    double precoRipple = resPreco.getDouble("ripple");
                    double tx = 0.01 * valorCompra;
                    double totalRipple = valorCompra / precoRipple;

                    if (saldoAtual < valorCompra + tx) {
                        JOptionPane.showMessageDialog(comprarCripFrame, 
                            "Saldo insuficiente para realizar a compra. "
                            + "Seu saldo: " + saldoAtual + "\n"
                            + "Total necessário: " + (valorCompra + tx), 
                            "Erro", 
                            JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    double novoSaldoReal = saldoAtual - (valorCompra + tx);
                    double novoSaldoRipple = saldoRipple + totalRipple;
                    dao.atualizarSaldoReais(investidor, novoSaldoReal);
                    dao.atualizarSaldoRipple(investidor, novoSaldoRipple);

                    String data = LocalDate.now().
                    format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    String hora = LocalTime.now().
                    format(DateTimeFormatter.ofPattern("HH:mm"));
                    Extrato extrato = new Extrato(
                        nome, cpf, data, hora, valorCompra, 
                        "Ripple", novoSaldoReal, novoSaldoRipple,
                        saldoEthereum, saldoBitcoin, 0.01, precoRipple, "+"
                    );
                    dao.inserirExtrato(extrato);

                    JOptionPane.showMessageDialog(comprarCripFrame, 
                        "Compra realizada com sucesso!", "Sucesso", 
                        JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(comprarCripFrame, 
                        "Erro ao obter o preço do Ripple.", "Erro", 
                        JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(comprarCripFrame, 
                    "Erro ao localizar investidor.", "Erro", 
                    JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(comprarCripFrame, 
                "Erro ao realizar a compra: " + e.getMessage(), "Erro", 
                JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //Controller para vender Cripto.
    
    public void menuParaVenderCripto(){
        String senhaFornecida = JOptionPane.showInputDialog(vendeCripFrame, 
            "Digite sua senha para continuar:", "Verificação de Senha", 
            JOptionPane.PLAIN_MESSAGE);

        // Verifica se a senha foi fornecida
        if (senhaFornecida == null || senhaFornecida.isEmpty()) {
            JOptionPane.showMessageDialog(vendeCripFrame, 
                "A senha não foi fornecida. Tente novamente.", "Aviso", 
                JOptionPane.WARNING_MESSAGE);
            return;
        }

        String cpf = menuFrame.getjLCpf().getText();
        Investidor investidor = new Investidor(senhaFornecida, null, null, cpf);

        try (Connection conn = new Conexao().getConnection()) {
            InvestidorDAO dao = new InvestidorDAO(conn);

            ResultSet res = dao.consultarInvestidor(investidor);

            
            if (res.next()) {
                ResultSet resPreco = dao.consultarPreco();

                if (resPreco.next()) {
                    double valorBitcoin = resPreco.getDouble("bitcoin");
                    double valorEthereum = resPreco.getDouble("ethereum");
                    double valorRipple = resPreco.getDouble("ripple");

                    String valorBitcoinStr = String.
                    format("%.2f", valorBitcoin);
                    String valorEthereumStr = String.
                    format("%.2f", valorEthereum);
                    String valorRippleStr = String.format("%.2f", valorRipple);

                    
                    vendeCripFrame.getjLBitcoin().setText(valorBitcoinStr);
                    vendeCripFrame.getjLEthereum().setText(valorEthereumStr);
                    vendeCripFrame.getjLRipple().setText(valorRippleStr);

                    
                    menuFrame.setVisible(false);
                    vendeCripFrame.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(comprarCripFrame, 
                        "Erro ao obter as cotações. Tente novamente.", "Erro", 
                        JOptionPane.ERROR_MESSAGE);
                }
            } else {
                // Exibe mensagem de erro se a senha estiver incorreta
                JOptionPane.showMessageDialog(comprarCripFrame, 
                    "Senha incorreta! Tente novamente.", "Erro", 
                    JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(comprarCripFrame, 
                "Erro ao verificar senha: " + e.getMessage(), "Erro", 
                JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void venderCripParaMenu(){
        vendeCripFrame.setVisible(false);
        menuFrame.setVisible(true);
        vendeCripFrame.getTextValorBitcoin().setText("");
        vendeCripFrame.getTextValorEthereum().setText("");
        vendeCripFrame.getTextValorRipple().setText("");
    }
    
    public void venderBitcoin() {
        String valorBitcoinStr = vendeCripFrame.getTextValorBitcoin().getText();

        if (valorBitcoinStr == null || valorBitcoinStr.isEmpty()) {
            JOptionPane.showMessageDialog(vendeCripFrame, 
                "Por favor, insira uma quantidade para a venda.", "Erro", 
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        double quantidadeBitcoin;
        try {
            quantidadeBitcoin = Double.parseDouble(valorBitcoinStr);
            if (quantidadeBitcoin <= 0) {
                JOptionPane.showMessageDialog(vendeCripFrame, 
                    "A quantidade de venda deve ser positiva.", "Erro", 
                    JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(vendeCripFrame, 
                "Por favor, insira uma quantidade numérica válida.", "Erro", 
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        String cpf = menuFrame.getjLCpf().getText();
        String nome = menuFrame.getjLNome().getText();
        Investidor investidor = new Investidor(null, null, null, cpf);

        try (Connection conn = new Conexao().getConnection()) {
            InvestidorDAO dao = new InvestidorDAO(conn);

            ResultSet resInvestidor = dao.consultarInvestidorPorCpf(investidor);
            if (resInvestidor.next()) {
                double saldoAtual = resInvestidor.getDouble("real");
                double saldoBitcoin = resInvestidor.getDouble("bitcoin");
                double saldoEthereum = resInvestidor.getDouble("ethereum");
                double saldoRipple = resInvestidor.getDouble("ripple");

                if (saldoBitcoin < quantidadeBitcoin) {
                    JOptionPane.showMessageDialog(vendeCripFrame, 
                        """
                        Saldo de Bitcoin insuficiente para realizar a venda.
                        Saldo atual: """ + saldoEthereum, 
                        "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                ResultSet resPreco = dao.consultarPreco();
                if (resPreco.next()) {
                    double precoBitcoin = resPreco.getDouble("bitcoin");
                    double valorVenda = quantidadeBitcoin * precoBitcoin;
                    double tx = 0.03 * valorVenda;
                    double valorRecebido = valorVenda - tx;

                    double novoSaldoReal = saldoAtual + valorRecebido;
                    double novoSaldoBitcoin = saldoBitcoin - quantidadeBitcoin;
                    dao.atualizarSaldoReais(investidor, novoSaldoReal);
                    dao.atualizarSaldoBitcoin(investidor, novoSaldoBitcoin);

                    String data = LocalDate.now().format(DateTimeFormatter
                                  .ofPattern("dd/MM/yyyy"));
                    String hora = LocalTime.now().format(DateTimeFormatter
                                  .ofPattern("HH:mm"));
                    Extrato extrato = new Extrato(nome, cpf, data, hora, 
                        quantidadeBitcoin, "BTC", novoSaldoReal, saldoRipple,
                        saldoEthereum, novoSaldoBitcoin, 0.03, precoBitcoin, "-");
                    dao.inserirExtrato(extrato);

                    // Mensagem de sucesso
                    JOptionPane.showMessageDialog(vendeCripFrame, 
                        "Venda realizada com sucesso!", "Sucesso", 
                        JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(vendeCripFrame, 
                        "Erro ao obter o preço do Bitcoin.", "Erro", 
                        JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(vendeCripFrame, 
                    "Erro ao localizar investidor.", "Erro", 
                    JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(vendeCripFrame, 
                "Erro ao realizar a venda: " + e.getMessage(), "Erro", 
                JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void venderEthereum() {
        String valorEthereumStr = vendeCripFrame.getTextValorEthereum().getText();

        if (valorEthereumStr == null || valorEthereumStr.isEmpty()) {
            JOptionPane.showMessageDialog(vendeCripFrame, 
                "Por favor, insira uma quantidade para a venda.", "Erro", 
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        double quantidadeEthereum;
        try {
            quantidadeEthereum = Double.parseDouble(valorEthereumStr);
            if (quantidadeEthereum <= 0) {
                JOptionPane.showMessageDialog(vendeCripFrame, 
                    "A quantidade de venda deve ser positiva.", "Erro", 
                    JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(vendeCripFrame, 
                "Por favor, insira uma quantidade numérica válida.", "Erro", 
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        String cpf = menuFrame.getjLCpf().getText();
        String nome = menuFrame.getjLNome().getText();
        Investidor investidor = new Investidor(null, null, null, cpf);

        try (Connection conn = new Conexao().getConnection()) {
            InvestidorDAO dao = new InvestidorDAO(conn);

            ResultSet resInvestidor = dao.consultarInvestidorPorCpf(investidor);
            if (resInvestidor.next()) {
                double saldoAtual = resInvestidor.getDouble("real");
                double saldoBitcoin = resInvestidor.getDouble("bitcoin");
                double saldoEthereum = resInvestidor.getDouble("ethereum");
                double saldoRipple = resInvestidor.getDouble("ripple");

                if (saldoEthereum < quantidadeEthereum) {
                    JOptionPane.showMessageDialog(vendeCripFrame, 
                        """
                        Saldo de Ethereum insuficiente para realizar a venda.
                        Saldo atual: """ + saldoEthereum, 
                        "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                ResultSet resPreco = dao.consultarPreco();
                if (resPreco.next()) {
                    double precoEthereum = resPreco.getDouble("ethereum");
                    double valorVenda = quantidadeEthereum * precoEthereum;
                    double tx = 0.02 * valorVenda;
                    double valorRecebido = valorVenda - tx;

                    double novoSaldoReal = saldoAtual + valorRecebido;
                    double novoSaldoEthereum = saldoEthereum - 
                                               quantidadeEthereum;
                    dao.atualizarSaldoReais(investidor, novoSaldoReal);
                    dao.atualizarSaldoEthereum(investidor, novoSaldoEthereum);

                    String data = LocalDate.now().format(DateTimeFormatter
                                  .ofPattern("dd/MM/yyyy"));
                    String hora = LocalTime.now().format(DateTimeFormatter
                                  .ofPattern("HH:mm"));
                    Extrato extrato = new Extrato(nome, cpf, data, hora, 
                        quantidadeEthereum, "ETH", novoSaldoReal, saldoRipple,
                        novoSaldoEthereum, saldoBitcoin, 0.02, precoEthereum,
                        "-");
                    dao.inserirExtrato(extrato);

                    JOptionPane.showMessageDialog(vendeCripFrame, 
                        "Venda de Ethereum realizada com sucesso!", "Sucesso", 
                        JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(vendeCripFrame, 
                        "Erro ao obter o preço do Ethereum.", "Erro", 
                        JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(vendeCripFrame, 
                    "Erro ao localizar investidor.", "Erro", 
                    JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(vendeCripFrame, 
                "Erro ao realizar a venda: " + e.getMessage(), "Erro", 
                JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void venderRipple() {
        String valorRippleStr = vendeCripFrame.getTextValorRipple().getText();

        if (valorRippleStr == null || valorRippleStr.isEmpty()) {
            JOptionPane.showMessageDialog(vendeCripFrame, 
                "Por favor, insira uma quantidade para a venda.", "Erro", 
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        double quantidadeRipple;
        try {
            quantidadeRipple = Double.parseDouble(valorRippleStr);
            if (quantidadeRipple <= 0) {
                JOptionPane.showMessageDialog(vendeCripFrame, 
                    "A quantidade de venda deve ser positiva.", "Erro", 
                    JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(vendeCripFrame, 
                "Por favor, insira uma quantidade numérica válida.", "Erro", 
                JOptionPane.ERROR_MESSAGE);
            return;
        }

        String cpf = menuFrame.getjLCpf().getText();
        String nome = menuFrame.getjLNome().getText();
        Investidor investidor = new Investidor(null, null, null, cpf);

        try (Connection conn = new Conexao().getConnection()) {
            InvestidorDAO dao = new InvestidorDAO(conn);

            ResultSet resInvestidor = dao.consultarInvestidorPorCpf(investidor);
            if (resInvestidor.next()) {
                double saldoAtual = resInvestidor.getDouble("real");
                double saldoBitcoin = resInvestidor.getDouble("bitcoin");
                double saldoEthereum = resInvestidor.getDouble("ethereum");
                double saldoRipple = resInvestidor.getDouble("ripple");

                if (saldoRipple < quantidadeRipple) {
                    JOptionPane.showMessageDialog(vendeCripFrame, 
                        """
                        Saldo de Ripple insuficiente para realizar a venda.
                        Saldo atual: """ + saldoRipple, 
                        "Erro", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                ResultSet resPreco = dao.consultarPreco();
                if (resPreco.next()) {
                    double precoRipple = resPreco.getDouble("ripple");
                    double valorVenda = quantidadeRipple * precoRipple;
                    double tx = 0.01 * valorVenda;
                    double valorRecebido = valorVenda - tx;

                    double novoSaldoReal = saldoAtual + valorRecebido;
                    double novoSaldoRipple = saldoRipple - quantidadeRipple;
                    dao.atualizarSaldoReais(investidor, novoSaldoReal);
                    dao.atualizarSaldoRipple(investidor, novoSaldoRipple);

                    String data = LocalDate.now().format(DateTimeFormatter
                                  .ofPattern("dd/MM/yyyy"));
                    String hora = LocalTime.now().format(DateTimeFormatter
                                  .ofPattern("HH:mm"));
                    Extrato extrato = new Extrato(nome, cpf, data, hora, 
                        quantidadeRipple, "XRP", novoSaldoReal, novoSaldoRipple,
                        saldoEthereum, saldoBitcoin, 0.01, precoRipple, "-");
                    dao.inserirExtrato(extrato);

                    JOptionPane.showMessageDialog(vendeCripFrame, 
                        "Venda de Ripple realizada com sucesso!", "Sucesso", 
                        JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(vendeCripFrame, 
                        "Erro ao obter o preço do Ripple.", "Erro", 
                        JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(vendeCripFrame, 
                    "Erro ao localizar investidor.", "Erro", 
                    JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(vendeCripFrame, 
                "Erro ao realizar a venda: " + e.getMessage(), "Erro", 
                JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // lógica do controller para atualizar a cotacao.
    public void novaCotacao() {
        try (Connection conn = new Conexao().getConnection()) {
            InvestidorDAO dao = new InvestidorDAO(conn);

            ResultSet resPreco = dao.consultarPreco();
            if (resPreco.next()) {
                double precoBitcoin = resPreco.getDouble("bitcoin");
                double precoEthereum = resPreco.getDouble("ethereum");
                double precoRipple = resPreco.getDouble("ripple");
                Bitcoin bitcoin = new Bitcoin("Bitcoin", precoBitcoin);
                Ripple ripple = new Ripple("Ripple", precoRipple);
                Ethereum ethereum = new Ethereum ("Ethereu", precoEthereum);

                double novoPrecoBitcoin = bitcoin.aplicarVariacao(precoBitcoin);
                double novoPrecoEthereum = ethereum.
                                           aplicarVariacao(precoEthereum);
                double novoPrecoRipple = ripple.aplicarVariacao(precoRipple);

                dao.atualizarCotacao(novoPrecoBitcoin, novoPrecoEthereum, 
                                     novoPrecoRipple);

                menuFrame.getjLBitcoin().setText
                (String.format("%.2f", novoPrecoBitcoin));
                menuFrame.getjLEthereum().setText
                (String.format("%.2f", novoPrecoEthereum));
                menuFrame.getjLRipple().setText
                (String.format("%.2f", novoPrecoRipple));

                JOptionPane.showMessageDialog(menuFrame, 
                        "Cotações atualizadas com sucesso!");
            } else {
                JOptionPane.showMessageDialog(menuFrame, 
                        "Erro ao obter as cotações.", "Erro", 
                        JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(menuFrame, 
                    "Erro ao atualizar as cotações: " + e.getMessage(), 
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
