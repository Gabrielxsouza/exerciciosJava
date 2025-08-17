package exercicio34_Lanchonete;

import java.time.LocalDate;

public class Pizza extends Prato{
    private String molho;
    private String recheio;
    private String borda;

    public Pizza(Double preco, LocalDate dataDeValidade, Double peso, String molho, String recheio, String borda) {
        super(preco, dataDeValidade, peso);
        this.molho = molho;
        this.recheio = recheio;
        this.borda = borda;
        calcularPreco();
    }

    public void calcularPreco() {
        this.preco = this.peso * this.preco;
        if(!this.borda.equals("sem borda")){
            this.preco += 4;
        } 
    }
}
