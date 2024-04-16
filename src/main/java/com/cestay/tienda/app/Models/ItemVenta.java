package com.cestay.tienda.app.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "item_venta")
public class ItemVenta {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "id_producto")
    private Long id_producto;

    @Column(name = "cantidad")
    private int cantidad;

    @Column(name = "total")
    private int total;

    public void setIdProducto(Long idproducto) {
        this.id_producto = idproducto;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Long getIdProducto() {
        return id_producto; 
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getTotal() {
        return total;
    }

    public Long getId() {
        return id;
    }

}