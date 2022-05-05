

public class Retangulo extends FormaGeometrica {

    private double largura;

    private double altura;

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (this.largura < 0){
            throw new IllegalArgumentException("Largura deve ser maior ou igual a 0");
        }

        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (this.altura < 0 ){
            throw new IllegalArgumentException("Altura deve ser maior ou igual a 0");
        }
        this.altura = altura;
    }

    @Override
    public double area() {
        double areaRetangulo = this.largura * this.altura;
        return areaRetangulo;
    }

    @Override
    public String toString() {
        return String.format("[Retangulo] %.2f / %.2f", this.largura, this.altura);
    }
}
