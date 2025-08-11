package exercicio26;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Map<String, List<Produto>> produtos = new HashMap<>();
            
        List<Produto> prodEletronico = new ArrayList<>();
        prodEletronico.add(new Produto("Celular", 2500.50));
        prodEletronico.add(new Produto("Batedeira", 350.50));
        prodEletronico.add(new Produto("Micondas", 515.50));

        List<Produto> prodAlimento = new ArrayList<>();
        prodAlimento.add(new Produto("Feijao", 4.50));
        prodAlimento.add(new Produto("Macarrao", 3.50));

        produtos.put("Eletronico", prodEletronico);
        produtos.put("Alimento", prodAlimento);

        for(int i = 0; i < produtos.get("Eletronico").size(); i++) {
            System.out.println(produtos.get("Eletronico").get(i).getNome() + " - R$ " + produtos.get("Eletronico").get(i).getPreco());
        }

        

    }
}
