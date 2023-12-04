package exRS934;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {
    Pais pais;
    Grupo grupo;
    Empresa empresa;

    @BeforeEach
    void setUp() {
        pais = new Pais("BR");
        grupo = new Grupo(pais);
        empresa = new Empresa(grupo);
    }

    @Test
    void deveRetornarNomePaisGrupoValido() {
        //testa validade do grupo (=/ nulo), funcao getGrupo, funcao getPaisGrupo e funcao getNomePaisGrupo
        assertEquals("BR", empresa.getNomePaisGrupo());
    }

    @Test
    void deveRetornarGrupoInvalido() {
        try {
            empresa.setGrupo(null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Grupo invalido", e.getMessage());
        }
    }

    @Test
    void deveRetornarNomeDiretorMarco() {
        Funcionario funcionario = new Funcionario("Marco");
        empresa.setDiretor(funcionario);
        assertEquals("Marco", empresa.getDiretor().getNome());
    }
}