package exRS934;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {
    Funcionario funcionario;

    @BeforeEach
    void setUp() {
        funcionario = new Funcionario("Marco");
    }

    @Test
    void deveRetornarNomeMarco() {
        assertEquals("Marco", funcionario.getNome());
    }

    @Test
    void deveRetornarNomeInvalido() {
        try {
            funcionario.setNome(null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome invalido", e.getMessage());
        }
    }
    // testes nome pais alocacao
    @Test
    void deveRetornarNomePaisAlocacaoBR() {
        Pais pais = new Pais("BR");
        Grupo grupo = new Grupo(pais);
        Empresa empresa = new Empresa(grupo);
        Departamento depto = new Departamento(empresa);
        funcionario.setAlocacao(depto);

        assertEquals("BR", funcionario.getNomePaisAlocacao());
    }
    // testes nome estado coordneacao
    @Test
    void deveRetornarNomeEstadoCoordenacaoMG() {
        Pais pais = new Pais("BR");
        Estado estado = new Estado("MG", pais);
        Cidade cidade = new Cidade("JF", estado);
        Grupo grupo = new Grupo(pais);
        Empresa empresa = new Empresa(grupo);
        Filial filial = new Filial(empresa, cidade);
        funcionario.setCoordenacao(filial);
        assertEquals("MG", funcionario.getNomeEstadoCoordenacao());
    }
}