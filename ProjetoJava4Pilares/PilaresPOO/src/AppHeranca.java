import heranca.*;

public class AppHeranca {

    public static void main(String[] args) {

        //Aluno herda os atributos e métodos de Pessoa, e possue seus atributos e métodos próprios
        Aluno aluno01 = new Aluno();
        System.out.println(aluno01);

        Aluno aluno02 = new Aluno("João", 12345678, "Cidade/UF", 1199999999, "joao@gmail.com", 0001, "1A");
        System.out.println(aluno02);

        
    }

    
}