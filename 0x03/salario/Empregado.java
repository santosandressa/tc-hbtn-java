package salario;

public class Empregado {

    private double salarioFixo;

    public double getSalarioFixo() {
        return salarioFixo;
    }
    public Empregado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }
    double calcularBonus(Departamento departamento){
        if (departamento.alcancouMeta() == true){
            return salarioFixo * 0.1;
        } else {
            return 0;
        }
    }
    double calcularSalarioTotal(Departamento departamento){
        return salarioFixo + calcularBonus(departamento);
    }
}
