package org.formacion.procesos.service;

import org.formacion.procesos.component.interfaces.IFicheroComponent;
import org.formacion.procesos.service.interfaces.IProcesos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Procesos implements IProcesos{

    @Autowired
    IFicheroComponent componentFile;

    public void setComponentFile(IFicheroComponent componentF){
        this.componentFile=componentF;
    }


    public void ejecutar() {
        System.out.println("Ejecutando lógica del proceso...");
        System.out.println(componentFile.mensaje());
    }
    
}