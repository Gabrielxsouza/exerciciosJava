package exercicio14;


import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashSet<String> emails = new HashSet<>();

        Scanner leitor = new Scanner(System.in);

        while(true){
        System.out.println("Adicione um email");
        String email = leitor.nextLine();

        emails.add(email);
        System.out.println("Email adicionado: " + email);
        System.out.println("O tamanho da lista agora e: " + emails.size());

        System.out.println("Deseja adicionar mais emails? (S/N)");
        String resposta = leitor.nextLine();

        if(resposta.equalsIgnoreCase("N")){
            leitor.close();
            break;
        }

        
        }
        System.out.println("Lista de emails: " + emails);
    }
}
