import java.util.ArrayList;
import java.util.HashMap;

public class ListaTelefonica {

    private HashMap<String, ArrayList<Telefone>> listaTelefonica;

    public ListaTelefonica() {
        this.listaTelefonica = new HashMap<String, ArrayList<Telefone>>();
    }

    public void adicionarTelefone(String nome, Telefone telefone) {

        ArrayList<Telefone> telefones = this.listaTelefonica.get(nome);

        if (telefones == null) {
            telefones = new ArrayList<>();
        }

        telefones.add(telefone);
        listaTelefonica.put(nome, telefones);
    }

    public ArrayList<Telefone> buscar(String nome) {
        return this.listaTelefonica.get(nome);
    }

}
