package workflow;

import workflow.atividades.Atividade;

public class MaquinaWorkflow {

    void executar(Workflow workflow) {
        for (Atividade atividade : workflow.getAtividades()){
            atividade.executar();
        }
    }
}
