package com.example.ApiRest.entidad;

import jakarta.persistence.*;

import java.math.BigDecimal;


@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private int idProducto;

    @Column(name = "nomb_producto")
    private String nombProducto;

    @Column(name = "prec_producto")
    private BigDecimal precProducto;

    @Column(name = "stock")
    private int stock;

    public Producto() {
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombProducto() {
        return nombProducto;
    }

    public void setNombProducto(String nombProducto) {
        this.nombProducto = nombProducto;
    }

    public BigDecimal getPrecProducto() {
        return precProducto;
    }

    public void setPrecProducto(BigDecimal precProducto) {
        this.precProducto = precProducto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
