package provedores;

public class Loggi implements ProvedorFrete{

    @Override
    public Frete calcularFrete(double peso, double valor) {
        Frete frete = new Frete();

        if (peso > 5000){
            valor = valor * 0.12;
        } else {
            valor = valor * 0.04;
        }

        frete.setValor(valor);

        return frete;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.LOGGI;
    }


}
