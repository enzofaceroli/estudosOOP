package exRS934;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CidadeTest {
    Pais pais;
    Estado estado;
    Cidade cidade;

    @BeforeEach
    void setUp() {
        pais = new Pais("BR");
        estado = new Estado("MG", pais);
        cidade = new Cidade ("JF", estado);
    }

    @Test
    void deveRetornarNomeJF() {
        assertEquals("JF", cidade.getNome());
    }

    @Test
    void deveRetornarNomeInvalido() {
        try {
            cidade.setNome(null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome invalido", e.getMessage());
        }
    }

    @Test
    void deveRetornarNomeEstadoMGValido() {
        assertEquals("MG", cidade.getEstado().getNome());
    }

    @Test
    void deveRetornarEstadoInvalido() {
        try {
            cidade.setEstado(null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Estado invalido", e.getMessage());
        }
    }

}