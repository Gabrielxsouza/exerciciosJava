package exercicio20;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> agenda = new HashMap<>();

        Scanner leitor = new Scanner(System.in);

        while (true) {
            System.out.println("Digite uma opcao:");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Listar contatos");
            System.out.println("3 - Buscar contato");
            System.out.println("4 - Sair");

            int opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do contato:");
                    String nome = leitor.next();
                    System.out.println("Digite o telefone do contato:");
                    String telefone = leitor.next();
                    agenda.put(nome, telefone);
                    System.out.println("Contato adicionado com sucesso!");
                    break;
                case 2:
                    System.out.println("\n\nContatos:");
                    for (String contato : agenda.keySet()) {
                        System.out.println(contato + ": " + agenda.get(contato));
                    }
                    System.out.println("\n\n");
                    break;
                case 3:
                    System.out.println("Digite o nome para buscar o contato:");
                    String buscarContato = leitor.next();
                    if (agenda.containsKey(buscarContato)) {
                        System.out.println("Contato encontrado: " + agenda.get(buscarContato));
                        System.out.println("\n");
                    } else {
                        System.out.println("Contato nao encontrado!\n");
                    }
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    leitor.close();
                    return;
                default:
                    System.out.println("Opcao invalida!");
            }
        }
    }
}
