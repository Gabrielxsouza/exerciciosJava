package exercicio34_vcRiquinho;

import java.util.List;

public class PessoaJuridica extends Cliente {
    private String cnpj;
    
    public PessoaJuridica(String nome, String email, String cnpj, List<Conta> contas) {
        super(nome, email, contas);
        this.cnpj = cnpj;
    }

    
    
    
}
