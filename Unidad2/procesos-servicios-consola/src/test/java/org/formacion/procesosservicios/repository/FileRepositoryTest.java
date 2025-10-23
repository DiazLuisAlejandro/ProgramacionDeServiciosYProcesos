package org.formacion.procesosservicios.repository;

import org.formacion.procesos.repositories.FileRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FileRepositoryTest {

    FileRepository fileRepository;

    @BeforeEach
    void beforeEach(){
        fileRepository=new FileRepository();
        fileRepository.setFileName("fichero-test.txt");
    }

    @Test
    void addContenidoTest(){
        boolean result= fileRepository.add("text");
        Assertions.assertTrue(result, "No se ha obtenido el resultado esperado");
    }

}
