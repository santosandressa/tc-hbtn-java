package armazem_especifico;

public class ArmazemDeEletronico<T> extends Armazem<Eletronico> {
    @Override
    public Eletronico obterDoInventario(String nome) {
        return super.obterDoInventario(nome);
    }
}