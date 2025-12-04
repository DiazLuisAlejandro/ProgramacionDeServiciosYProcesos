package com.docencia.rest.domain;

import java.math.BigDecimal;
import java.util.Objects;

public class Producto {

    private int id;

    private String nombre;

    private BigDecimal precio;

    private int Stock;

    private DetalleProducto detalleProducto;

    public Producto() {
    }

    public Producto(int id,String nombre, BigDecimal precio, int stock, DetalleProducto detalleProducto) {
        this.id=id;
        this.nombre = nombre;
        this.precio = precio;
        this.Stock = stock;
        this.detalleProducto=detalleProducto;
    }

    public Producto(int id) {
        this.id = id;
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

    public DetalleProducto getDetalleProducto() {
        return detalleProducto;
    }

    public void setDetalleProducto(DetalleProducto detalleProducto) {
        this.detalleProducto = detalleProducto;
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
        Producto other = (Producto) obj;
        return Objects.equals(id, other.id);
    }

}
