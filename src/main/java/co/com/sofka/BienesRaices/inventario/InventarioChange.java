package co.com.sofka.BienesRaices.inventario;

import co.com.sofka.BienesRaices.empleado.event.NombreVendedorActualizado;
import co.com.sofka.BienesRaices.inventario.event.*;
import co.com.sofka.domain.generic.EventChange;

public class InventarioChange extends EventChange {

    public InventarioChange(Inventario inventario) {

        apply((InventarioCreado event) -> {
            inventario.zona = inventario.getZona();
        });
        apply((InmuebleContadoAgregado event) -> {
            inventario.inmueblesContado.add(new InmuebleContado(
                    event.getEntityId(),
                    event.getUbicacion(),
                    event.getTamano(),
                    event.getPrecio()
            ));
        });
        apply((InmuebleCreditoAgregado event) -> {
            inventario.inmueblesCredito.add(new InmuebleCredito(
                    event.getEntityId(),
                    event.getUbicacion(),
                    event.getTamano(),
                    event.getPrecio(),
                    event.getCuotaInicial(),
                    event.getNumeroCuotas()
            ));
        });
        apply((InmuebleSobrePlanosAgregado event) -> {
            inventario.inmueblesSobrePlanos.add(new InmuebleSobrePlanos(
                    event.getEntityId(),
                    event.getUbicacion(),
                    event.getTamano(),
                    event.getDiseno(),
                    event.getPrecio()
            ));
        });
        apply((NumeroCuotasInmuebleCreditoActualizado event) -> {
            var inmubleCredito = inventario.getInmueblesCreditoID(event.getEntityId())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra Inmueble"));
            inmubleCredito.ActualizarNumeroCuotas(event.getNumeroCuotas());
        });

        apply((PrecioInmuebleContadoActualizado event)->{
            var precioInmuebleContado = inventario.getInmueblesContadoID(event.getEntityId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encuentra Inmueble"));
            precioInmuebleContado.ActualizarPrecio(event.getPrecio());
        });

        apply((PrecionInmuebleSobrePlanosActualizado event)->{
            var precioInmuebleSobrePlanos = inventario.getInmuebleSobrePlanosID(event.getEntityId())
                    .orElseThrow(()-> new IllegalArgumentException("No se encuentra Inmueble"));
            precioInmuebleSobrePlanos.ActualizarPrecio(event.getPrecio());


        });

    }
}
