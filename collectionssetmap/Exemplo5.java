import java.util.*;

public class Exemplo5 {
    public static void main(String[] args) {
        // Collection - Set

        String[] cores = {"verde", "azul", "vermelho", "verde", "azul", "vermelho"};

        List<String> lista = Arrays.asList(cores);

        System.out.println(lista);

        // Set - não aceita repetições
        Set<String> set = new HashSet<>(lista);

        System.out.println(set);

       set.clear();

    }
}
