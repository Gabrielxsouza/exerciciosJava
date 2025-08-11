package exercicio18;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> palavras = new HashMap<>();

        Scanner leitor = new Scanner(System.in);

        palavras.put("um", "one");
        palavras.put("dois", "two");
        palavras.put("tres", "three");
        palavras.put("quatro", "four");
        palavras.put("cinco", "five");

        System.out.println("Digite uma palavra: ");
        String palavra = leitor.nextLine();

        System.out.println("Traduzindo para ingles: " + palavras.get(palavra));

        leitor.close();
    }
}
