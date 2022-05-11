package contas_especiais;

public class ContaBancariaControlada extends ContaBancariaBasica {

    private final double saldoMinimo;
    private final double valorPenalidade;


    public ContaBancariaControlada(String numeracao, double taxaJurosAnual, double saldoMinimo, double valorPenalidade) {
        super(numeracao, taxaJurosAnual);
        this.saldoMinimo = saldoMinimo;
        this.valorPenalidade = valorPenalidade;
        this.getSaldo();
    }

    @Override
    public void aplicarAtualizacaoMensal() {
        super.aplicarAtualizacaoMensal();
        if (getSaldo() < saldoMinimo || getSaldo() == 0) {
            setSaldo(getSaldo() - valorPenalidade);
        }
    }
}
