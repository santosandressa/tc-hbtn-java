package banco;

import java.util.ArrayList;

public class Agencia {

    private String nome;

    private ArrayList<Cliente> clientes;

    public String getNome() {
        return nome;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public Agencia(String nome) {
        this.nome = nome;
        this.clientes = new ArrayList<Cliente>();
    }


    public boolean novoCliente(String nomeCliente, double valorTransacaoInicial) {
        Cliente clienteExistente = buscarCliente(nomeCliente);

        if (clienteExistente != null) {
            return false;
        }

        Cliente novoCliente = new Cliente(nomeCliente, valorTransacaoInicial);
        this.clientes.add(novoCliente);

        return true;
    }

    public Cliente buscarCliente(String nomeCliente) {

        for (Cliente cliente : this.clientes) {
            if (cliente.getNome().equals(nomeCliente)) {
                return cliente;
            }
        }
        return null;
    }

    public boolean adicionarTransacaoCliente(String nomeCliente, double valorTransacao){
        Cliente clienteExistente = buscarCliente(nomeCliente);

        if(clienteExistente == null){
            return false;
        }

        clienteExistente.adicionarTransacao(valorTransacao);

        return true;
    }


}
