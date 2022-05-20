
import java.util.*;

public class Blog {

    private List<Post> postagens;

    public Blog() {
        this.postagens = new ArrayList<>();
    }


    public void adicionarPostagem(Post post) {

        for (Post p : this.postagens) {
            if (p.getAutor().equals(post.getAutor()) && p.getTitulo().equals(post.getTitulo())) {
                throw new IllegalArgumentException("Postagem jah existente");
            }
        }
        this.postagens.add(post);
    }

    public Set<Autor> obterTodosAutores() {
        Set<Autor> autores = new TreeSet<>();

        for (Post p : this.postagens) {
            autores.add(p.getAutor());
        }

        return autores;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria() {
        Map<Categorias, Integer> mapa = new HashMap<>();

        for (Post p : this.postagens) {
            mapa.put(p.getCategoria(), mapa.getOrDefault(p.getCategoria(), 0) + 1);
        }

        return new TreeMap<>(mapa);
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {

        Map<Categorias, Set<Post>> todosPosts = new TreeMap<>();

        for (Post p : this.postagens) {
            Set<Post> postagem;

            if (todosPosts.containsKey(p.getCategoria())) {
                postagem = todosPosts.get(p.getCategoria());
            } else {
                postagem = new TreeSet<>();
            }

            postagem.add(p);
            todosPosts.put(p.getCategoria(), postagem);
        }
        return todosPosts;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria) {
        Set<Post> posts = new TreeSet<>();

        for (Post p : this.postagens) {
            if (p.getCategoria() == categoria) {
                posts.add(p);
            }
        }
        return posts;
    }

    public Set<Post> obterPostsPorAutor(Autor autor) {
        Set<Post> posts = new TreeSet<>();

        for (Post p : this.postagens) {
            if (p.getAutor().equals(autor)) {
                posts.add(p);
            }
        }
        return posts;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        Map<Autor, Set<Post>> todosPosts = new TreeMap<>();

        for (Post p : this.postagens) {
            Set<Post> postagem;

            if (todosPosts.containsKey(p.getAutor())) {
                postagem = todosPosts.get(p.getAutor());
            } else {
                postagem = new TreeSet<>();
            }

            postagem.add(p);
            todosPosts.put(p.getAutor(), postagem);
        }
        return todosPosts;
    }


}
