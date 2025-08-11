package exercicio33;

import java.lang.reflect.Method;

public class Main {
    public static void executarTestes(Object obj) {
        Class<?> classe = obj.getClass();
        Method[] metodos = classe.getDeclaredMethods();

        for (Method m : metodos) {
            if (m.isAnnotationPresent(Teste.class)) {
                try {
                    m.invoke(obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        MinhaClasseDeTeste obj = new MinhaClasseDeTeste();
        executarTestes(obj);
    }
    
}
