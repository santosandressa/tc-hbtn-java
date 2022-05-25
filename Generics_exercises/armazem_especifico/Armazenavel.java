package armazem_especifico;

public interface Armazenavel<T> {

    void adicionarAoInventario(String nome, T t);

    T obterDoInventario(String nome);
}