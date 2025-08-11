package exercicio17;

public class Produto implements Comparable<Produto>{
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Produto produto) {
        return Double.compare(this.preco, produto.getPreco());
    }

    @Override
    public String toString() {
        return 
                "\n" + "nome do produto = " + nome +
                " - preco = " + preco;
    }
}
