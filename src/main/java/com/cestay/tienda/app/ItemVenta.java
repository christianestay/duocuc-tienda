package com.cestay.tienda.app;

public class ItemVenta {

    private Producto producto;
    private int cantidad;
    private double total;

    public ItemVenta(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getTotal() {
        return total;
    }

    public void calcularTotal() {
        total = producto.getPrecio() * cantidad;
    }

}