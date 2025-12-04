package com.docencia.rest.mappers;

import org.mapstruct.Mapper;


import com.docencia.rest.domain.DetalleProducto;
import com.docencia.rest.model.DetalleProductoDocument;

@Mapper(componentModel = "spring")
public interface DetalleProductoMapper {

    
    DetalleProductoDocument toDocument(DetalleProducto source);

    // Mongo -> Dominio
    DetalleProducto toDocument(DetalleProductoDocument source);
}