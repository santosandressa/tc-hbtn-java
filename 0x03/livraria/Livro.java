

public class Livro {
    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco) throws AutorInvalidoException, LivroInvalidoEception {
        Livro livro = new Livro();
        this.titulo = livro.getTitulo();
        this.autor = livro.getAutor();
        this.preco = livro.getPreco();
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setPreco(preco);
    }

    public Livro(){}

    public void setTitulo(String titulo) throws LivroInvalidoEception {
            if (titulo.length() < 3 || titulo.isEmpty()) {
                throw new LivroInvalidoEception("Titulo de livro invalido");
            }
        this.titulo = titulo;
    }

    public void setAutor(String autor) throws AutorInvalidoException {
            if (!autor.contains(" ")) {
                throw new AutorInvalidoException("Titulo de livro invalido");
            }
        this.autor = autor;
    }

    public void setPreco(double preco) throws LivroInvalidoEception {
            if (preco <= 0) {
                throw new LivroInvalidoEception("Preco de livro invalido");
            }
        this.preco = preco;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    public String getTitulo() {
        return titulo;
    }
}
