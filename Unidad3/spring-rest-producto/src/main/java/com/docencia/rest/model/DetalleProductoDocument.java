package com.docencia.rest.model;

import java.util.List;
import java.util.Map;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document(collection = "producto_detalle")
public class DetalleProductoDocument {
    @Id
    private String id;
    private int productoId;
    private String descripcionLarga;
    private Map<String, String> especificacionesTecnicas;
    private List<String> tags;

    public DetalleProductoDocument() {
    }

    public DetalleProductoDocument(String id) {
        this.id = id;
    }

    public DetalleProductoDocument(String id, int productoId, String descripcionLarga,
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



}