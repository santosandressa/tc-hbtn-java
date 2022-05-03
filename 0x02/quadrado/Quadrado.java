public class Quadrado {
    public static double area(double lado) {
        double resultado = 0;
        try {
            resultado = lado * lado;

            if (lado < 0) {
                throw new IllegalArgumentException();
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Lado deve possuir valor positivo");
        }
        return resultado;
    }
}
