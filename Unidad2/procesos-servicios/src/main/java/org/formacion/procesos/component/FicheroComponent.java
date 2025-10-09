package org.formacion.procesos.component;

import org.formacion.procesos.component.interfaces.IFicheroComponent;
import org.formacion.procesos.repository.interfaces.IAlamcenamientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FicheroComponent implements IFicheroComponent{

    @Autowired
    @Qualifier("baseDatosRepository")
    IAlamcenamientoRepository dataBaseRepository;

    @Autowired
    @Qualifier("ficheroRepository")
    IAlamcenamientoRepository repositoryFile;

    @Override
    public String mensaje() {
        return repositoryFile.saludar()+"\n"+dataBaseRepository.saludar();
    }
    
}
