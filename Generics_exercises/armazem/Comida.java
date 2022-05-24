
public class Comida {

    private String nome;
    private double calorias;
    private double preço;

    public Comida(String nome, double calorias, double preço) {
        this.nome = nome;
        this.calorias = calorias;
        this.preço = preço;
    }

    @Override
    public String toString() {
        return "[" + nome + "] " + calorias + " R$ " + preço;
    }
}
