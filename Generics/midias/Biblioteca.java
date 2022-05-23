import java.util.ArrayList;
import java.util.List;

public class Biblioteca<T> extends Midia{

    private List<T> valores;

    public Biblioteca() {
        this.valores = new ArrayList<>();
    }

    public void adicionarMidia(T t){
        this.valores.add(t);
    }

   public List<T> obterListaMidias() {
        return valores;
    }
}
