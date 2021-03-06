package livraria;

import livraria.exceptions.AutorInvalidoException;
import livraria.exceptions.LivroInvalidoException;

public class Livro {
    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco) throws AutorInvalidoException, LivroInvalidoException {
        Livro livro = new Livro();
        this.titulo = livro.getTitulo();
        this.autor = livro.getAutor();
        this.preco = livro.getPreco();
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setPreco(preco);
    }

    public Livro() {
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) throws AutorInvalidoException {
        if (!autor.contains(" ")) {
            throw new AutorInvalidoException("Nome de autor invalido");
        }
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) throws LivroInvalidoException {
        if (preco <= 0) {
            throw new LivroInvalidoException("Preco de livro invalido");
        }
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) throws LivroInvalidoException {
        if (titulo.length() < 3) {
            throw new LivroInvalidoException("Titulo de livro invalido");
        }
        this.titulo = titulo;
    }
}
