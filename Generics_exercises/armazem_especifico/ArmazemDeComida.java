package armazem_especifico;

public class ArmazemDeComida<T> extends Armazem<Comida> {

    @Override
    public Comida obterDoInventario(String nome) {
        return super.obterDoInventario(nome);
    }
}
