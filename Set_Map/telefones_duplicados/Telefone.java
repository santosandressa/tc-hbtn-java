import java.util.Objects;

public class Telefone {

    private String codigoArea;
    private String numero;

    public Telefone(String codigoArea, String numero) {
        this.codigoArea = codigoArea;
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Telefone)) return false;

        Telefone telefone = (Telefone) o;

        if (!codigoArea.equals(telefone.codigoArea)) return false;
        return numero.equals(telefone.numero);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.codigoArea);
        hash = 31 * hash + Objects.hashCode(this.numero);

        return hash;
    }

    @Override
    public String toString() {
        return "("+ codigoArea + ") " + numero ;
    }
}
