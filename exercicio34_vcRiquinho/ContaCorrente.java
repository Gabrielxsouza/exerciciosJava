package exercicio34_vcRiquinho;

public class ContaCorrente  extends Conta{
    ContaCorrente(Double saldo) {
        super(saldo);
    }

    @Override
    public String toString() {
        return "Conta Corrente | Saldo: R$ " + String.format("%.2f", this.getSaldo());
    }
}
