package exercicio34_vcRiquinho;

import java.util.List;

public class PessoaFisica extends Cliente{
    private String cpf;

    public PessoaFisica(String nome, String email, String cpf, List<Conta> contas) {
        super(nome, email, contas);
        this.cpf = cpf;
    }


}
