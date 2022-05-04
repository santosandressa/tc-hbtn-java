import exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {

    private String numeracao;
    private double saldo;
    private double taxaJurosAnual;

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual;
        this.saldo = 0;
    }

    public String getNumeracao() {
        return numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }


    public void depositar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0){
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
        this.saldo += valor;
    }

    public void sacar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0){
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que 0");
        } else if(valor > saldo){
            throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
        }

        this.saldo -=valor;
    }

    public double calcularTarifaMensal(){
        double taxaReal = 10.00;
        double taxaPorcentagem = 0.1;

        double saldoPorcentagem = saldo * taxaPorcentagem;

        if (saldoPorcentagem < taxaReal){
            return saldoPorcentagem;
        }
           return taxaReal;
    }

    public double calcularJurosMensal(){
        if (saldo <= 0){
            this.taxaJurosAnual = 0;
        }
           return ((this.taxaJurosAnual / 12)  * saldo) / 100;
    }

    public void aplicarAtualizacaoMensal(){
       this.saldo =  (this.saldo - calcularTarifaMensal()) + calcularJurosMensal();
    }

}
