package exercicio27;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Joao");
        nomes.add("Maria");
        nomes.add("Pedro");
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Joao");
        nomes.add("Maria");

        HashSet<String> nomesUnicos = new HashSet<>(nomes);

        for (int i = 0; i < 3; i++) {
            int sorteado = (int) (Math.random() * nomesUnicos.size());

            System.out.println("Nome sorteado: " + nomesUnicos.toArray()[sorteado]);

            nomesUnicos.remove(nomesUnicos.toArray()[sorteado]);
        }
    }

    
}
