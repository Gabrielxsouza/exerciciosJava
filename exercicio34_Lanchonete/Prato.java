package exercicio34_Lanchonete;

import java.time.LocalDate;

public abstract class Prato {
    protected Double preco;
    protected LocalDate dataDeValidade;
    protected Double peso;

    public Prato(Double preco, LocalDate dataDeValidade, Double peso) {
        this.preco = preco;
        this.dataDeValidade = dataDeValidade;
        this.peso = peso;
    }

    

    public abstract void calcularPreco();

    public Double getPreco() {
        return preco;
    }
}
