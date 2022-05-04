

public class PersonagemGame {

    private int saudeAtual;
    private String nome;

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int tomarDano(int quantidadeDeDano){
        this.saudeAtual -= quantidadeDeDano;

        if (this.saudeAtual <= 0){
            this.saudeAtual = 0;
        }

        return this.saudeAtual;
    }

    public int receberCura(int quantidadeDeCura){
        this.saudeAtual += quantidadeDeCura;

        if (this.saudeAtual >= 100){
            this.saudeAtual = 100;
        }

        return  this.saudeAtual;
    }

}
