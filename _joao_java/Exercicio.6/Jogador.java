import java.util.ArrayList;
public class Jogador {
    private String nome;
    private int pontuacao;
    private int nivel;
    
    
    public Jogador(String nome, int pontuacao, int nivel) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    
    
    public void aumentarPontuacao(int pontos) {
        if (pontos > 0) {
            pontuacao += pontos;
            System.out.println("Pontuação de " + pontos + " pontos adicionada com sucesso para o jogador " + nome + ".");
        } else {
            System.out.println("Quantidade de pontos inválida.");
        }
    }
    
    
    public void subirNivel() {
        nivel++;
        System.out.println("O jogador " + nome + " subiu para o nível " + nivel + ".");
    }
    
    
    @Override
    public String toString() {
        return "Nome: " + nome + "\nPontuação: " + pontuacao + "\nNível: " + nivel;
    }

   
}