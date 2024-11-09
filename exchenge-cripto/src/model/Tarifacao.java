
package model;


public interface Tarifacao {
    
    public double calculaTaxa (double valor, double taxa);
        
    
    
    public double aplicarVariacao(double precoAtual);
 
}
