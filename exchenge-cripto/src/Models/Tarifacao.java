
package Models;


interface Tarifacao {
    
    default double calculaTaxa (double valor, double taxa){
        return valor * taxa;
    }
    
}
