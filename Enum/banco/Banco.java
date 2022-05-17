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

        for (Agencia agencia : this.agencias) {
            if (agencia.getNome().equals(nome)) {
                return agencia;
            }
        }

        return null;
    }

    public boolean adicionarAgencia(String nomeAgencia){
        Agencia agenciaExistente = buscarAgencia(nomeAgencia);

        if (agenciaExistente != null){
            return false;
        }

        Agencia novaAgencia = new Agencia(nomeAgencia);
        agencias.add(novaAgencia);

        return true;
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

    public boolean listarClientes(String nomeAgencia, boolean imprimirTransacoes){
        Agencia agenciaExistente = buscarAgencia(nomeAgencia);

        if (agenciaExistente == null){
            return false;
        }

      for (int i = 0; i < agenciaExistente.getClientes().size(); i++) {
          Cliente clienteExistente = agenciaExistente.getClientes().get(i);

          System.out.println("Cliente: " + clienteExistente.getNome() + " [" + (i + 1) + "]");

          if (imprimirTransacoes) {
              for (int j = 0; j < clienteExistente.getTransacoes().size(); j++) {
                  System.out.println("  [" + (j + 1) + "] valor " + clienteExistente.getTransacoes().get(j));
              }
          }

      }

      return true;
    }

    public boolean adicionarTransacaoCliente(String nomeAgencia, String nomeCliente, double valorTransacao){
        Agencia agenciaExistente = buscarAgencia(nomeAgencia);

        if (agenciaExistente == null){
            return false;
        }

        agenciaExistente.adicionarTransacaoCliente(nomeCliente, valorTransacao);

        return true;
    }

}
