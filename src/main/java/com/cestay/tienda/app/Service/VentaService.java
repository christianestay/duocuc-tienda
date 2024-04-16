package com.cestay.tienda.app.Service;

import java.util.List;
import java.util.Optional;
import com.cestay.tienda.app.Models.Venta;
import org.springframework.stereotype.Service;


public interface VentaService {

    public Venta addVenta(Venta venta);
    public List<Venta> getVentas();
    public Optional<Venta> getVenta(Long id);
    public void deleteVenta(Long id);
    public Venta updateVenta(Venta venta);

}
