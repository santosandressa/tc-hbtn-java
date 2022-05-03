package salario;

public class Gerente extends Empregado {

    public Gerente(double salarioFixo) {
        super(salarioFixo);
    }

    @Override
    public double calcularBonus(Departamento departamento) {
        if (departamento.alcancouMeta() == true) {
            double bonus = (getSalarioFixo() * 0.2) + ((departamento.getValorAtingidoMeta() - departamento.getValorMeta()) * 0.01);
            return bonus;
        } else {
            return 0;
        }
    }

    @Override
    public double calcularSalarioTotal(Departamento departamento) {
        return getSalarioFixo() + calcularBonus(departamento);
    }
}
