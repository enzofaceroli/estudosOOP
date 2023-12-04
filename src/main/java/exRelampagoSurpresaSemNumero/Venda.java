package exRelampagoSurpresaSemNumero;

public class Venda extends Transacao {
    private Cliente cliente;
    private int qtdeVendida;

    public Venda(String dataTransacao, int qtde, Produto produto, Cliente cliente, int qtdeVendida) {
        super(dataTransacao, qtde, produto);
        this.cliente = cliente;
        this.qtdeVendida = qtdeVendida;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getQtdeVendida() {
        return qtdeVendida;
    }

    public void setQtdeVendida(int qtdeVendida) {
        this.qtdeVendida = qtdeVendida;
    }

    public void vender (Produto produto) {
        if (produto.verificarEstoqueInsuficiente(qtdeVendida)) {
            throw new IllegalArgumentException("Quantidade insuficiente");
        } else {
            produto.debitarEstoque(this.getQtdeVendida());
            String registroVenda = new String();
            registroVenda.concat(this.getDataTransacao() + this.cliente.getNome() + this.getProduto().calcularValorVenda(qtdeVendida));
            produto.registrarHistorico(registroVenda);
        }
    }
}
