package org.formacion.procesos.services;

import org.formacion.procesos.domain.ProcessType;
import org.formacion.procesos.services.abstractas.ComandoServiceAbstract;
import org.springframework.stereotype.Component;

@Component
public class ComandoServicePS extends ComandoServiceAbstract {

    public ComandoServicePS() {
        this.setTipo(ProcessType.PS);

    }

    @Override
    public void imprimirMensaje() {
        System.out.println("Estoy llamandoa a ComandoControllerPS");
    }

    @Override
    public boolean validar(String[] arrayComando) {
         if (!super.validarComando()) {
            return false;

        }
        return true;
    }

}
