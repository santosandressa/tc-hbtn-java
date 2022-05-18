import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsEx {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Guaraná");
        list.add("Uva");
        list.add("Manga");
        list.add("Açai");
        list.add("Banana");
        System.out.println(list);

        //disjoint retorna false se as collections comparadas possuem elementos em comum
        // e true se não possuem
        List<String> list2 = Arrays.asList("Acerola", "Graviola");
        boolean d = Collections.disjoint(list, list2);
        System.out.println("Não possuem elementos em comum: " + d);
    }
}
