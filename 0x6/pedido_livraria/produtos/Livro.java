public class Livro extends Produto{

    private int paginas;
    private String autor;
    private int edicao;



    public Livro(String titulo, int ano, String pais, double precoBruto, int paginas, String autor, int edicao) {
        super(titulo, ano, pais, precoBruto);
        this.paginas = paginas;
        this.autor = autor;
        this.edicao = edicao;
    }


    @Override
    public double obterPrecoLiquido() {
        double precoLiquido;
        double acrescimo = 0.15;

        precoLiquido = (this.getPrecoBruto() + (this.getPrecoBruto() * acrescimo));

       System.out.println("Preço liquido livro: " + precoLiquido);

        return precoLiquido;
    }

}
