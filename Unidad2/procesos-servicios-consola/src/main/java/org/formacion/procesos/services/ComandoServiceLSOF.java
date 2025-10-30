package org.formacion.procesos.services;

import org.formacion.procesos.domain.ProcessType;
import org.formacion.procesos.services.abstractas.ComandoServiceAbstract;
import org.springframework.stereotype.Component;

@Component
public class ComandoServiceLSOF extends ComandoServiceAbstract {

    public void ComandoServiceLSOf() {
        this.setTipo(ProcessType.LSOF);
        this.setRegExp("^-i$");
        
    }


}
