package banco;

import java.util.ArrayList;

public class Banco {

    private String nome;

    private ArrayList<Agencia> agencias;

    public Banco(String nome) {
        this.nome = nome;
        this.agencias = new ArrayList<Agencia>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Agencia> getAgencias() {
        return agencias;
    }

    public void setAgencias(ArrayList<Agencia> agencias) {
        this.agencias = agencias;
    }

    public Agencia buscarAgencia(String nome) {

        for (Agencia agencia : agencias) {
            if (agencia.equals(nome)) {
                return agencia;
            }
        }

        return null;
    }

    public boolean adicionarAgencia(String nome){
       if (buscarAgencia(nome) == null && !buscarAgencia(nome).equals(nome)){
           agencias.add(new Agencia(nome));
           return true;
       } else {
           return false;
       }
    }

    public boolean adicionarCliente(String nomeAgencia, String nomeCliente, double valorTransacao){
        Agencia agenciaExistente = buscarAgencia(nomeAgencia);

        if (agenciaExistente == null){
            return false;

        }

        agenciaExistente.novoCliente(nomeCliente, valorTransacao);
        agenciaExistente.adicionarTransacaoCliente(nomeCliente, valorTransacao);

        return true;
    }

}
