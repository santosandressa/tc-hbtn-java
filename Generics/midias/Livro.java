package midias;

public class Livro extends Midia{

    private int edicao;

    public Livro(String nome, int edicao) {
        this.setNome(nome);
        this.edicao = edicao;
    }


    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }
}
