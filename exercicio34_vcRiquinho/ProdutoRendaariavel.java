package exercicio34_vcRiquinho;

public class ProdutoRendaariavel extends Produto{
    private Double rendimentoMensalEsperado;
    
    public ProdutoRendaariavel(String nome, String descricao, Double rendimentoMensalEsperado) {
        super(nome, descricao);
        this.rendimentoMensalEsperado = rendimentoMensalEsperado;
    }
}
