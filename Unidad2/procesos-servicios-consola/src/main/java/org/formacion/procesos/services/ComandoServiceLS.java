package org.formacion.procesos.services;

import org.formacion.procesos.domain.ProcessType;
import org.formacion.procesos.services.abstractas.ComandoServiceAbstract;
import org.springframework.stereotype.Component;

@Component
public class ComandoServiceLS extends ComandoServiceAbstract {

    public ComandoServiceLS(){
        this.setTipo(ProcessType.LS);
        
    }

    @Override
    public void imprimirMensaje() {
        System.out.println("Estoy llamandoa a ComandoControllerLS");
    }

    @Override
    public boolean validar(String[] arrayComando) {

        if (!super.validarComando()) {
            return false;

        }
        String parametro=arrayComando[1];
        return true;
    }

   

}
