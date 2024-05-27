package encapsulamento;

public class App {
    public static void main(String[] args) {
        
        Conta contaOrigem = new Conta(001, "Maria", "corrente", 1000);
        Conta contaDestino = new Conta(002, "João", "poupança", 1500.98);

        //impressão de valores
        System.out.println(contaOrigem);
        System.out.println(contaDestino);

        //utilização da função depositar
        contaOrigem.depositar(1500.92);
        System.out.println(contaOrigem);

        //utilização da função sacar
        contaOrigem.sacar(100);
        System.out.println(contaOrigem);

        //utilização da função tranferir
        contaOrigem.tranferir(contaDestino, 1000);
        System.out.println(contaOrigem);
        System.out.println(contaDestino);
    }
}
