import java.util.HashMap;
import java.util.HashSet;

public class ListaTelefonica {
    private HashMap<String, HashSet<Telefone>> listaTelefonica;

    public ListaTelefonica(){
        this.listaTelefonica = new HashMap<String, HashSet<Telefone>>();
    }

    public void adicionarTelefone(String nome, Telefone telefone) {

        HashSet<Telefone> telefones = this.listaTelefonica.get(nome);

        if (telefones == null) {
            telefones = new HashSet<>();
        }

        if (telefones.contains(telefone)){
            throw new IllegalArgumentException("Telefone jah existente para essa pessoa");
        }

        for (HashSet<Telefone> lista : this.listaTelefonica.values()) {
            if (lista.contains(telefone)) {
                throw new IllegalArgumentException("Telefone jah pertence a outra pessoa");
            }
        }

        telefones.add(telefone);
        listaTelefonica.put(nome, telefones);
    }

    public HashSet<Telefone> buscar(String nome) {
        return this.listaTelefonica.get(nome);
    }
}
