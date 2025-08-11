package exercicio6;

public class Circulo {
    private double raio;

    public Circulo() {
        
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        if(raio <= 0){
            throw new IllegalArgumentException("O raio deve ser maior que zero.");
        }
        this.raio = raio;
    }

    public double calcularArea() {
        return 3.14 * raio * raio;
    }
}
