
public class PersonagemGame {

    private int saudeAtual;
    private String nome;

    private String status;

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        if (this.saudeAtual > 0) {
            this.status = "vivo";
        } else {
            this.status = "morto";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStatus() {
        return status;
    }

    public int tomarDano(int quantidadeDeDano){
        this.saudeAtual -= quantidadeDeDano;

        if (this.saudeAtual <= 0){
            this.saudeAtual = 0;
        }
        setSaudeAtual(this.saudeAtual);

        return this.saudeAtual;
    }

    public int receberCura(int quantidadeDeCura){
        this.saudeAtual += quantidadeDeCura;

        if (this.saudeAtual >= 100){
            this.saudeAtual = 100;
        }

        setSaudeAtual(this.saudeAtual);

        return  this.saudeAtual;
    }
}
