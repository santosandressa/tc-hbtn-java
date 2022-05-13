enum Valores
{
    UM("UM"), DOIS("DOIS"), TRES("TRES");

    String nome = "NOME";

    private Valores(String nome)
    {
        this.nome = nome;
    }

    void metodo()
    {
        System.out.println(nome);
    }
}

public class MainClass
{
    public static void main(String[] args)
    {
        Valores.UM.metodo();
        Valores.DOIS.metodo();
        Valores.TRES.metodo();
    }
}