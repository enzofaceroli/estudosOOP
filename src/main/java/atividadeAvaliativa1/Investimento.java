package atividadeAvaliativa1;

public class Investimento extends CarteiraInvestimento{
    public Investimento() { }

    public Investimento(String numeroCarteira, float saldo) {
        super(numeroCarteira, saldo);
    }

    public void investir(float valorInvestido){
        if (valorInvestido <= 0.0f){
            throw new IllegalArgumentException("Valor invalido de investimento");
        }
        this.setSaldo(this.getSaldo() + valorInvestido);
    }

    public void resgatar(float valorResgatado){
        if(valorResgatado <= 0.0f){
            throw new IllegalArgumentException("Valor invalido de resgate");
        }
        float taxaResgate = valorResgatado / 100.0f;
        float valorTotalResgate = valorResgatado + taxaResgate;

        this.setSaldo(this.getSaldo() - valorTotalResgate);
    }
}
