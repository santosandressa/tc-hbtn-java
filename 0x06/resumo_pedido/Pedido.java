public class Pedido {

    private double percentualDesconto;

    private ItemPedido[] itens;

    public Pedido(int percentualDesconto, ItemPedido[] itens) {
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

    public void apresentarResumoPedido() {
        System.out.println("------- RESUMO PEDIDO -------");

        for (ItemPedido item : itens) {
            System.out.printf("Tipo:  %s Titulo: %s Preco: %.2f Quant: %d Total: %.2f\n", item.getProduto().getClass().getSimpleName(), item.getProduto().getTitulo(),
                    item.getProduto().obterPrecoLiquido(), item.getQuantidade(), (item.getProduto().obterPrecoLiquido() * item.getQuantidade()));

        }

        double total = 0;
        for (ItemPedido iten : itens) {
            total += iten.getProduto().obterPrecoLiquido() * iten.getQuantidade();
        }

        double desconto = (total * percentualDesconto / 100);

        System.out.println("----------------------------");
        System.out.printf("DESCONTO: %.2f\n", desconto);
        System.out.printf("TOTAL PRODUTOS: %.2f\n", total);
        System.out.println("----------------------------");
        System.out.printf("TOTAL PEDIDO: %.2f\n", calcularTotal());
        System.out.print("----------------------------");

    }
}
