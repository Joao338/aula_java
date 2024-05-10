import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public static void main(String[] args) {
    
    ContaBancaria conta1 = new ContaBancaria(12345, "Vitor", 1000);
    System.out.println(conta1);
    
    conta1.depositar(500);
    System.out.println("Novo saldo após depósito: R$" + conta1.consultarSaldo());
    
    conta1.sacar(200);
    System.out.println("Novo saldo após saque: R$" + conta1.consultarSaldo());
}