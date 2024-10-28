package model;

public class Bitcoin extends Moeda implements Tarifacao{

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
    
    @Override
    public double calculaTaxa(double valor, double taxa){
        return valor * taxa;
    }
    
    
}
