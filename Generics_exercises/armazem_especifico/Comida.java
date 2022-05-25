package armazem_especifico;

public class Comida {

    private String nome;
    private double calorias;
    private double preço;

    public Comida(String nome, double calorias, double preço) {
        this.nome = nome;
        this.calorias = calorias;
        this.preço = preço;
    }

    public Comida() {
    }

    @Override
    public String toString() {

        return String.format("[%s] %.6f R$ %.6f",  nome, calorias, preço);
    }
}
