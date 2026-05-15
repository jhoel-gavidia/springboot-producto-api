package com.example.ApiRest.controller;

import com.example.ApiRest.entidad.Producto;
import com.example.ApiRest.service.ProductoService;
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
}
