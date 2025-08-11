package exercicio7;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Honda", "Civic", 4);
        System.out.println(carro.toString());

        System.out.println("\n");
        Moto moto = new Moto("Honda", "CG", 150);
        System.out.println(moto.toString());
    }
}
