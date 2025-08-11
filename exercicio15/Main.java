package exercicio15;

import java.util.LinkedHashSet;

import java.util.Arrays;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<String> diasBaguncados = new LinkedHashSet<>(Arrays.asList("Quarta", "Segunda", "Quinta", "Sexta", "Domingo", "Sabado", "Terca"));

        Set<String> semana = new LinkedHashSet<>(diasBaguncados);

        System.out.println(semana);
    }
}
