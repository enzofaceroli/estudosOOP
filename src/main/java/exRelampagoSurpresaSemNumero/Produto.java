package exRelampagoSurpresaSemNumero;

import java.util.ArrayList;

public class Produto {
    private String nome;
    private int qtdEstoque;
    private float precoUnit;
    private int estoqueMinimo;
    private int estoqueMaximo;
    private ArrayList<String> historico;

    public Produto(String nome, int qtdEstoque, float precoUnit, int estoqueMinimo, int estoqueMaximo) {
        this.nome = nome;
        this.setQtdEstoque(qtdEstoque);
        this.setPrecoUnit(precoUnit);
        this.setEstoqueMinimo(estoqueMinimo);
        this.setEstoqueMaximo(estoqueMaximo);
        this.historico = new ArrayList<String>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        if (qtdEstoque < 0) {
            throw new IllegalArgumentException("Quantidade invalida");
        } else {
            this.qtdEstoque = qtdEstoque;
        }
    }

    public float getPrecoUnit() {
        return precoUnit;
    }

    public void setPrecoUnit(float precoUnit) {
        if (precoUnit < 0){
            throw new IllegalArgumentException("Preco invalido");
        } else {
            this.precoUnit = precoUnit;
        }
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(int estoqueMinimo) {
        if (estoqueMinimo < 0 || estoqueMinimo > estoqueMaximo){
            throw new IllegalArgumentException("Estoque min invalido");
        } else {
            this.estoqueMinimo = estoqueMinimo;
        }
    }

    public int getEstoqueMaximo() {
        return estoqueMaximo;
    }

    public void setEstoqueMaximo(int estoqueMaximo) {
        if (estoqueMaximo < 0 || estoqueMaximo < estoqueMinimo){
            throw new IllegalArgumentException("Estoque max invalido");
        } else {
            this.estoqueMaximo = estoqueMaximo;
        }
    }

    public void debitarEstoque(int quantidade) {
        int qtdRestante = this.getQtdEstoque() - quantidade;
        if (this.verificarEstoqueInsuficiente(quantidade) || quantidade < 0) {
            throw new IllegalArgumentException("Quantidade debitada invalida");
        } else {
            this.setQtdEstoque(qtdRestante);
        }
    }

    public void creditarEstoque(int quantidade) {
        if (this.verificarEstoqueExcedente(quantidade) || quantidade < 0){
            throw new IllegalArgumentException("Quantidade creditada invalida");
        } else {
            this.setQtdEstoque(this.getQtdEstoque() + quantidade);
        }
    }

    public boolean verificarEstoqueBaixo() {
        if (this.qtdEstoque < this.estoqueMinimo) {
            return true;
        }
        return false;
    }

    public boolean verificarEstoqueInsuficiente(int quantidade) {
        if (quantidade > this.qtdEstoque) {
            return true;
        }
        return false;
    }

    public boolean verificarEstoqueExcedente(int quantidade) {
        if (quantidade + this.getQtdEstoque() > this.estoqueMaximo){
            return true;
        }
        return false;
    }

    public float calcularValorVenda(int quantidade) {
        return this.precoUnit * quantidade;
    }

    public void registrarHistorico(String dadosTransacao) {
        this.historico.add(dadosTransacao);
    }

    public ArrayList<String> exibirHistorico() {
        return this.historico;
    }
}
