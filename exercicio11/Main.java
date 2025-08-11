package exercicio11;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> fila = new LinkedList<>();
        fila.add("Joao");
        fila.add("Maria");
        fila.add("Pedro");
        fila.add("Ana");
        fila.add("Carlos");

        System.out.println("Fila original: " + fila);

        System.out.println("Atendendo o primeiro cliente: " + fila.removeFirst());
        System.out.println("Atendendo o primeiro cliente: " + fila.removeFirst());

        System.out.println("Adicionando Marcos com prioridade: ");
        fila.addFirst("Marcos");
        System.out.println("Adicionando Paula com prioridade: ");
        fila.addFirst("Paula");
       
        System.out.println("Fila atualizada: " + fila);
    }

}
