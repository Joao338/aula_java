import java.util.ArrayList;
public class ContaBancaria {
    private int numeroConta;
    private String nomeTitular;
    private double saldo;
    
   
    public ContaBancaria(int numeroConta, String nomeTitular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldoInicial;
    }
    
   
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }
    
    
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }
    
   
    public double consultarSaldo() {
        return saldo;
    }
    
    
    @Override
    public String toString() {
        return "Número da Conta: " + numeroConta + "\nTitular: " + nomeTitular + "\nSaldo: R$" + saldo;
    }

    
}