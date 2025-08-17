package exercicio34_Lanchonete;

import java.time.LocalDate;

public class Lanche extends Prato{
    private String pao;
    private String recheio;
    private String molho;

    public Lanche(Double preco, LocalDate dataDeValidade, Double peso, String pao, String recheio, String molho) {
        super(preco, dataDeValidade, peso);
        this.pao = pao;
        this.recheio = recheio;
        this.molho = molho;
        calcularPreco();
    }

    public void calcularPreco() {
        this.preco = this.peso * this.preco;
    }
}
