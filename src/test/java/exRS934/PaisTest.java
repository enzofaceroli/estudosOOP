package exRS934;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaisTest {
    Pais pais;

    @BeforeEach
    void setUp() {
        pais = new Pais ("BR");
    }

    @Test
    void deveRetornarNomePaisBR() {
        assertEquals("BR", pais.getNome());
    }

    @Test
    void deveRetornarNomeInvalido() {
        try {
            pais.setNome(null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome invalido", e.getMessage());
        }
    }
}