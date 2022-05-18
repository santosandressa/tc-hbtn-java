import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exemplo2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 4 ,2 ,5);

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

    }
}
