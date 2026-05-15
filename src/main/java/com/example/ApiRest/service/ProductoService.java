package com.example.ApiRest.service;

import com.example.ApiRest.entidad.Producto;

import java.util.List;

public interface ProductoService {
    Producto save(Producto producto);
    List<Producto> findAll();
    Producto findById(Integer id);
    Producto update(Producto producto);
    void delteById(Integer id);
}
