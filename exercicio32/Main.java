package exercicio32;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws Exception {
        Configuracao configuracao = new Configuracao();

        Field field = Configuracao.class.getDeclaredField("urlConexao");
        field.setAccessible(true);
        field.set(configuracao, "db.producao.com:5432");

        System.out.println(field.get(configuracao));
    }
}
