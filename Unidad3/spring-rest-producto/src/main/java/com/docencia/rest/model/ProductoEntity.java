package com.docencia.rest.model;

import java.math.BigDecimal;
import java.util.Objects;

import jakarta.persistence.*;

@Entity
@Table(name = "productos")
public class ProductoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "precio")
    private BigDecimal precio;

    @Column(name = "stock")
    private int Stock;

    public ProductoEntity() {
    }

    public ProductoEntity(String nombre, BigDecimal precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        Stock = stock;
    }

    public ProductoEntity(int id) {
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        Stock = stock;
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
        ProductoEntity other = (ProductoEntity) obj;
        return Objects.equals(id, other.id);
    }

}
