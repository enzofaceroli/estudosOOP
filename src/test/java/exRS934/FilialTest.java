package exRS934;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilialTest {
    Grupo grupo;
    Empresa empresa;
    Filial filial;
    Pais pais;
    Estado estado;
    Cidade cidade;

    @BeforeEach
    void setUp() {
        pais = new Pais("BR");
        estado = new Estado("MG", pais);
        cidade = new Cidade("JF", estado);
        grupo = new Grupo(pais);
        empresa = new Empresa(grupo);
        filial = new Filial(empresa, cidade);
    }

    @Test
    void deveRetornarNomeDiretorEmpresaValida() {
        // Checa se a empresa eh valida, checa funcao getDiretorEmpresa e getNomeDiretorEmpresa
        Funcionario funcionario = new Funcionario("Marco");
        filial.getEmpresa().setDiretor(funcionario);
        assertEquals("Marco", filial.getNomeDiretorEmpresa());
    }

    @Test
    void deveRetornarEmpresaInvalida() {
        try {
            filial.setEmpresa(null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Empresa invalida", e.getMessage());
        }
    }

    @Test
    void deveRetornarNomeCidadeJFValida() {
        assertEquals("JF", filial.getCidade().getNome());
    }

    @Test
    void deveRetornarCidadeInvalida() {
        try {
            filial.setCidade(null);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Cidade invalida", e.getMessage());
        }
    }
}