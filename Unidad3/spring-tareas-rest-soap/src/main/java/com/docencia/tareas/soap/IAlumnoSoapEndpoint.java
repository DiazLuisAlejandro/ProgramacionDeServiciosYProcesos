package com.docencia.tareas.soap;

import java.util.List;

import com.docencia.tareas.model.Alumno;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService(
    targetNamespace="http://alumno.ies.puerto.es/",
    name="AlumnoPorType"
)
public interface IAlumnoSoapEndpoint {

    @WebMethod(operationName = "listarAll")
    List<Alumno> listar();
    
}
