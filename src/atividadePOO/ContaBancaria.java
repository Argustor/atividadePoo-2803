package atividadePOO;

public class ContaBancaria {
    private int numeroConta;
    private String nomeTitular;
    private double saldo;
    private double taxaDeJuros;

    public ContaBancaria(int numeroConta, String nomeTitular, double saldo) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;

        if (saldo < 10000.0){
            this.taxaDeJuros = 0.05;
        }else if (saldo < 50000.0){
            this.taxaDeJuros = 0.1;
        }else {
            this.taxaDeJuros = 0.15;
        }
    }
    public void depositar(double valor){
        this.saldo += valor;
        this.atualizarTaxaDeJuros();
    }

    public void sacar(double valor){
        if (valor <= this.saldo){
        this.saldo -= valor;
        this.atualizarTaxaDeJuros();
    } else {
        System.out.println("Saldo insuficiente!");
    }
    }

    private void atualizarTaxaDeJuros(){
        if (this.saldo < 10000.0){
            this.taxaDeJuros = 0.05;
        }else if (this.saldo < 50000.0){
            this.taxaDeJuros = 0.1;
        }else {
            this.taxaDeJuros = 0.15;
        }
    }

    public void imprimirDados(){
        System.out.println("Conta: " + this.numeroConta);
        System.out.println("Titular: " + this.nomeTitular);
        System.out.println("Saldo: R$" + this.saldo);
        System.out.println("Taxa de juros: " + this.taxaDeJuros * 100 + "%");
    }
}