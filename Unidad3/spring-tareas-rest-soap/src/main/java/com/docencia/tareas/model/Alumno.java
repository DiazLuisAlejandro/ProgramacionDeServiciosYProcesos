package com.docencia.tareas.model;

import java.util.Objects;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "alumno")
@XmlAccessorType(XmlAccessType.FIELD)
public class Alumno {
    private long identificador;
    private String nombre;

    

    public Alumno() {
    }

    public Alumno(long identificador) {
        this.identificador = identificador;
    }

    public Alumno(long identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
    }

    public long getIdentificador() {
        return identificador;
    }

    public void setIdentificador(long identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificador);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Alumno other = (Alumno) obj;
        return identificador == other.identificador;
    }

    @Override
    public String toString() {
        return "Alumno [identificador=" + identificador + ", nombre=" + nombre + "]";
    }

}
