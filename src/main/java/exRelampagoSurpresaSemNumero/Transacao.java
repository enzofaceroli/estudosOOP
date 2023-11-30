package exRelampagoSurpresaSemNumero;

public class Transacao {
    private String dataTransacao;
    private int qtde;
    private Produto produto;

    public Transacao(String dataTransacao, int qtde, Produto produto) {
        this.dataTransacao = dataTransacao;
        this.setQtde(qtde);
        this.setProduto(produto);
    }

    public String getDataTransacao() {
        return dataTransacao;
    }

    public void setDataTransacao(String dataTransacao) {
        this.dataTransacao = dataTransacao;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        if (qtde < 0) {
            throw new IllegalArgumentException("Quantidade invalida");
        } else {
            this.qtde = qtde;
        }
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        if (produto == null) {
            throw new IllegalArgumentException("Produto invalido");
        } else {
            this.produto = produto;
        }
    }
}
