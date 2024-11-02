package model;

public class Extrato extends Pessoa {
    private Data dataOperacao;
    private Horas horaOperacao; 
    private double valorOperacao;
    private String tipoMoeda; 
    
    private double saldoReal;
    private double saldoRipple;
    private double saldoEthereum;
    private double saldoBitcoin;
    private double ct;
    private double taxaTransacao;

    
    public Extrato(String nome, String cpf, Data dataOperacao, Horas horaOperacao, 
            double valorOperacao, String tipoMoeda, double saldoReal, 
            double saldoRipple, double saldoEthereum, double saldoBitcoin, 
            double taxaTransacao, double ct){
        super(nome, cpf);
        this.dataOperacao = dataOperacao;
        this.horaOperacao = horaOperacao; // Inicializando o horário
        this.valorOperacao = valorOperacao;
        this.tipoMoeda = tipoMoeda;
        this.saldoReal = saldoReal;
        this.saldoRipple = saldoRipple;
        this.saldoEthereum = saldoEthereum;
        this.saldoBitcoin = saldoBitcoin;
        this.taxaTransacao = taxaTransacao;
        this.ct = ct;
    }

    // Getters e Setters para data e hora
    public Data getDataOperacao() {
        return dataOperacao;
    }

    public double getCt() {
        return ct;
    }

    public void setCt(double ct) {
        this.ct = ct;
    }

    public void setDataOperacao(Data dataOperacao) {
        this.dataOperacao = dataOperacao;
    }

    public Horas getHoraOperacao() {
        return horaOperacao;
    }

    public void setHoraOperacao(Horas horaOperacao) {
        this.horaOperacao = horaOperacao;
    }

    public double getValorOperacao() {
        return valorOperacao;
    }

    public void setValorOperacao(double valorOperacao) {
        this.valorOperacao = valorOperacao;
    }

    public String getTipoMoeda() {
        return tipoMoeda;
    }

    public void setTipoMoeda(String tipoMoeda) {
        this.tipoMoeda = tipoMoeda;
    }

    public double getSaldoReal() {
        return saldoReal;
    }

    public void setSaldoReal(double saldoReal) {
        this.saldoReal = saldoReal;
    }

    public double getSaldoRipple() {
        return saldoRipple;
    }

    public void setSaldoRipple(double saldoRipple) {
        this.saldoRipple = saldoRipple;
    }

    public double getSaldoEthereum() {
        return saldoEthereum;
    }

    public void setSaldoEthereum(double saldoEthereum) {
        this.saldoEthereum = saldoEthereum;
    }

    public double getSaldoBitcoin() {
        return saldoBitcoin;
    }

    public void setSaldoBitcoin(double saldoBitcoin) {
        this.saldoBitcoin = saldoBitcoin;
    }

    public double getTaxaTransacao() {
        return taxaTransacao;
    }

    public void setTaxaTransacao(double taxaTransacao) {
        this.taxaTransacao = taxaTransacao;
    }

    @Override
    public String toString() {
        return dataOperacao + " " + horaOperacao.getH() + ":" + 
               horaOperacao.getM() + " " +(valorOperacao > 0 ? "+" : "") + 
               valorOperacao + " " + tipoMoeda + " TX: " + taxaTransacao + 
               " | Saldos - REAL: " + saldoReal + ", BTC: " + saldoBitcoin + 
               ", ETH: " + saldoEthereum + ", XRP: " + saldoRipple;
    }
}
