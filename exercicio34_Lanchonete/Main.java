package exercicio34_Lanchonete;

import java.time.LocalDate;
import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {
        ArrayList<Prato> pratos = new ArrayList<Prato>();
        pratos.add(new Salgadinho(120.00, LocalDate.now(), 0.2, "catupiry", "normal", "assado"));
        pratos.add(new Pizza(30.00, LocalDate.now(), 2.00, "molho de tomate" , "Mussarela", "sem borda"));
        pratos.add(new Salgadinho(120.00, LocalDate.now(), 0.2, "catupiry", "normal", "frito"));
        pratos.add(new Pizza(30.00, LocalDate.now(), 2.00, "molho de tomate" , "Mussarela", "Borda de catupiry"));


        Pedido pedido = new Pedido("Joao", 10.00, pratos);

        pedido.calcularFatura();    
    }
}
