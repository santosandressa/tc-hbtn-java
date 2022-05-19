import java.util.*;

public class Blog {

    private List<Post> postagens;

    public Blog(){
        this.postagens = new ArrayList<>();
    }

    public void adicionarPostagem(Post postagem) {
        this.postagens.add(postagem);
    }

    public Set<String> obterTodosAutores(){
        Set<String> autores = new TreeSet<>();

        for (Post postagem : postagens) {
            autores.add(postagem.getAutor());
        }

        return autores;
    }

    public Map<String, Integer> obterContagemPorCategoria(){

        Map<String, Integer> contagem = new HashMap<>();

        for (Post postagem : postagens) {
            String categoria = postagem.getCategoria();
            Integer contador = contagem.get(categoria);
            if(contador == null){
                contador = 0;
            }
            contador++;
            contagem.put(categoria, contador);
        }

        return new TreeMap<>(contagem);
    }
}
