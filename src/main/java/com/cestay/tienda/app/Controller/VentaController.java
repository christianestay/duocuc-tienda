package com.cestay.tienda.app.Controller;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cestay.tienda.app.Models.Producto;
import com.cestay.tienda.app.Models.Venta;
import com.cestay.tienda.app.Service.VentaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
@RequestMapping("/venta")
public class VentaController {

    private VentaService ventas;

    @GetMapping("/venta")
    public List<Venta> getVentas() {
        return ventas.getVentas();
    }

    @GetMapping("/venta/{id}")
    public Optional<Venta> getVenta(@PathVariable Long id) {
        return ventas.getVenta(id);
    }

    @PostMapping("/venta")
    public Venta postMethodName(@RequestBody Venta entity) {
        return ventas.addVenta(entity);
    }

    @PutMapping("/venta")
    public Venta putVenta(@RequestBody Venta entity) {
        return ventas.updateVenta(entity);    
    }

    @DeleteMapping("/venta/{id}")
    public void deleteVenta(@PathVariable Long id) {
        ventas.deleteVenta(id);
    }
    
    
}
