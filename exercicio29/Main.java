package exercicio29;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> historico = new LinkedList<>();

        Scanner leitor = new Scanner(System.in);

        historico.add("Pagina 1");
        historico.add("Pagina 2");
        historico.add("Pagina 3");
        historico.add("Pagina 4");
        historico.add("Pagina 5");

        while(true) {
            System.out.println("Escolha uma opcao: ");
            System.out.println("1 - Visitar uma nova pagina");
            System.out.println("2 - Voltar");
            System.out.println("3 - Avancar");
            System.out.println("4 - Sair do programa");

            int opcao = leitor.nextInt();

            switch(opcao) {
                case 1:
                    System.out.println("Digite o nome da pagina: ");
                    String pagina = leitor.next();
                    visitar(pagina);
                    break;
                case 2:
                    if (historico.size() > 1) {
                        historico.removeLast();
                    }
                    break;
                case 3:
                    if (historico.size() > 1) {
                        historico.removeFirst();
                    }
                    break;
                case 4:
                    leitor.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        }
        
    }

    public static void visitar(String pagina) {
        LinkedList<String> copia = new LinkedList<>(historico);
        copia.add(pagina);
        historico = copia;
    }
}
