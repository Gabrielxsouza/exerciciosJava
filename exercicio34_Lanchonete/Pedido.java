package exercicio34_Lanchonete;

import java.util.ArrayList;

public class Pedido {
    private String nomeCLiente;
    private Double taxaServico;
    private ArrayList<Prato> pratos = new ArrayList<Prato>();

    public Pedido(String nomeCLiente, Double taxaServico, ArrayList<Prato> pratos) {
        this.nomeCLiente = nomeCLiente;
        this.taxaServico = taxaServico;
        this.pratos = pratos;
    }
    
    public void calcularTotal(){
        Double total = 0.0;
        for(int i = 0; i < pratos.size(); i++) {
            total += pratos.get(i).getPreco();
        }
        System.out.printf("Taxa de servico: R$ %.2f%n" , (taxaServico/100) * total);
        total += (taxaServico/100) * total;
        
        System.out.printf("Total: R$ %.2f%n" , total);
    }

    public void calcularFatura(){
        for(int i = 0; i < pratos.size(); i++) {
            System.out.printf("%s - R$ %.2f%n", pratos.get(i).getClass().getSimpleName(), pratos.get(i).getPreco());
        }
        calcularTotal();
    }
}
