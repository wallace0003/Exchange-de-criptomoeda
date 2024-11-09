package model;

import java.util.Random;


public class Real extends Moeda implements Tarifacao{

    public Real(String tipo, double valor) {
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
    
    @Override
    public double calculaTaxa(double valor, double taxa){
        return valor * taxa;
    }

    public double aplicarVariacao(double precoAtual) {
        Random random = new Random();
        double variacaoPercentual = -0.05 + (0.10) * random.nextDouble(); 
        return precoAtual * (1 + variacaoPercentual);
    }
    
}
