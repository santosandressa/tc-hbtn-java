package provedores;

public class Sedex implements ProvedorFrete{


    @Override
    public Frete calcularFrete(double peso, double valor) {

        Frete frete = new Frete();

        if (peso > 1000) {
            valor= (valor * 0.1);

        } else {
            valor= (valor * 0.05);
        }

        frete.setValor(valor);


        return frete;
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
             return TipoProvedorFrete.SEDEX;
    }

}
