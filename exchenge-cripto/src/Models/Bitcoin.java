package Models;

public class Bitcoin extends Moeda{

    public Bitcoin(String tipo, double valor) {
        super(tipo, valor);
    }

    public String getTipo() {
        return tipo;
    }

    /**
     *
     * @return
     */
    @Override
    public double getValor() {
        return valor;
    }

    /**
     *
     * @param tipo
     */
    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
