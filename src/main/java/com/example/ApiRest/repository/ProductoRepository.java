package com.example.ApiRest.repository;

import com.example.ApiRest.entidad.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}
