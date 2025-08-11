package exercicio22;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Double> notas = new TreeMap<>();

        notas.put("Joao", 8.9);
        notas.put("Maria", 9.2);
        notas.put("Ana", 9.1);
        notas.put("Pedro", 7.8);
        notas.put("Paulo", 6.9);

        for (String aluno : notas.keySet()) {
            System.out.println(aluno + ": " + notas.get(aluno));
        }
    }
}
