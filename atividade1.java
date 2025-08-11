import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");

        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");

        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");

        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A media foi : " + media);

        if(media >= 7) {
            System.out.print("Aprovado");
        } else if(media < 7 && media >= 4) {
            System.out.print("Recuperação");
        } else {
            System.out.print("Reprovado");
        }
        
        scanner.close();
    }
}
