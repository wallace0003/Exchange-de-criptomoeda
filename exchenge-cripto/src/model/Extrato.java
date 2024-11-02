package model;

public class Extrato extends Pessoa {
    private String dataOperacao;
    private String horaOperacao; 
    private double valorOperacao;
    private String tipoMoeda; 
    private String maisOuMenos;
    
    private double saldoReal;
    private double saldoRipple;
    private double saldoEthereum;
    private double saldoBitcoin;
    private double ct;
    private double taxaTransacao;

    
    public Extrato(String nome, String cpf, String dataOperacao, String horaOperacao, 
            double valorOperacao, String tipoMoeda, double saldoReal, 
            double saldoRipple, double saldoEthereum, double saldoBitcoin, 
            double taxaTransacao, double ct, String maisOuMenos){
        super(nome, cpf);
        this.dataOperacao = dataOperacao;
        this.horaOperacao = horaOperacao; 
        this.valorOperacao = valorOperacao;
        this.tipoMoeda = tipoMoeda;
        this.saldoReal = saldoReal;
        this.saldoRipple = saldoRipple;
        this.saldoEthereum = saldoEthereum;
        this.saldoBitcoin = saldoBitcoin;
        this.taxaTransacao = taxaTransacao;
        this.ct = ct;
        this.maisOuMenos = maisOuMenos;
    }

    public Extrato(String nome, String cpf) {
        super(nome, cpf);
    }
    
    
    public void setDataOperacao(String dataOperacao) {
        this.dataOperacao = dataOperacao;
    }

    public void setHoraOperacao(String horaOperacao) {
        this.horaOperacao = horaOperacao;
    }

    public void setValorOperacao(double valorOperacao) {
        this.valorOperacao = valorOperacao;
    }

    public void setTipoMoeda(String tipoMoeda) {
        this.tipoMoeda = tipoMoeda;
    }

    public void setMaisOuMenos(String maisOuMenos) {
        this.maisOuMenos = maisOuMenos;
    }

    public void setSaldoReal(double saldoReal) {
        this.saldoReal = saldoReal;
    }

    public void setSaldoRipple(double saldoRipple) {
        this.saldoRipple = saldoRipple;
    }

    public void setSaldoEthereum(double saldoEthereum) {
        this.saldoEthereum = saldoEthereum;
    }

    public void setSaldoBitcoin(double saldoBitcoin) {
        this.saldoBitcoin = saldoBitcoin;
    }

    public void setCt(double ct) {
        this.ct = ct;
    }

    // Getters e Setters para data e hora
    public void setTaxaTransacao(double taxaTransacao) {
        this.taxaTransacao = taxaTransacao;
    }

    public String getDataOperacao() {
        return dataOperacao;
    }

    public String getHoraOperacao() {
        return horaOperacao;
    }

    public double getValorOperacao() {
        return valorOperacao;
    }

    public String getTipoMoeda() {
        return tipoMoeda;
    }

    public String getMaisOuMenos() {
        return maisOuMenos;
    }

    public double getSaldoReal() {
        return saldoReal;
    }

    public double getSaldoRipple() {
        return saldoRipple;
    }

    public double getSaldoEthereum() {
        return saldoEthereum;
    }

    public double getSaldoBitcoin() {
        return saldoBitcoin;
    }

    public double getCt() {
        return ct;
    }

    public double getTaxaTransacao() {
        return taxaTransacao;
    }
    
     
    
}
