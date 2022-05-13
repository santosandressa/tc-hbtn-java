import java.util.ArrayList;

public class Ex5 {
    public static void main(String[] args) {

        // Criar um vetor A com 10 elementos inteiros
        // Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento do vetor B
        // deverá ser o respectivo elemento de A multiplicado por sua posição, ou seja
        // B[i] = A[i] * i;

        ArrayList<Integer> vetorA = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            vetorA.add(i);
        }

        System.out.println();
        System.out.println("Vetor A: " + vetorA);

        ArrayList<Integer> vetorB = new ArrayList<>();

        for (int i=0; i < vetorA.size(); i++ ){
            int resultado = vetorA.get(i) * i;

           vetorB.add(resultado);

           System.out.println(vetorA.get(i) + " * " + i + " = " + vetorA.get(i) * i);
        }

        System.out.println();
        System.out.println("Vetor B: " + vetorB);
    }
}
