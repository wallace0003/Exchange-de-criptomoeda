package Models;


public class Investidor extends Pessoa{
    private String Senha;

    public Investidor(String Senha, String nome, String sobrenome, 
                      String cpf, int idade) {
        super(nome, sobrenome, cpf, idade);
        this.Senha = Senha;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }
    
    
    
}
