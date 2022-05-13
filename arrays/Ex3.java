import java.util.ArrayList;

public class Ex3 {

    public static void main(String[] args) {

        // Crie um vetor A com 15 elementos inteiros.
        // Contruir um vetor B de mesmo tamanho e tipo,
        // sendo que cada elemento do vetor B deverá ser o quadrado do respectivo elemento do vetor A.
        // ou seja B[i] = A[i] * A[i]

        ArrayList<Integer> vetorA = new ArrayList<>();

        for (int i = 0; i < 15; i++) {
            vetorA.add(i);
        }

        System.out.println("Vetor A");
        System.out.println(vetorA);
        System.out.println();


        ArrayList<Integer> vetorB = new ArrayList<>();

        for (int i = 0; i < vetorA.size(); i++) {
            vetorB.add(vetorA.get(i) * vetorA.get(i));

            System.out.println(vetorA.get(i) + " * " + vetorA.get(i) + " = " + vetorB.get(i));
        }

        System.out.println();
        System.out.println("Vetor B");
        System.out.println(vetorB);
    }
}
