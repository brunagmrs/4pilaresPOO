package heranca;

public class Aluno extends Pessoa{
    
    private int matricula;
    private String turma;

    //construtores
    //como os atributos são declarados como private em Pessoa, na classe herdada é necessário utilizar o setters para o construtor funcionar corretamente
    //também é adicionado os atributos específicos da classe Aluno no contrutor
    public Aluno () {
        this.setNome("");
        this.setCpf(0);
        this.setEndereco("");
        this.setCelular(0);
        this.setEmail("");
        this.matricula = 0;
        this.turma = "";
    }

    public Aluno (String nome, int cpf, String endereco, int celular, String email, int matricula, String turma) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setEndereco(endereco);
        this.setCelular(celular);
        this.setEmail(email);
        this.matricula = matricula;
        this.turma = turma;
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getTurma() {
        return turma;
    }
    public void setTurma(String turma) {
        this.turma = turma;
    }
    
    @Override
    public String toString() {
        return "Nome " + this.getNome() + " - CPF " + this.getCpf() + " - Endereço " + this.getEndereco() + " - Celular " + this.getCelular() + " - Email " + this.getEmail() + " - Matricula " + this.matricula + " - Turma " + this.turma;

    }

}
