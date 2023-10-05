package atividadeAvaliativa1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvestimentoTest {
    Investimento investimento;

    @BeforeEach
    void setUp(){
        investimento = new Investimento("123", 0.0f);
    }

    @Test
    public void deveInvestir50ReaisSaldo50(){
        investimento.investir(50.0f);
        assertEquals(50.0f, investimento.getSaldo());
    }

    @Test
    public void deveResgatar100ReaisSaldo0(){
        investimento.setSaldo(101.0f);
        investimento.resgatar(100.0f);
        assertEquals(0.0f, investimento.getSaldo());
    }

    @Test
    public void deveRetornarInvestimentoInvalido(){
        try {
            investimento.investir(-1.0f);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Valor invalido de investimento", e.getMessage());
        }
    }

    @Test
    public void deveRetornarValorInvalidoResgate(){
        try {
            investimento.resgatar(-1.0f);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Valor invalido de resgate", e.getMessage());
        }
    }

    @Test
    public void deveRetornarSaldoInsuficienteResgate(){
        try {
            investimento.resgatar(1.0f);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Valor invalido de saldo", e.getMessage());
        }
    }
}