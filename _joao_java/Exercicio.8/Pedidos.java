import java.util.ArrayList;

public class Pedidos {
    private ArrayList<Pizza> pizzas;
    private String enderecoEntrega;

    public Pedidos() {
        pizzas = new ArrayList<>();
        enderecoEntrega = "";
    }

    public void adicionarPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public void cancelarPedido() {
        pizzas.clear();
        enderecoEntrega = "";
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public void gerarRelatorio() {
        double valorTotal = 0;
        System.out.println("Relatório do Pedido:");
        System.out.println("Endereço de Entrega: " + enderecoEntrega);
        System.out.println("Pizzas:");
        for (Pizza pizza : pizzas) {
            System.out.println("- " + pizza.getNome() + " (R$" + pizza.getValor() + ")");
            valorTotal += pizza.getValor();
        }
        System.out.println("Valor Total: R$" + valorTotal);
    }
}
