package exercicio34_vcRiquinho;

public class ProdutoRendaFixa extends Produto {
    private Double rendimentoMensalFixo;
    private Integer periodoDeCarencia;

    public ProdutoRendaFixa(String nome, String descricao, Double rendimentoMensalFixo, Integer periodoDeCarencia) {
        super(nome, descricao);
        this.rendimentoMensalFixo = rendimentoMensalFixo;
        this.periodoDeCarencia = periodoDeCarencia;
    }
}
