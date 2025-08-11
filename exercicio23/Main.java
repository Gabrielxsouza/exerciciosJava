package exercicio23;

import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        HashMap<String, String> agenda = new HashMap<>();

        while(true) {

        System.out.println("Digite o nome do contato:");
        String nome = leitor.nextLine();
        System.out.println("Digite o telefone do contato:");
        String telefone = leitor.nextLine();
        if(agenda.containsKey(nome) || agenda.containsValue(telefone)) {
            System.out.println("Contato ja cadastrado!");
            leitor.close();
            break;
        }else
            agenda.put(nome, telefone);
            System.out.println("Contato adicionado com sucesso!");
        }

    }
    
}

