package co.com.sofka.BienesRaices.comercial;

import co.com.sofka.BienesRaices.comercial.event.*;

import co.com.sofka.domain.generic.EventChange;

public class ComercialChange extends EventChange {
    public ComercialChange(Comercial comercial) {

        apply((ComercialCreado event) -> {
            comercial.ubicacion = event.getUbicacion();
            comercial.telefono = event.getTelefono();
        });

        apply((ClienteAgregado event) -> {
            comercial.cliente.nombre = event.getNombre();
            comercial.cliente.telefono = event.getTelefono();
        });
        apply((SalaVentasCreada event) -> {
            comercial.salaVentas.ubicacion = event.getUbicacion();
        });
        apply((NombreClienteActualizado event) -> {
            comercial.cliente.nombre = event.getNombre();
        });
        apply((TelefonoClienteActualizado event)->{
            comercial.cliente.telefono = event.getTelefono();
        });
        apply((UbicacionSalaventasActualizada event) ->{
            comercial.salaVentas.ubicacion = event.getUbicacion();
        });
        apply((ValorTotalActualizado event )->{
            comercial.venta.valorTotal = event.getValorTotal();
        });

    }
}
