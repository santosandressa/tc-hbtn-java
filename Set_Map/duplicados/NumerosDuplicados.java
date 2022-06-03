package duplicados;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class NumerosDuplicados {

    public static TreeSet<Integer> buscar(int[] numeros) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        Set<Integer> numerosDuplicados = new HashSet<>();

        for (int numero : numeros) {
            if (numerosDuplicados.contains(numero)) {
                treeSet.add(numero);
            }
            numerosDuplicados.add(numero);
        }

        return treeSet;
    }
}
