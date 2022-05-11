package pedido_livraria;

public class Pedido {

    private final double percentualDesconto;

    private final ItemPedido[] itens;

    public Pedido(int percentualDesconto, ItemPedido[] itens) {
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal() {
        double total = 0;

        for (ItemPedido item : itens) {
            total += item.getProduto().obterPrecoLiquido() * item.getQuantidade();
        }


        total -= total * percentualDesconto / 100;

        return total;
    }
}
