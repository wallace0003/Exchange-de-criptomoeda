package model;


public class Carteira {
    private Moeda real, ripple, bitcoin, ethereum;

    public Carteira(Moeda real, Moeda ripple, Moeda bitcoin, Moeda ethereum) {
        this.real = real;
        this.ripple = ripple;
        this.bitcoin = bitcoin;
        this.ethereum = ethereum;
    }

    public Moeda getReal() {
        return real;
    }

    public Moeda getRipple() {
        return ripple;
    }

    public Moeda getBitcoin() {
        return bitcoin;
    }

    public Moeda getErhereum() {
        return ethereum;
    }

    public void setReal(Moeda real) {
        this.real = real;
    }

    public void setRipple(Moeda ripple) {
        this.ripple = ripple;
    }

    public void setBitcoin(Moeda bitcoin) {
        this.bitcoin = bitcoin;
    }

    public void setErhereum(Moeda erhereum) {
        this.ethereum = erhereum;
    }
    
}
