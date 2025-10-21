package org.formacion.procesosservicios.services;

import org.formacion.procesos.services.ComandoServicePS;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ComandoServicePSTest {

    ComandoServicePS comandoServicePS;

    @BeforeEach
    void BeforeEach(){
        comandoServicePS = new ComandoServicePS();
        comandoServicePS.setComando("ps");
    }

    @Test
    void validarTest1(){
        String[]comando={"ps"," "};
       
        boolean valida=comandoServicePS.validar(comando);
        Assertions.assertTrue(valida);
    }

    @Test
    void validarTest2(){
        String[]comando={"ps","xa"};
       
        boolean valida=comandoServicePS.validar(comando);
        Assertions.assertTrue(valida);
    }



       @Test
    void validarTest3(){
        String[]comando={"ps","-x"};
       
        boolean valida=comandoServicePS.validar(comando);
        Assertions.assertTrue(valida);
    }

    @Test
    void validarTest4(){
        String[]comando={"ps","-a"};
       
        boolean valida=comandoServicePS.validar(comando);
        Assertions.assertTrue(valida);
    }

    @Test
    void validarTest5(){
        String[]comando={"ps","-aux"};
       
        boolean valida=comandoServicePS.validar(comando);
        Assertions.assertTrue(valida);
    }

    @Test
    void validarTest6(){
        String[]comando={"ps","-j"};
       
        boolean valida=comandoServicePS.validar(comando);
        Assertions.assertFalse(valida);
    }


}
