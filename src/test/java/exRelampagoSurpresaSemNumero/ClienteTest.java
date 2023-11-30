package exRelampagoSurpresaSemNumero;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    Cliente cliente;
    @BeforeEach
    void setUp() {
        cliente = new Cliente("Enzo","123");
    }

    @Test
    void deveRetornarNomeEnzo(){
        assertEquals("Enzo", cliente.getNome());
    }

    @Test
    void deveRetornarCpf123(){
        assertEquals("123", cliente.getCpf());
    }
}