import java.util.ArrayList;

public class Ex2 {
    public static void main(String[] args) {

        // Crie um vetor A com 8 elementos inteiros.
        // Crie um vetor B de mesmo tipo e tamanho e com os mesmos elementos do vetor A
        // multiplicados por 2, ou seja, B[i] = A[i] * 2.

        ArrayList<Integer> vetorA = new ArrayList<>();
        vetorA.add(1);
        vetorA.add(2);
        vetorA.add(3);
        vetorA.add(4);
        vetorA.add(5);
        vetorA.add(6);
        vetorA.add(7);
        vetorA.add(8);

        System.out.println("Vetor A");
        System.out.println(vetorA);
        System.out.println();

        ArrayList<Integer> vetorB = new ArrayList<>();
        int multiplicador = 2;
        for (int i = 0; i < vetorA.size(); i++) {
            vetorB.add(vetorA.get(i) * multiplicador);
            System.out.println(vetorA.get(i) + " * " +  multiplicador + " = " + vetorA.get(i) * multiplicador);
        }

        System.out.println();
        System.out.println("Vetor B");
        System.out.println(vetorB);
    }
}
