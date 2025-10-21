package org.formacion.procesosservicios.services;

import org.formacion.procesos.services.ComandoServiceLS;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ComandoServiceLSTest {

    ComandoServiceLS comandoServiceLS;

    @BeforeEach
    void BeforeEach() {
        comandoServiceLS = new ComandoServiceLS();
        comandoServiceLS.setComando("ls");
    }

    @Test
    void validarTest1() {
        String[] comando = { "ls", " " };

        boolean valida = comandoServiceLS.validar(comando);
        Assertions.assertTrue(valida);
    }

    @Test
    void validarTest2() {
        String[] comando = { "ls", "-la" };

        boolean valida = comandoServiceLS.validar(comando);
        Assertions.assertTrue(valida);
    }

    @Test
    void validarTest3() {
        String[] comando = { "ls", "-j" };

        boolean valida = comandoServiceLS.validar(comando);
        Assertions.assertFalse(valida);
    }

    @Test
    void validarTest4() {
        String[] comando = { "ls", "-a" };

        boolean valida = comandoServiceLS.validar(comando);
        Assertions.assertTrue(valida);
    }

    @Test
    void validarTest5() {
        String[] comando = { "ls", "-l" };

        boolean valida = comandoServiceLS.validar(comando);
        Assertions.assertTrue(valida);
    }

}
