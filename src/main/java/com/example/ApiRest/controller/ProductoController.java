package com.example.ApiRest.controller;

import com.example.ApiRest.entidad.Producto;
import com.example.ApiRest.service.ProductoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    private final ProductoService service;

    public ProductoController(ProductoService service) {
        this.service = service;
    }

    @PostMapping
    public Producto save(@RequestBody Producto producto) {
        return service.save(producto);
    }

    @GetMapping
    public List<Producto> findAll() {
        return  service.findAll();
    }

    @GetMapping("/{id}")
    public Producto findById(@PathVariable Integer id) {
        return  service.findById(id);
    }

    @PutMapping
    public Producto update(@RequestBody Producto producto) {
        return service.update(producto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Integer id) {
        service.delteById(id);
        return  ResponseEntity.noContent().build();
    }
}
