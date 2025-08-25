package exercicio34_vcRiquinho;

public class ContaCdi extends Conta {
    private Double rendimentoDiario;
    private Double taxaDeServico;

    public ContaCdi(Double saldo, Double rendimentoDiario) {
        super(saldo);
        this.rendimentoDiario = rendimentoDiario;
        this.taxaDeServico = rendimentoDiario * 0.0007;
    }

    @Override
    public String toString() {
        return "Conta CDI | Saldo: R$ " + String.format("%.2f", this.getSaldo());
    }

}
