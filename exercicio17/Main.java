package exercicio17;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet <Produto> produtos = new TreeSet<>();

        produtos.add(new Produto("Coca-Cola", 2.50));
        produtos.add(new Produto("Batata", 3.50));
        produtos.add(new Produto("Arroz", 5.50));
        produtos.add(new Produto("Feijao", 4.50));
        produtos.add(new Produto("Macarrao", 3.50));

        System.out.println("Produtos: \n" + produtos.toString());
    }
}
