package atividadeAvaliativa1;

public class BolsaValores extends CarteiraInvestimento{
    public BolsaValores() { }

    public BolsaValores(String numeroCarteira, float saldo) {
        super(numeroCarteira, saldo);
    }

    public void investir(float valorInvestimento){
        if(valorInvestimento <= 0.0f){
            throw new IllegalArgumentException("Valor invalido de investimento");
        }
        float taxaInvestimento = 50.00f;
        if(this.getSaldo() + valorInvestimento - taxaInvestimento < 0.0f){
            throw new IllegalArgumentException("Valor insuficiente para cobrir a taxa");
        }
        this.setSaldo(this.getSaldo() + valorInvestimento - taxaInvestimento);
    }

    public void resgatar(float valorResgatado){
        if (valorResgatado <= 0.0f){
            throw new IllegalArgumentException("Valor invalido de resgate");
        }
        if (valorResgatado > this.getSaldo()){
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        this.setSaldo(this.getSaldo() - valorResgatado);
    }
}
