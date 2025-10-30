package org.formacion.procesosservicios.services;


import org.formacion.procesos.services.ComandoServiceLSOF;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ComandoServiceLSOFTest {

    ComandoServiceLSOF comandoServiceLSOF;

    @BeforeEach
    void BeforeEach() {
        comandoServiceLSOF = new ComandoServiceLSOF();
        comandoServiceLSOF.setComando("lsof");
    }
 
    @Test
    void validarTest1() {
        String[] comando = { "lsof", " " };

        boolean valida = comandoServiceLSOF.validar(comando);
        Assertions.assertTrue(valida);
    }

    @Test
    void validarTest2() {
        String[] comando = { "lsof", "-i" };

        boolean valida = comandoServiceLSOF.validar(comando);
        Assertions.assertTrue(valida);
    }

    @Test
    void validarTest3() {
        String[] comando = { "lsof", "-j" };

        boolean valida = comandoServiceLSOF.validar(comando);
        Assertions.assertFalse(valida);
    }

    @Test
    void validarTest4() {
        String[] comando = { "lsof", "-a" };

        boolean valida = comandoServiceLSOF.validar(comando);
        Assertions.assertTrue(valida);
    }

    @Test
    void validarTest5() {
        String[] comando = { "lsof", "-l" };

        boolean valida = comandoServiceLSOF.validar(comando);
        Assertions.assertTrue(valida);
    }

}
