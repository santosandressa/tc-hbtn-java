package cookies;

import java.util.ArrayList;

public class Pedido {

    private ArrayList<PedidoCookie> cookies;

    public Pedido(){
        this.cookies = new ArrayList<>();
    }

    public void adicionarPedidoCookie(PedidoCookie cookie){
        this.cookies.add(cookie);
    }


    public int obterTotalCaixas() {
        int total = 0;

        for (PedidoCookie cookie : this.cookies) {
            total += cookie.getQuantidadeCaixas();
        }

        return total;

    }

    public int removerSabor(String sabor) {
        int total = 0;

        for (int i = 0; i < this.cookies.size(); i++) {
            if (this.cookies.get(i).getSabor().equals(sabor)) {
                total += this.cookies.get(i).getQuantidadeCaixas();
                this.cookies.remove(i);
            }
        }

        return total;
    }

}
