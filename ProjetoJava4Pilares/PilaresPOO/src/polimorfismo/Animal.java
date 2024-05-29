package polimorfismo;

public abstract class Animal { //classe abstrata, a superclasse
    
    //atributos
    private String cor;
    private int idade;

    //construtores
    public Animal() {
        this.cor = "";
        this.idade = 0;
    }

    public Animal(String cor, int idade){
        this.cor = cor;
        this.idade = idade;
    }

    //getters e setters
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    //métodos abstratos
    public abstract void locomover();
    public abstract void comunicar();

    @Override
    public String toString() {
        return "Cor: " + this.cor + " - Idade: " + this.idade;
    }

}
