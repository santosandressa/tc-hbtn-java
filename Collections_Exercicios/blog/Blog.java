package blog;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Blog {

    private List<Post> postagens;

    public Blog(){
        this.postagens = new ArrayList<>();
    }

    public void adicionarPostagem(Post postagem){
        this.postagens.add(postagem);
    }

    public Set<String> obterTodosAutores(){
       return null;
    }

}
