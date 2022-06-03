package numeros;

public class Numeros0a99 {
    public static void main(String[] args) {
        for (int i = 0; i < 99; i++) {
            System.out.printf(i + ", ");
            if (i == 98) {
                System.out.println("99");
            }
        }
    }
}
