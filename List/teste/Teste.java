package teste;

import java.util.ArrayList;
import java.util.List;

public class Teste {

    List<ReturnResponsedto> returnResponsedtos;

    public Teste(){
        this.returnResponsedtos = new ArrayList<>();
    }

    public List<ReturnResponsedto> getReturnResponsedtos() {
        return returnResponsedtos;
    }

    public void setReturnResponsedtos(List<ReturnResponsedto> returnResponsedtos) {
        this.returnResponsedtos = returnResponsedtos;
    }


    public void addReturnResponsedto(List<ReturnResponsedto> returnResponsedtos, ReturnResponsedto returnResponsedto){

        returnResponsedtos.add(returnResponsedto);
    }

    public void imprimir(){
        for(ReturnResponsedto returnResponsedto : this.returnResponsedtos){
            System.out.println(returnResponsedto.getId());
        }
    }
}
