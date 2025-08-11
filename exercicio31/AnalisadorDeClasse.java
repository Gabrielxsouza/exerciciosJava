package exercicio31;



public class AnalisadorDeClasse {
    
    public static void inspecionar(Object obj) {
        String nomeClasse = obj.getClass().getSimpleName();
        System.out.println("Nome da classe: " + nomeClasse);
 
        System.out.print("Atributos: ");
        for(int i = 0; i < obj.getClass().getDeclaredFields().length; i++) {

            System.out.print(obj.getClass().getDeclaredFields()[i].getName() + ", ");
        }

        System.out.print("\nMetodos: ");

        for(int i = 0; i < obj.getClass().getDeclaredMethods().length; i++) {
            System.out.print(obj.getClass().getDeclaredMethods()[i].getName() + ", ");
        }

        
        
        
    }
}
