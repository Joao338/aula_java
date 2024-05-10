

public class Calculadora {
    public double adicionar(double num1, double num2) {
        return num1 + num2;
    }
    
    public double subtrair(double num1, double num2) {
        return num1 - num2;
    }
    
    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }
    
    public double dividir(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Erro: divisão por zero!");
            return Double.NaN; 
        }
        return num1 / num2;
    }

 
}