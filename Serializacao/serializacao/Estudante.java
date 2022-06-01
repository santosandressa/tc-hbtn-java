package serializacao;

import java.io.Serializable;

public class Estudante implements Serializable {

    private static final long serialVersionUID = -7066587940855171271L;

    private int idade;
    private String nome;
    private transient String senha;

    public Estudante(int idade, String nome, String senha) {
        this.idade = idade;
        this.nome = nome;
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Estudante {" + " nome='" + nome + "', idade='" + idade + "', senha='" + senha + "' " + '}';
    }
}
