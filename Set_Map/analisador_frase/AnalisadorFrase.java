import java.util.TreeMap;

public class AnalisadorFrase {
    public static TreeMap<String, Integer> contagemPalavras(String frase) {
        TreeMap<String, Integer> map = new TreeMap<>();

        frase = frase.replace("?", "");
        frase = frase.replace("!", "");
        frase = frase.replace(".", "");

        String[] palavras = frase.split(" ");

        int contador = 0;

        for (String s : palavras) {
            for (String palavra : palavras) {
                if (s.equalsIgnoreCase(palavra)) {
                    contador++;
                }
            }

            map.put(s.toLowerCase(), contador);
            contador = 0;
        }

        return map;
    }
}
