package atividadeAvaliativa1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarteiraInvestimentoTest {
    CarteiraInvestimento carteira;

    @BeforeEach
    void setUp(){
        carteira = new BolsaValores("123", 0.0f);
    }

    @Test
    public void deveRetoranarSaldo100(){
        assertEquals(0.0f, carteira.getSaldo());
    }

    @Test
    public void deveRetornarNumeroCarteira123(){
        assertEquals("123", carteira.getNumeroCarteira());
    }

    @Test
    public void deveRetornarValorInvalidoSaldo(){
        try {
            carteira.setSaldo(-1.0f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Valor invalido de saldo", e.getMessage());
        }
    }
}