package exercicio13;


import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        
        List<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(2);
        numeros.add(3);
        numeros.add(3);

        System.out.println("Lita com numeros repetidos: " + numeros);

        HashSet<Integer> numerosUnicos = new HashSet<>(numeros);
        System.out.println("Lista sem numeros repetidos: " + numerosUnicos);
    }
}
