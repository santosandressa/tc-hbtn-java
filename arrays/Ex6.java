import java.util.ArrayList;

public class Ex6 {
    public static void main(String[] args) {
        // Criar dois vetores A e B cada um com 10 elementos inteiros
        // Criar um vetor C, onde cada elemento e C é a soma dos respectivos elementos em A e B,
        // ou seja: C[i] = A[i] + B[i]

        ArrayList<Integer> vetorA = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            vetorA.add(i);
        }

        System.out.println("Vetor A: " + vetorA);

        ArrayList<Integer> vetorB = new ArrayList<>();
        vetorB.addAll(vetorA);

        System.out.println("Vetor B: " + vetorB);


        ArrayList<Integer> vetorC = new ArrayList<>();

        System.out.println();
        for (int i = 0; i < vetorA.size(); i++){
            int resultado = vetorA.get(i) + vetorB.get(i);

            vetorC.add(resultado);

            System.out.println(vetorA.get(i) + " + " + vetorB.get(i) + " = " + resultado);
        }

        System.out.println();
        System.out.println("Vetor C: " +vetorC);
    }
}
