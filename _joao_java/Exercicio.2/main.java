import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public static void main(String[] args) {
    Calculadora calculadora = new Calculadora();
    
    
    double resultadoSoma = calculadora.adicionar(10, 5);
    System.out.println("10 + 5 = " + resultadoSoma);

    double resultadoSubtracao = calculadora.subtrair(10, 5);
    System.out.println("10 - 5 = " + resultadoSubtracao);

    double resultadoMultiplicacao = calculadora.multiplicar(10, 5);
    System.out.println("10 * 5 = " + resultadoMultiplicacao);

    double resultadoDivisao = calculadora.dividir(10, 5);
    System.out.println("10 / 5 = " + resultadoDivisao);
}