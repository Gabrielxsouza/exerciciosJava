package exercicio7;

public class Carro extends Veiculo{
    private Integer numeroDePortas;

    public Carro(String marca, String modelo, Integer numeroDePortas) {
        super(marca, modelo);
        this.numeroDePortas = numeroDePortas;
    }

    public Integer getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(Integer numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

   @Override
    public String toString() {
        return super.toString() + "\nNumero de portas: " + numeroDePortas;
    }
}
