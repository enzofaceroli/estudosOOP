package atividadeAvaliativa1;

public abstract class CarteiraInvestimento {
    //Escolha de tipo String pois nao ha necessidade de fazer operacao com numeroCarteira
    private String numeroCarteira;
    private float saldo;

    public CarteiraInvestimento(){ }

    public CarteiraInvestimento(String numeroCarteira, float saldo) {
        this.numeroCarteira = numeroCarteira;
        this.saldo = saldo;
    }

    public String getNumeroCarteira() {
        return numeroCarteira;
    }

    public void setNumeroCarteira(String numeroCarteira) {
        this.numeroCarteira = numeroCarteira;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        if(saldo < 0.0f){
            throw new IllegalArgumentException("Valor invalido de saldo");
        }
        this.saldo = saldo;
    }

    public abstract void investir(float valorInvestimento);
    public abstract void resgatar(float valorResgatado);
}
