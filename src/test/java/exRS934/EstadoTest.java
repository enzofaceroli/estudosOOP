package exRS934;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstadoTest {
    Pais pais;
    Estado estado;

    @BeforeEach
    void setUp() {
        pais = new Pais("BR");
        estado = new Estado("MG", pais);
    }

    @Test
    void deveRetornarNomeMG() {
        assertEquals("MG", estado.getNome());
    }

    @Test
    void deveRetornarNomeInvalido() {
        try {
            estado.setNome(null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome invalido", e.getMessage());
        }
    }

    @Test
    void deveRetornarNomePaisBR() {
        assertEquals("BR", estado.getPais().getNome());
    }

    @Test
    void deveRetornarPaisInvalido() {
        try {
            estado.setPais(null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Pais invalido", e.getMessage());
        }
    }
}