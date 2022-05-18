import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exemplo1 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

       int indice = Collections.binarySearch(numeros, 4);

        System.out.println("Indice: " + indice);
    }
}
