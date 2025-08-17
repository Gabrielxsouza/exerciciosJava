package exercicio34_Lanchonete;

import java.time.LocalDate;

public class Salgadinho extends Prato {
    private String recheio;
    private String massa;
    private String tipo;
    
    public Salgadinho(Double preco, LocalDate dataDeValidade, Double peso, String recheio, String massa, String tipo) {
        super(preco, dataDeValidade, peso);
        this.recheio = recheio;
        this.massa = massa;
        this.tipo = tipo;
        calcularPreco();
    }

    public void calcularPreco() {
        if(this.tipo.equals("assado")){
            this.preco = this.peso * (this.preco*1.1);
        }else{
            this.preco = this.peso * (this.preco*1.2);
        }
    }
}
