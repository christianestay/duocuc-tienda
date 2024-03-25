package com.cestay.tienda.app;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VentaController {

    private List<Venta> ventas;

    public VentaController() {
        this.ventas = new ArrayList<>();

        Producto producto1 = new Producto(1L, "Producto 1", 1000);
        Producto producto2 = new Producto(2L, "Producto 2", 2000);
        Producto producto3 = new Producto(3L, "Producto 3", 3000);

        Venta venta1 = new Venta("11111111-1", new GregorianCalendar(2024, 3, 1).getTime());
        venta1.agregarItem(producto1, 2);
        venta1.agregarItem(producto2, 1);
        venta1.agregarItem(producto3, 3);
        ventas.add(venta1);

        Venta venta2 = new Venta("22222222-2", new GregorianCalendar(2024, 3, 2).getTime());
        venta2.agregarItem(producto1, 1);
        venta2.agregarItem(producto2, 2);
        venta2.agregarItem(producto3, 1);
        ventas.add(venta2);

        Venta venta3 = new Venta("33333333-3", new GregorianCalendar(2024, 2, 3).getTime());
        venta3.agregarItem(producto1, 3);
        venta3.agregarItem(producto2, 1);
        venta3.agregarItem(producto3, 2);
        ventas.add(venta3);

        Venta venta4 = new Venta("44444444-4", new GregorianCalendar(2024, 2, 4).getTime());
        venta4.agregarItem(producto1, 1);
        venta4.agregarItem(producto2, 2);
        venta4.agregarItem(producto3, 1);
        ventas.add(venta4);

    }

    @GetMapping(value = {"/ventas", "/ventas/{ano}", "/ventas/{ano}/{mes}", "/ventas/{ano}/{mes}/{dia}"})
    public List<Venta> getVentas(@PathVariable Optional<Integer> ano, @PathVariable Optional<Integer> mes, @PathVariable Optional<Integer> dia) {
        List<Venta> ventasFiltradas = new ArrayList<>();
        for (Venta venta : ventas) {
            if (ano.isPresent() && venta.getAno() != ano.get()) {
                continue;
            }
            if (mes.isPresent() && venta.getMes() != mes.get()) {
                continue;
            }
            if (dia.isPresent() && venta.getDia() != dia.get()) {
                continue;
            }
            ventasFiltradas.add(venta);
        }
        return ventasFiltradas;
    }
    
    
}
