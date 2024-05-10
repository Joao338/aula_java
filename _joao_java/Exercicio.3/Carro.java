import java.util.ArrayList;
public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private int velocidadeAtual;
    
   
    public Carro(String marca, String modelo, int ano, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velocidadeAtual = 0; 
    }
    
    
    public void acelerar(int incremento) {
        if (incremento > 0) {
            velocidadeAtual += incremento;
        }
    }
    
   
    public void frear(int decremento) {
        if (decremento > 0 && velocidadeAtual - decremento >= 0) {
            velocidadeAtual -= decremento;
        }
    }
    
    
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Placa: " + placa);
        System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h");
    }


}