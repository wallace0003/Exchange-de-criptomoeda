package Models;


public class Investidor extends Pessoa{
    private String Senha;
    private Carteira carteira;

    public Investidor(String Senha, Carteira carteira, String nome, String cpf) {
        super(nome, cpf);
        this.Senha = Senha;
        this.carteira = carteira;
    }
    
    
}
