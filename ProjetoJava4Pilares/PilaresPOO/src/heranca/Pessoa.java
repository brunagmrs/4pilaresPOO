package heranca;

public class Pessoa {
    
    //atributos
    private String nome;
    private int cpf;
    private String endereco;
    private int celular;
    private String email;

    //construtores
    public Pessoa() {
        this.nome = "";
        this.cpf = 0;
        this.endereco = "";
        this.celular = 0;
        this.email = "";
    }

    public Pessoa (String nome, int cpf, String endereco, int celular, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.celular = celular;
        this.email = email;
    }

    //getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public int getCelular() {
        return celular;
    }
    public void setCelular(int celular) {
        this.celular = celular;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nome " + this.nome + " - CPF " + this.cpf + " - Endereço " + this.endereco + " - Celular " + this.celular + " - Email " + this.email;
    }

}
