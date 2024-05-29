import heranca.*;

public class AppHeranca {

    public static void main(String[] args) {

        //Aluno herda os atributos e métodos de Pessoa, e possue seus atributos e métodos próprios
        Aluno aluno01 = new Aluno(); //construtor sem parâmetros, logo seus atributos recebem o valor estabelecido durante a criação da classe
        System.out.println(aluno01);

        Aluno aluno02 = new Aluno("João", 12345678, "Cidade/UF", 1199999999, "joao@gmail.com", 0001, "1A"); //contrutor com parâmetros
        System.out.println(aluno02);

        //Professor também herda os atributos e métodos de Pessoa, e possue seus métodos e atributos próprios
        Professor professor01 = new Professor("Maria", 987654321, "Cidade/UF", 229999999, "maria@gmail.com", 10000, "Licenciada");
        System.out.println(professor01);

        //os métodos de Professor não funcionam na classe Aluno e nem na classe Pessoa, isso serve para Aluno também
        //aluno01.getSalario(); //erro, pois getSalario é uma função apenas da classe Professor
        professor01.getSalario();

        //os métodos e atributos da classe Pessoa pertencem tanto quanto Professor quanto Aluno
        System.out.println(aluno02.getNome());
        System.out.println(professor01.getNome());

    }
}