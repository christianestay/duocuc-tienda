package com.cestay.tienda.app.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cestay.tienda.app.Models.Venta;
import com.cestay.tienda.app.Repository.VentaRepository;
import com.cestay.tienda.app.Service.VentaService;

import java.util.List;
import java.util.Optional;

public class VentaServiceImpl implements VentaService {

    @Autowired
    private VentaRepository ventaRepository;

    @Override
    public Venta addVenta(Venta venta) {
        return ventaRepository.save(venta);
    }

    @Override
    public List<Venta> getVentas() {
        return ventaRepository.findAll();
    }

    @Override
    public Optional<Venta> getVenta(Long id) {
        return ventaRepository.findById(id);
    }

    @Override
    public void deleteVenta(Long id) {
        ventaRepository.deleteById(id);
    }

    @Override
    public Venta updateVenta(Venta venta) {
        return ventaRepository.save(venta);
    }

}
