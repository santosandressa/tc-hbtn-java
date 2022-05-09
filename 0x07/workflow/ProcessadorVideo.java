package workflow;

import java.util.ArrayList;
import java.util.List;

public class ProcessadorVideo {

    List<CanalNotificacao> canais;

    public ProcessadorVideo() {
        this.canais = new ArrayList<CanalNotificacao>();
    }

    void registrarCanal(CanalNotificacao canal) {
        this.canais.add(canal);
    }

    void processar(Video video) {
        for (CanalNotificacao canal : canais) {
            Mensagem mensagem = new Mensagem();
            mensagem.setTipoMensagem(TipoMensagem.LOG);
            mensagem.setTexto(video.getArquivo() + " - " + video.getFormato());
            System.out.println(canal.notificar(mensagem));
        }
    }
}
