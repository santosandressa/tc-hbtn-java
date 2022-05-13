import java.util.ArrayList;

public class Ex1 {
    public static void main(String[] args) {

        // Crie um vetor A com 5 elementos inteiros.
        // Crie um vetor B com o mesmo tipo e tamanho e com os mesmos elementos do vetor A.

        ArrayList<Integer> elementos = new ArrayList<>();
        elementos.add(1);
        elementos.add(2);
        elementos.add(3);
        elementos.add(4);
        elementos.add(5);

        System.out.println("Vetor A");
        System.out.println(elementos);

        ArrayList<Integer> elementosB = new ArrayList<>();

        elementosB.addAll(elementos);

        System.out.println();
        System.out.println("Vetor B");
        System.out.println(elementosB);
    }
}
