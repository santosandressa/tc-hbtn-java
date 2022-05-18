import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {

        TreeSet<Integer> mySet = new TreeSet<>();
        mySet.add(1);
        mySet.add(2);
        mySet.add(56);
        mySet.add(42);
        mySet.add(42);

        System.out.println(mySet);

    }
}
