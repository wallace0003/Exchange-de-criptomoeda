package model;


public class Investidor extends Pessoa{
    private String Senha;
    private Carteira carteira;

    public Investidor(String Senha, Carteira carteira, String nome, String cpf){
        super(nome, cpf);
        this.Senha = Senha;
        this.carteira = carteira;
    }

    public String getSenha() {
        return Senha;
    }

    public Carteira getCarteira() {
        return carteira;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public void setCarteira(Carteira carteira) {
        this.carteira = carteira;
    }
    
    
    
    
}
