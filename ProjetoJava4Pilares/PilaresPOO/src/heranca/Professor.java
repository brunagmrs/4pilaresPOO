package heranca;

public class Professor extends Pessoa {
    
    //atributos
    private int salario;
    private String titulacao;

    //construtores
    public Professor () {
        this.setNome("");
        this.setCpf(0);
        this.setEndereco("");
        this.setCelular(0);
        this.setEmail("");
        this.salario = 0;
        this.titulacao = "";
    }

    public Professor (String nome, int cpf, String endereco, int celular, String email, int salario, String titulacao) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setEndereco(endereco);
        this.setCelular(celular);
        this.setEmail(email);
        this.salario = salario;
        this.titulacao = titulacao;
    }

    //getters e setters
    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
    public String getTitulacao() {
        return titulacao;
    }
    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    @Override
    public String toString() {
        return "Nome " + this.getNome() + " - CPF " + this.getCpf() + " - Endereço " + this.getEndereco() + " - Celular " + this.getCelular() + " - Email " + this.getEmail() + " - Salario " + this.salario + " - Titulação " + this.titulacao;

    }
    

}
