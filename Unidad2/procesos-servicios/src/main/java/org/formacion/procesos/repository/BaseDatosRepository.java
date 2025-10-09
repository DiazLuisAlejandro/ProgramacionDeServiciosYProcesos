package org.formacion.procesos.repository;

import org.formacion.procesos.repository.interfaces.IAlamcenamientoRepository;
import org.springframework.stereotype.Repository;

@Repository("baseDatosRepository")
public class BaseDatosRepository implements IAlamcenamientoRepository{

    @Override
    public String saludar() {
        return "Te estoy saludando desde el repositorio de la base de datos";
    }

    
}
