package exRS934;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartamentoTest {
    Pais pais;
    Grupo grupo;
    Empresa empresa;
    Departamento departamento;

    @BeforeEach
    void setUp() {
        pais = new Pais("BR");
        grupo = new Grupo(pais);
        empresa = new Empresa(grupo);
        departamento = new Departamento(empresa);
    }

    @Test
    void deveRetornarNomeDiretorEmpresaValidaMarco() {
        Funcionario funcionario = new Funcionario("Marco");
        departamento.getEmpresa().setDiretor(funcionario);
        assertEquals("Marco", departamento.getEmpresa().getDiretor().getNome());
    }

    @Test
    void deveRetornarEmpresaInvalida() {
        try {
            departamento.setEmpresa(null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Empresa invalida", e.getMessage());
        }
    }

    @Test
    void deveRetornarDepartamentoSemChefia() {
        departamento.setChefia(null);
        assertEquals("Depto sem chefia", departamento.getEscolaridadeChefia());
    }

    @Test
    void deveRetornarEscolaridadeChefiaDoutor() {
        Funcionario funcionario = new Funcionario("Marco");
        Escolaridade escolaridade = new Escolaridade("Doutor");
        funcionario.setEscolaridade(escolaridade);
        departamento.setChefia(funcionario);
        assertEquals("Doutor", departamento.getEscolaridadeChefia());
    }

}