package exercicio12;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<String> cidades = new ArrayList<>();
        
        
        cidades.add("Sao Paulo");
        cidades.add("Rio de Janeiro");
        cidades.add("Porto Alegre");
        cidades.add("Curitiba");
        cidades.add("Belo Horizonte");
        cidades.add("Manaus");
        cidades.add("Salvador");

        System.out.println("Digite uma cidade para ver se esta na lista: ");
        String minhaCidade = leitor.nextLine();

        

        if (cidades.contains(minhaCidade)) {
            System.out.println("Cidade encontrada na lista: " + minhaCidade);
            int posicao = cidades.indexOf(minhaCidade);
            System.out.println("Posicao da cidade na lista: " + posicao);
        } else {
            System.out.println("Cidade nao encontrada na lista: " + minhaCidade);
        }

        leitor.close();
    }

}
