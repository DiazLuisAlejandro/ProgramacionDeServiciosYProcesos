package org.formacion.procesos.services;


import org.formacion.procesos.domain.ProcessType;
import org.formacion.procesos.services.abstractas.ComandoServiceAbstract;
import org.springframework.stereotype.Component;

@Component
public class ComandoServiceTop extends ComandoServiceAbstract {

    public ComandoServiceTop() {
        this.setTipo(ProcessType.TOP);
        this.setRegExp("");

    }

}
