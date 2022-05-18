import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exemplo4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Elixir");
        list.add("NodeJs");
        list.add("Ruby on Rails");
        list.add("C++");
        list.add("C#");

        System.out.println("Frequencia: " + Collections.frequency(list, "C#"));
    }
}
