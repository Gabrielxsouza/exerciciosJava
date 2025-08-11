package exercicio16;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<String> nomes = new TreeSet<>();

        nomes.add("Joao");
        nomes.add("Maria");
        nomes.add("Pedro");
        nomes.add("Ana");
        nomes.add("Carlos");

        for(String nome : nomes) {
            System.out.println("Nome: " + nome);
        }
    }
}
