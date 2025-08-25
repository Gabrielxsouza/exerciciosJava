package exercicio34_vcRiquinho;

import java.util.List;

public abstract class Cliente {
    private String nome;
    private String email;
    private List<Conta> contas;

    public Cliente(String nome, String email, List<Conta> contas) {
        this.nome = nome;
        this.email = email;
        this.contas = contas;
    }

    public String getNome() {
        return nome;
    }

    public List<Conta> getContas() {
        return this.contas;
    }

     

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }
}
