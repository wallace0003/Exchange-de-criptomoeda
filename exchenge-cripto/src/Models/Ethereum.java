package Models;

public class Ethereum extends Moeda{

    public Ethereum(String tipo, double valor) {
        super(tipo, valor);
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
