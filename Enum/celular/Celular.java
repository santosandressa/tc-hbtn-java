import java.util.ArrayList;

public class Celular {

    private ArrayList<Contato> contatos = new ArrayList<Contato>();

    public Celular(){
        this.contatos = new ArrayList<Contato>();
    }

    public ArrayList<Contato> getContato() {
        return contatos;
    }

    public void setContato(ArrayList<Contato> contato) {
        this.contatos = contato;
    }

    public Celular(ArrayList<Contato> contato) {
        this.contatos = contato;
    }

    public int obterPosicaoContato(String nome) {
        for (int i = 0; i < this.contatos.size(); i++) {
            if (this.contatos.get(i).getNome().equals(nome)) {
                return i;
            }
        }
        return -1;
    }

    public void adicionarContato(Contato contato) {

        if (this.obterPosicaoContato(contato.getNome()) == -1) {
            this.contatos.add(contato);
        } else {
            throw new IllegalArgumentException("Nao foi possivel adicionar contato. Contato jah existente com esse nome");
        }
    }

    public void atualizarContato(Contato contatoAntigo, Contato novoContato) {
        for (Contato value : this.contatos) {

            if (obterPosicaoContato(novoContato.getNome()) != -1 && obterPosicaoContato(contatoAntigo.getNome()) == -1) {
                throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");
            } else if (obterPosicaoContato(novoContato.getNome()) != obterPosicaoContato(contatoAntigo.getNome())) {
                throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato jah existente com esse nome");
            } else {
                if (value.getNome().equals(contatoAntigo.getNome())) {
                    value.setNome(novoContato.getNome());
                    value.setNumeroTelefone(novoContato.getNumeroTelefone());
                    value.setTipoNumero(novoContato.getTipoNumero());
                }
            }
        }
    }

    public void removerContato(Contato contato) {
        int posicao = this.obterPosicaoContato(contato.getNome());

        if (posicao == -1) {
            throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");
        }

        this.contatos.remove(posicao);
    }

    public void listarContatos() {
        for (Contato value : this.contatos) {
            System.out.println(value.getNome() + " -> " + value.getNumeroTelefone() + " (" + value.getTipoNumero() + ")");
        }
    }
}
