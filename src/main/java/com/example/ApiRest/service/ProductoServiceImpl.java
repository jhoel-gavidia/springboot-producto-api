package com.example.ApiRest.service;

import com.example.ApiRest.entidad.Producto;
import com.example.ApiRest.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import javax.management.RuntimeErrorException;
import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService{
    private final ProductoRepository repository;

    public ProductoServiceImpl(ProductoRepository repository) {
        this.repository = repository;
    }

    @Override
    public Producto save(Producto producto) {
        return repository.save(producto);
    }

    @Override
    public List<Producto> findAll() {
        return repository.findAll();
    }

    @Override
    public Producto findById(Integer id) {
        return  repository.findById(id).orElse(null);
    }

    @Override
    public Producto update(Producto producto) {
        Producto prDB = repository.findById(producto.getIdProducto())
                .orElseThrow(()-> new RuntimeException("Producto No Encontrado"));

            prDB.setNombProducto(producto.getNombProducto());
            prDB.setPrecProducto(producto.getPrecProducto());
            prDB.setStock(producto.getStock());

        return repository.save(prDB);
    }

    @Override
    public void delteById(Integer id) {
        if(!repository.existsById(id)) {
            throw new RuntimeException("Producto no encontrado");
        }
        repository.deleteById(id);
    }
}
