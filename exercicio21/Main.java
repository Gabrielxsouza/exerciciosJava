package exercicio21;

import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> produtos = new LinkedHashMap<>();

        produtos.put(3, "Arroz");
        produtos.put(1, "Coca-Cola");
        produtos.put(2, "Batata");
        produtos.put(5, "Macarrao");
        produtos.put(4, "Feijao");
        

        for(String produto : produtos.values()) {
            System.out.println(produto);
        }
    }
}
