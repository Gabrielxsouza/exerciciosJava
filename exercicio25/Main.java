package exercicio25;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();

        livros.push("O Senhor dos Aneis");
        livros.push("O Hobbit");
        livros.push("O Pequeno Principe");

        System.out.println(livros.pop());

        System.out.println("\n\n" + livros.peek());

    }
}
