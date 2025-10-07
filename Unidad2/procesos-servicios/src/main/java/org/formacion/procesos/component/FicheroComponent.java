package org.formacion.procesos.component;

import org.formacion.procesos.repository.IFicheroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FicheroComponent implements IFicheroComponent{

    @Autowired
    @Qualifier("baseDatosRepository")
    IFicheroRepository dataBaseRepository;

    @Autowired
    @Qualifier("ficheroRepository")
    IFicheroRepository repositoryFile;

    @Override
    public String mensaje() {
        return repositoryFile.saludar()+"\n"+dataBaseRepository.saludar();
    }
    
}
