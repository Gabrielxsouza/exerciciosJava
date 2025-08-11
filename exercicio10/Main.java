package exercicio10;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        List<Integer> aleatorio = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            aleatorio.add((int) (Math.random() * 100));
        }

        System.out.println("Desordenado: " + aleatorio);
        Collections.sort(aleatorio);
        System.out.println("Ordenado: " + aleatorio);
    }



}
