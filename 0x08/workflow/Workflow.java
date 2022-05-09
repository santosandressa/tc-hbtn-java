package workflow;

import workflow.atividades.Atividade;

import java.util.ArrayList;
import java.util.List;

public class Workflow {

    private List<Atividade> atividades;

    public List<Atividade> getAtividades() {
        return atividades;
    }

    public void setAtividades(List<Atividade> atividades) {
        this.atividades = atividades;
    }

    public Workflow(){
        this.atividades = new ArrayList<Atividade>();
    }

    void registrarAtividade(Atividade atividade){
        this.atividades.add(atividade);
    }


}
