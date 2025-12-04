package com.docencia.rest.service.interfaces;

import java.util.List;
import java.util.Optional;

import com.docencia.rest.domain.Producto;

public interface ProductoServiceInterface {
    public List<Producto> findAll();

    public Optional<Producto> find(Producto producto);

    public Optional<Producto> findById(int productoId);

    public boolean deleteById(int id);

    public boolean deleteProducto(Producto producto);

    public Producto save(Producto producto);
}
