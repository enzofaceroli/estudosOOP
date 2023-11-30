package exRelampagoSurpresaSemNumero;

public class Compra extends Transacao{
    private float precoUnit;
    private Fornecedor fornecedor;
    private int qtdeCompra;

    public Compra(String dataTransacao, int qtde, Produto produto, float precoUnit, Fornecedor fornecedor, int qtdeCompra) {
        super(dataTransacao, qtde, produto);
        this.precoUnit = precoUnit;
        this.fornecedor = fornecedor;
        this.qtdeCompra = qtdeCompra;
    }

    public float getPrecoUnit() {
        return precoUnit;
    }

    public void setPrecoUnit(float precoUnit) {
        if (precoUnit <= 0) {
            throw new IllegalArgumentException("Preco invalido");
        } else {
            this.precoUnit = precoUnit;
        }
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        if (fornecedor == null) {
            throw new IllegalArgumentException("Fornecedor invalido");
        } else {
            this.fornecedor = fornecedor;
        }
    }

    public int getQtdeCompra() {
        return qtdeCompra;
    }

    public void setQtdeCompra(int qtdeCompra) {
        if (qtdeCompra <= 0) {
            throw new IllegalArgumentException("Quantidade invalida");
        } else {
            this.qtdeCompra = qtdeCompra;
        }
    }

    public void comprar(Produto produto, int qtde) {
        if (produto.verificarEstoqueExcedente(qtde)){
            throw new IllegalArgumentException("Estoque excedente");
        } else {
            produto.creditarEstoque(qtde);
            String registroCompra = new String();
            registroCompra.concat(this.getDataTransacao() + this.getFornecedor().getNome() + this.getProduto().calcularValorVenda(qtde));
            produto.registrarHistorico(registroCompra);
        }
    }



}
