import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public static void main(String[] args) {
    Agenda minhaAgenda = new Agenda();

    
    Contato novoContato = new Contato("João Vitor", "987654321");
    minhaAgenda.adicionarContato(novoContato);


    Contato contatoEncontrado = minhaAgenda.buscarContato("João Vitor");
    if (contatoEncontrado != null) {
        System.out.println("Contato encontrado: " + contatoEncontrado.getNome() + " - " + contatoEncontrado.getTelefone());
    } else {
        System.out.println("Contato não encontrado.");
    }

    minhaAgenda.removerContato("João Vitor");
}