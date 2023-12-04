package exRS934;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscolaridadeTest {
    Escolaridade escolaridade;

    @BeforeEach
    void setUp() {
        escolaridade = new Escolaridade("Ensino medio");
    }

    @Test
    void deveRetornarDescricaoEnsinoMedio() {
        assertEquals("Ensino medio", escolaridade.getDescricao());
    }
}