
import java.util.ArrayList;

public class Ex4 {
    public static void main(String[] args) {

        // Crie um vetor A com 15 elementos inteiros
        // Construir um vetor B de mesmo tamanho, sendo que cada elemeento B deverá
        // ser a raiz quadrad do respectivo elemento de A, ou seja:
        // B[0] = Math.sqrt(A[0])

        ArrayList<Integer> vetorA = new ArrayList<>();

        for (int i =0; i < 15; i++){
            if (i % 2 == 0){
                vetorA.add(i);
            }
        }

        System.out.println("Vetor A");
        System.out.println(vetorA);
        System.out.println();

        ArrayList<Double> vetorB = new ArrayList<>();

        for (int i = 0; i < vetorA.size(); i++){
            double squareRoot =  Math.sqrt(vetorA.get(i));

            vetorB.add(squareRoot);
            System.out.println("Raiz quadrada de " + i + " = " + squareRoot);
        }

        System.out.println();
        System.out.println("Vetor B");
        System.out.println(vetorB);
    }
}
