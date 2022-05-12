package numeros;

import java.util.List;

public class ManipularArrayNumeros {

   public static int buscarPosicaoNumero(List<Integer> numeros, int numero) {

       return numeros.indexOf(numero);
   }

   public static void adicionarNumero(List<Integer> numeros, int numero) {

      int exists = buscarPosicaoNumero(numeros, numero);

      if (exists == -1) {
         numeros.add(numero);
      } else {
          throw new IllegalArgumentException("Numero jah contido na lista");
      }
   }

   public static void removerNumero(List<Integer> numeros, int numero){

       int exists = buscarPosicaoNumero(numeros, numero);

       if (exists != -1) {
           numeros.remove(exists);
       } else {
           throw new IllegalArgumentException("Numero nao encontrado na lista");
       }
   }

   public static void substituirNumero(List<Integer> numeros, int numeroSubstituir, int numeroSubstituto){

       int exists = buscarPosicaoNumero(numeros, numeroSubstituir);

       if (exists != -1) {
           numeros.set(exists, numeroSubstituto);
       } else {
           numeros.add(numeroSubstituto);
       }
   }

}