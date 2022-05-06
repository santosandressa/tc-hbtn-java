package pedido_livraria;

public class Pedido {

    private double percentualDesconto;

    private ItemPedido[] itens;

    public Pedido(int percentualDesconto, ItemPedido[] itens){
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal() {
        double total = 0;

        for (ItemPedido iten : itens) {
            total += iten.getProduto().obterPrecoLiquido() * iten.getQuantidade();
        }

        total -= total * percentualDesconto / 100;

        return total;
    }
}
