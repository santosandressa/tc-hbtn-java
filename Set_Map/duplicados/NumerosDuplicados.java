import java.util.*;

public class NumerosDuplicados {

    public static TreeSet<Integer> buscar(int[] numeros) {

        List<Integer> list = new ArrayList<>();

        for (int numero : numeros) {
            list.add(numero);
        }

        Set<Integer> numerosDuplicados = new HashSet<>();

        for (int numero : list) {
            if (Collections.frequency(list, numero) > 1) {
                numerosDuplicados.add(numero);
            }
        }

        return new TreeSet<>(numerosDuplicados);
    }
}
