import java.util.ArrayList;

public class Ex3 {

    public static void main(String[] args) {

        ArrayList<Integer> vetorA = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            vetorA.add(i);
        }

        System.out.println("Vetor A");
        System.out.println(vetorA);


        ArrayList<Integer> vetorB = new ArrayList<>();

        for (int i = 0; i < vetorA.size(); i++) {
            vetorB.add(vetorA.get(i) * vetorA.get(i));
        }

        System.out.println();
        System.out.println("Vetor B");
        System.out.println(vetorB);
    }
}
