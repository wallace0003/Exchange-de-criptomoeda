
package Models;

public class Pessoa {
    private String nome, sobrenome, cpf;
    private int idade;

    public Pessoa(String nome, String sobrenome, String cpf, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}
