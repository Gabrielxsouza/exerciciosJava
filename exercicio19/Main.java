package exercicio19;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> texto = new HashMap<>();

        String paragrafo = "Crie uma String contendo um parágrafo de texto Crie";

        String[] palavras = paragrafo.split(" ");

        for (String palavra : palavras) {
            if (texto.containsKey(palavra)) {
                texto.put(palavra, texto.get(palavra) + 1);
            } else {
                texto.put(palavra, 1);
            }
        }

        System.out.println(texto);
    }
}
