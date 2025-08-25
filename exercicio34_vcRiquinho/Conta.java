package exercicio34_vcRiquinho;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta {
    protected Double saldo;
    protected List<Produto> produtos = new ArrayList<>();

    public Conta(Double saldo) {
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return this.saldo;
    }

    @Override
    public abstract String toString();
}
