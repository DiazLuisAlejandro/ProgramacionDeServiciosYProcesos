package com.docencia.rest.domain;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class DetalleProducto {

    private String id;
    private int productoId;
    private String descripcionLarga;
    private Map<String, String> especificacionesTecnicas;
    private List<String> tags;

    public DetalleProducto() {
    }

    public DetalleProducto(String id) {
        this.id = id;
    }

    public DetalleProducto(String id, int productoId, String descripcionLarga,
            Map<String, String> especificacionesTecnicas, List<String> tags) {
        this.id = id;
        this.productoId = productoId;
        this.descripcionLarga = descripcionLarga;
        this.especificacionesTecnicas = especificacionesTecnicas;
        this.tags = tags;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    public String getDescripcionLarga() {
        return descripcionLarga;
    }

    public void setDescripcionLarga(String descripcionLarga) {
        this.descripcionLarga = descripcionLarga;
    }

    public Map<String, String> getEspecificacionesTecnicas() {
        return especificacionesTecnicas;
    }

    public void setEspecificacionesTecnicas(Map<String, String> especificacionesTecnicas) {
        this.especificacionesTecnicas = especificacionesTecnicas;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        DetalleProducto other = (DetalleProducto) obj;
        return Objects.equals(id, other.id);
    }

}