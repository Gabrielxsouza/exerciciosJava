package exercicio28;

import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deque<String> frase = new ArrayDeque<>();

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String palavra = leitor.nextLine();

        String[] palavras = palavra.split(" ");

        for (String p : palavras) {
            frase.add(p);
        }

        System.out.println("Frase invertida: ");
        while(!frase.isEmpty()) {
            System.out.print(frase.removeLast() + " ");
        }
        
        leitor.close();
    }
}
