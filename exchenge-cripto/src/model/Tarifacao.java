
package model;


interface Tarifacao {
    
    default double calculaTaxa (double valor, double taxa){
        return valor * taxa;
    }
    
}
