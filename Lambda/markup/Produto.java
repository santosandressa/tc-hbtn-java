import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {

      private String nome;

    private double preco;

    private double percentualMarkUp = 0.10;

    public Supplier<Double> precoComMarkUp = () -> preco + (preco * percentualMarkUp);

    public Consumer<Double> atualizarMarkUp = (novoMarkUp) -> percentualMarkUp = (novoMarkUp / 100);

    public Produto( double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

}
