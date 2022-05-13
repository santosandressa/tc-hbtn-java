import java.util.ArrayList;

public class Ex7 {
    public static void main(String[] args) {

        //Criar dois vetores A e B cada um com 10 elementos inteiros.
        // Construir um vetor C, onde cada elemento de C é a divisão dos respectivos elementos em A e B
        // ou seja: C[i] = A[i] / float(B[i])

        ArrayList<Integer> vetorA = new ArrayList<>();
        ArrayList<Integer> vetorB = new ArrayList<>();
        ArrayList<Integer> vetorC = new ArrayList<>();

        vetorA.add(4);
        vetorA.add(6);
        vetorA.add(8);
        vetorA.add(10);
        vetorA.add(12);
        vetorA.add(14);
        vetorA.add(16);
        vetorA.add(18);
        vetorA.add(20);
        vetorA.add(22);


        vetorB.add(1);
        vetorB.add(2);
        vetorB.add(2);
        vetorB.add(5);
        vetorB.add(3);
        vetorB.add(7);
        vetorB.add(3);
        vetorB.add(3);
        vetorB.add(5);
        vetorB.add(6);


        System.out.println("Index do vetor A: " + vetorA.size());
        System.out.println("Vetor A: " + vetorA);
        System.out.println();
        System.out.println("Index do vetor B: " + vetorB.size());
        System.out.println("Vetor B: " + vetorB);
        System.out.println();

        for (int i= 0; i < vetorB.size(); i++){
            float resultado = vetorA.get(i) / vetorB.get(i);

            vetorC.add((int) resultado);
            System.out.println(vetorA.get(i) + "/" + vetorB.get(i) + " = " + resultado);
        }

        System.out.println();
        System.out.println("Index do vetor C: " + vetorC.size());
        System.out.println("Vetor C: " + vetorC);
    }
}
