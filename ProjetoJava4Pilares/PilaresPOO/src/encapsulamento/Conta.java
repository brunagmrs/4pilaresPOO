package encapsulamento;
public class Conta {

    //atributos
    //modificador de acesso private geralmente utilizados em atributos. Para garantir a segurança de dados
    private int numero;
    private String titular;
    private String tipo;
    private double saldo;

    //construtores
    public Conta(){
        this.numero = 0;
        this.titular = "";
        this.tipo = "poupança";
        this.saldo = 0;
    }
    public Conta(int numero, String titular, String tipo, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.tipo = tipo;
        this.saldo = saldo;
    }

    //getters e setters
    public int getNumero(){
        return this.numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public String getTitular(){
        return this.titular;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    //métodos
    //modificadores de acesso public geralmente utilizados em métodos para permitir sua acessibilidade no código, podendo ser acessado por outras classes.
    public void sacar(double valorSaque){
        if (valorSaque > 0){
            if (getSaldo() >= valorSaque){
                System.out.println("O valor de " + valorSaque + " foi retirado com sucesso da conta " + getNumero() +"!");
                setSaldo(getSaldo() - valorSaque);
            } else {
                System.out.println("Não foi possível sacar o valor desejado. O valor se saque é maior que o saldo disponível.");
            }
        } else {
            System.out.println("O valor do saque é inválido. Tente novamente");
        }
    }
    public void depositar(double valorDeposito){
        if (valorDeposito > 0){
            setSaldo(getSaldo()+valorDeposito);
        System.out.println("O valor " + valorDeposito + " foi depositado com sucesso na conta " + getNumero() +".");
        } else {
            System.out.println("O valor de depósito é inválido. Tente novamente");
        }
    }

    public void tranferir(Conta contaParaTransferencia, double valorTransferencia){
        if (valorTransferencia > 0 && valorTransferencia <= getSaldo()){
            contaParaTransferencia.depositar(valorTransferencia);
            sacar(valorTransferencia);
            System.out.println("Tranferência realizada com sucesso, para conta");
        } else {
            System.out.println("O valor de trasnferência é inválido. Tente novamente");
        }
    }

    //toString
    @Override
    public String toString() {
        return "Nº: " + getNumero() + " - Titular: " + getTitular() + " - Tipo: " + getTipo() + " - Saldo: " + getSaldo();
    }

    public void extrato(){
        System.out.println(this.toString());
    }
}
