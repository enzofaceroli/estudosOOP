package exRelampagoSurpresaSemNumero;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {
    Produto produto;
    @BeforeEach
    void setUp() {
        produto = new Produto("Nome", 10, 1, 0, 100);
    }

    @Test
    void deveRetornarQtdInvalida() {
        try {
            produto.setQtdEstoque(-1);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Quantidade invalida", e.getMessage());
        }
    }

    @Test
    void deveRetornarQtd0() {
        produto.setQtdEstoque(0);
        assertEquals(0, produto.getQtdEstoque());
    }

    @Test
    void deveRetornarPrecoUnitInvalido() {
        try {
            produto.setPrecoUnit(-1.0f);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Preco invalido", e.getMessage());
        }
    }

    @Test
    void deveRetornarPreco0() {
        produto.setPrecoUnit(0.0f);
        assertEquals(0.0f, produto.getPrecoUnit());
    }

    @Test
    void deveRetornarEstoqueMinimoInvalido() {
        try {
            produto.setEstoqueMinimo(-1);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Estoque min invalido", e.getMessage());
        }
    }

    @Test
    void deveRetornarEstoqueMinimoInvalidoMaiorMaximo() {
        try {
            produto.setEstoqueMinimo(101);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Estoque min invalido", e.getMessage());
        }
    }

    @Test
    void deveRetornarEstoqueMinimo0() {
        produto.setEstoqueMinimo(0);
        assertEquals(0, produto.getEstoqueMinimo());
    }

    @Test
    void deveRetornarEstoqueMaximoInvalido() {
        try {
            produto.setEstoqueMaximo(-1);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Estoque max invalido", e.getMessage());
        }
    }

    @Test
    void deveRetornarEstoqueMaximoInvalidoMaiorMaximo() {
        try {
            produto.setEstoqueMinimo(1);
            produto.setEstoqueMaximo(0);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Estoque max invalido", e.getMessage());
        }
    }

    @Test
    void deveRetornarEstoqueMaximo0() {
        produto.setEstoqueMaximo(0);
        assertEquals(0, produto.getEstoqueMaximo());
    }

    @Test
    void deveRetornarQuantidadeDebitadaInvalidaNegativa() {
        try {
            produto.debitarEstoque(-1);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Quantidade debitada invalida", e.getMessage());
        }
    }

    @Test
    void deveRetornarQuantidadeDebitadaInvalidaMenorMinimo() {
        try {
            produto.debitarEstoque(11);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Quantidade debitada invalida", e.getMessage());
        }
    }

    @Test
    void deveRetornar10QuantidadeDebitada() {
        produto.debitarEstoque(0);
        assertEquals(10, produto.getQtdEstoque());
    }

    @Test
    void deveRetornarQuantidadeCreditadaInvalidaNegativa() {
        try {
            produto.creditarEstoque(-1);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Quantidade creditada invalida", e.getMessage());
        }
    }

    @Test
    void deveRetornarQuantidadeCreditadaInvalidaMaiorMaximo() {
        try {
            produto.creditarEstoque(91);
            fail();
        }
        catch (IllegalArgumentException e) {
            assertEquals("Quantidade creditada invalida", e.getMessage());
        }
    }

    @Test
    void deveRetornar10QuantidadeCreditada() {
        produto.creditarEstoque(0);
        assertEquals(10, produto.getQtdEstoque());
    }


}