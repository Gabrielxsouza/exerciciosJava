package exercicio34_vcRiquinho;

public class ContaInvestimento extends  Conta {
    private Double taxaDeSercico;

    public ContaInvestimento(Double saldo, Double taxaDeSercico) {
        super(saldo);
        this.taxaDeSercico = taxaDeSercico;
    }

    @Override
    public String toString() {
        return "Conta Investimento | Saldo: R$ " + String.format("%.2f", this.getSaldo());
    }
}
