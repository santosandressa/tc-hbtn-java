import comida.Comida;
import humor.*;


public class Personagem {

    private int pontosDeFelicidade;
    private Humor humor;


    public Humor obterHumorAtual(int pontosDeFelicidade) {
        if ( pontosDeFelicidade < -5) {
            humor = new Irritado();
        } else if (pontosDeFelicidade <= 0) {
            humor = new Triste();
        } else if (pontosDeFelicidade < 15) {
            humor = new Feliz();
        } else {
            humor = new MuitoFeliz();
        }

        return humor;
    }

    public void comer(Comida[] comidas){
        for (Comida comida : comidas) {
            pontosDeFelicidade += comida.getPontosDeFelicidade();
        }
    }

    @Override
    public String toString() {
        return pontosDeFelicidade + " - " + obterHumorAtual(pontosDeFelicidade).getClass().getSimpleName();
    }
}
