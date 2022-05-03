

public class LivroEdicaoOuro extends Livro {

    public LivroEdicaoOuro(String titulo, String autor, double preco) throws AutorInvalidoException, LivroInvalidoEception {
        super(titulo, autor, preco);
    }

    @Override
    public double getPreco() {
        return (super.getPreco() * 0.3) + super.getPreco();
    }
}
