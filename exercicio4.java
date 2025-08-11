import java.util.Arrays;
import java.util.List;
public class exercicio4 {
    public static void main(String[] args) {
        List<Integer> array =  Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int soma = 0;

        for(int i: array) {
            if(i % 2 == 1) {
                soma += i;
            }
        }
        System.out.println("A soma dos nuumeros impares e: " + soma);
    }

}
