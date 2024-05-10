public class Agenda {
    private ArrayList<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato novoContato) {
        contatos.add(novoContato);
        System.out.println("Contato adicionado: " + novoContato.getNome());
    }

    public void removerContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equals(nome)) {
                contatos.remove(contato);
                System.out.println("Contato removido: " + nome);
                return;
            }
        }
        System.out.println("Contato não encontrado: " + nome);
    }

    public Contato buscarContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equals(nome)) {
                return contato;
            }
        }
        return null;
    }

   
}
