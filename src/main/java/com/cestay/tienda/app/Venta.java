package com.cestay.tienda.app;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venta {

    private Date fecha;
    private String rut;
    private List<ItemVenta> items;

    public Venta(String rut, Date fecha) {
        this.rut = rut;
        this.fecha = fecha;
        this.items = new ArrayList<>();
    }

    public Date getFecha() {
        return fecha;
    }

    public String getRut() {
        return rut;
    }

    public List<ItemVenta> getItems() {
        return items;
    }

    public void agregarItem(Producto producto, int cantidad) {
        ItemVenta item = new ItemVenta(producto, cantidad);
        item.calcularTotal();
        items.add(item);
    }

    public int getAno() {
        return fecha.getYear() + 1900;
    }

    public int getMes() {
        return fecha.getMonth() + 1;
    }

    public int getDia() {
        return fecha.getDate();
    }


}
