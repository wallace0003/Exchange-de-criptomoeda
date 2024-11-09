package model;

import java.util.Random;

public class Bitcoin extends Moeda implements Tarifacao{

    public Bitcoin(String tipo, double valor) {
        super(tipo, valor);
    }

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
    
    @Override
    public double calculaTaxa(double valor, double taxa){
        return valor * taxa;
    }
    
    @Override
    public double aplicarVariacao(double precoAtual) {
        Random random = new Random();
        double variacaoPercentual = -0.05 + (0.10) * random.nextDouble(); 
        return precoAtual * (1 + variacaoPercentual);
    }
    
}
