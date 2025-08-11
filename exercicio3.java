//Adivinhe o Número: Gere um número aleatório entre 1 e 100. Peça ao usuário para adivinhar o número. Use um laço while para continuar pedindo um número até que o usuário acerte. A cada tentativa, dê uma dica se o palpite foi "muito alto" ou "muito baixo". No final, informe o número de tentativas.
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numero = (int) (Math.random() * 100) + 1;
        int tentativas = 0;
        int palpite = -1;
        System.out.println("numero: " + numero);
        System.out.print("Adivinhe o numero: ");
        while (palpite != numero) {
            
            palpite = leitor.nextInt();
            tentativas++;
            
            if (palpite < numero) {
                if(numero - palpite > 30) {
                    System.out.println("Muito baixo!");
                }else{
                    System.out.println("baixo");
                }
            } else if (palpite > numero) {
                if(palpite - numero > 30) {
                    System.out.println("Muito alto!");
                }else{
                    System.out.println("alto");
                }
            } 
        }
        System.out.println("Você acertou em " + tentativas + " tentativas.");
        leitor.close();   
    }
    
}
