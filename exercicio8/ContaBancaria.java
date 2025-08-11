package exercicio8;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        try {
            if (valor > saldo) {
                throw new saldoInsuficienteException("Saldo insuficiente para saque.");
            }
            saldo -= valor;
        } catch (saldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}
