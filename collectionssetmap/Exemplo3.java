import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exemplo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Elixir");
        list.add("NodeJs");
        list.add("Ruby on Rails");
        System.out.println(list);

        Collections.addAll(list, "C++", "C#");
        System.out.println(list);
    }
}
