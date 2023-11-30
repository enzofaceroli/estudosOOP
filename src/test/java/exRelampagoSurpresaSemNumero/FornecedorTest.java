package exRelampagoSurpresaSemNumero;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FornecedorTest {
    Fornecedor fornecedor;
    @BeforeEach
    void setUp() {
        fornecedor = new Fornecedor("Marco", "123");
    }

    @Test
    void deveRetornarNomeMarco() {
        assertEquals("Marco", fornecedor.getNome());
    }

    @Test
    void deveRetornarCnpj123() {
        assertEquals("123", fornecedor.getCnpj());
    }
}