package exercicio24;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();

        lista.add("Documento1.pdf");
        lista.add("Documento2.pdf");
        lista.add("Documento3.pdf");
        lista.add("Documento4.pdf");
        lista.add("Documento5.pdf");

        while(!lista.isEmpty())
            System.out.println("Imprimindo: " + lista.removeFirst());
        }
}

