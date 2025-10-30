package org.formacion.procesos.repositories;

import org.formacion.procesos.repositories.interfaces.CRUDInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

@Repository
public class FileRepository implements CRUDInterface{

    private static Logger logger = LoggerFactory.getLogger(FileRepository.class);
    String fileName;
    Path path;

    public void setFileName(String text){
        this.fileName=text;
    }

    public FileRepository(){
        if(fileName==null){
            fileName="mis_procesos.txt";
        }
        //URL resource=getClass().getClassLoader().getResource(fileName);
        path=Paths.get("src/main/resources/mis_procesos.txt");
    }

    @Override
    public boolean add(String text) {
        try {
            Files.write(path, text.getBytes(), StandardOpenOption.APPEND);
            return true;
        } catch (Exception e) {
            logger.error("Se ha producido un error almacenando el fichero", e);
        }
        return false;
    }

}
