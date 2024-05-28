import encapsulamento.Conta;

public class AppEncapsulamento {

    public static void main(String[] args) {
        
        //por meio do método construtor, é possível definir o valor inicial dos atributos
        Conta contaOrigem = new Conta(001, "Maria", "corrente", 1000);
        Conta contaDestino = new Conta(002, "João", "poupança", 1500.98);

        //impressão de valores
        System.out.println("Contas:");
        contaOrigem.extrato();
        contaDestino.extrato();
        System.out.println("");

        //após a instanciação, para alterar atributos privates, é necessário métodos publics para o acesso seguro
        //utilização da função depositar
        System.out.println("Função depositar, com parâmetro de 1500.92");
        contaOrigem.depositar(1500.92);
        contaOrigem.extrato();
        System.out.println("");

        //utilização da função sacar
        System.out.println("Função de sacar, com parâmetro de 100");
        contaOrigem.sacar(100);
        contaOrigem.extrato();
        System.out.println("");

        //utilização da função tranferir
        System.out.println("Função de transferir, com os parâmetros de contaDestino e 1000");
        contaOrigem.tranferir(contaDestino, 1000);
        contaOrigem.extrato();
        contaDestino.extrato();
        System.out.println("");
        
    }
}

