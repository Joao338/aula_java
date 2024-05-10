import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public static void main(String[] args) {
       
    Jogador jogador1 = new Jogador("João Vitor", 1000, 5);
    System.out.println(jogador1); 
    
    jogador1.aumentarPontuacao(500);
    jogador1.subirNivel();
    System.out.println(jogador1); 
}