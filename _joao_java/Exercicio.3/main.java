import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public static void main(String[] args) {
        
    Carro carro1 = new Carro("Volkswagen", "Fusca", 1972, "ABC1234");
    carro1.exibirInformacoes();
    
    carro1.acelerar(50);
    carro1.frear(20);
    carro1.exibirInformacoes();
}
