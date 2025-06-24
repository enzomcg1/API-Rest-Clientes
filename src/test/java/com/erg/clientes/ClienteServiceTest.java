package com.erg.clientes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JUnitSanityTest {

    @Test
    void testSumaBasica() {
        int resultado = 2 + 2;
        assertEquals(4, resultado);
    }
}
