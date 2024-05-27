public abstract class Animal{

    //atributos de Animal
    private String nome;
    private int idade;

    //construtor
    public Animal (String nome, int idade) {
    
   }

   //getters e setters
   public String getNome(){
        return this.nome;
   }
   public void setNome(String nome){
        this.nome = nome;
   }
   public int getIdade(){
        return this.idade;
   }
   public void setIdade(int idade){
        this.idade = idade;
   }

   //métodos abstratos
   public abstract String locomover();
   public abstract String comunicar();

   //método concreto (não precisa de implementação na subclasse)
   //toString para apresentar informações de Animal
   @Override
   public String toString() {
       return "O nome do Animal é " + this.getNome() + " e sua idade é " + this.getIdade();
   }
}