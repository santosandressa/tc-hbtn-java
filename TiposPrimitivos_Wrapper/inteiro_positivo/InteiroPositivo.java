package inteiro_positivo;

public class InteiroPositivo {

    private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {

        if (valor < 0) {
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }

        this.valor = valor;
    }

    public InteiroPositivo(int valor) {
        this.valor = valor;
    }

    public InteiroPositivo(String valor) {
        this.valor = Integer.parseInt(valor);
        setValor(this.valor);
    }

    public boolean ehPrimo() {
        int contador = 0;

        for (int i = 1; i <= this.valor; i++) {
            if (this.valor % i == 0) {
                contador++;
            }
        }

        return contador == 2;
    }
}
