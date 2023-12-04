package exRS934;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GrupoTest {
    Pais pais;
    Grupo grupo;

    @BeforeEach
    void setUp() {
        pais = new Pais("BR");
        grupo = new Grupo(pais);
    }

    @Test
    void deveRetornarNomePaisValidoBR() {
        assertEquals("BR", grupo.getSede().getNome());
    }

    @Test
    void deveRetornarPaisInvalido() {
        try {
            grupo.setSede(null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Pais invalido", e.getMessage());
        }
    }

    @Test
    void deveRetornarGrupoSemPresidente() {
        grupo.setPresidente(null);
        assertEquals("Grupo sem presidente", grupo.getEscolaridadePresidente());
    }

    @Test
    void deveRetornarEscolaridadePresidenteDoutor() {
        Funcionario funcionario = new Funcionario("Marco");
        Escolaridade escolaridade = new Escolaridade("Doutor");
        funcionario.setEscolaridade(escolaridade);
        grupo.setPresidente(funcionario);

        assertEquals("Doutor", grupo.getEscolaridadePresidente());
    }
}