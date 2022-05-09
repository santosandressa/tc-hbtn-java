package provedores;

public class JadLog implements ProvedorFrete{

    @Override
    public Frete calcularFrete(double peso, double valor) {
        Frete frete = new Frete();

        if (peso > 2000) {
            valor = valor * 0.7;
        } else {
            valor = valor * 0.045;
        }

        frete.setValor(valor);


        return frete;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.JADLOG;
    }
}
