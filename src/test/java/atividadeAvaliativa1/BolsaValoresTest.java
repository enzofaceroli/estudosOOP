package atividadeAvaliativa1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BolsaValoresTest {
    BolsaValores bolsaValores;
    @BeforeEach
    void setUp(){
        bolsaValores = new BolsaValores("123", 0.0f);
    }

    @Test
    public void deveInvestir50ReaisSaldo0(){
        bolsaValores.investir(50.0f);
        assertEquals(0.0f, bolsaValores.getSaldo());
    }

    @Test
    public void deveResgatar50ReaisSaldo0(){
        bolsaValores.setSaldo(50.0f);
        bolsaValores.resgatar(50.0f);
        assertEquals(0.0f, bolsaValores.getSaldo());
    }

    @Test
    public void deveRetornarValorInvalidoNegativoInvestido(){
        try {
            bolsaValores.investir(-1.0f);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Valor invalido de investimento", e.getMessage());
        }
    }

    @Test
    public void deveRetornarValorInvalidoSaldoInsuficienteInvestir(){
        try {
            bolsaValores.investir(49.99f);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Valor insuficiente para cobrir a taxa", e.getMessage());
        }
    }

    @Test
    public void deveRetornarValorInvalidoResgate(){
        try {
            bolsaValores.resgatar(-1.0f);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Valor invalido de resgate", e.getMessage());
        }
    }
    @Test
    public void deveRetornarSaldoInsuficienteResgatar(){
        try {
            bolsaValores.resgatar(1.0f);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Saldo insuficiente", e.getMessage());
        }
    }

}