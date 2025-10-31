package org.formacion.procesos.controllers;

import java.util.Scanner;

import org.formacion.procesos.services.ComandoServiceLSOF;
import org.formacion.procesos.services.ComandoServicePS;
import org.formacion.procesos.services.ComandoServiceTop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RunnerController {

    @Autowired
    ComandoServicePS comandoControllerPs;
    @Autowired
    ComandoServiceLSOF comandoControllerLsof;
    @Autowired
    ComandoServiceTop comandoControllerTop;


    public void menuConsola() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Lanzador de Procesos (CLI) Linux ===\n"+
            "   Comandos:\n"+
            "       lsof -i\n"+
            "       top\n"+
            "       ps aux | head\n");
          String linea = scanner.nextLine();

        if (linea.toUpperCase().startsWith("PS")) {
            comandoControllerPs.procesarLinea(linea);            
        }else if(linea.toUpperCase().startsWith("LSOF")){
            comandoControllerLsof.procesarLinea(linea);
        }else if (linea.toUpperCase().startsWith("TOP")) {
            comandoControllerTop.procesarLinea(linea);
        }
    }

    private void helpConsola() {
        System.out.println(
                "Ejemplos\n" +
                        "run PING host=8.8.8.8 count=4\n" +
                        "run LIST_DIR path=.\n" +
                        "run HASH_SHA256 file=README.md timeoutMs=5000\n");
    }

}
