package co.com.sofka.BienesRaices.inventario.event;

import co.com.sofka.BienesRaices.generic.Ubicacion;
import co.com.sofka.BienesRaices.inventario.value.Diseno;
import co.com.sofka.BienesRaices.inventario.value.IdInmuebleSobrePlanos;
import co.com.sofka.BienesRaices.inventario.value.Precio;
import co.com.sofka.BienesRaices.inventario.value.Tamano;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generic.Identity;

public class InmuebleSobrePlanosAgregado extends DomainEvent {


    private final IdInmuebleSobrePlanos entityId;
    private final Ubicacion ubicacion;
    private final Tamano tamano;
    private final Diseno diseno;
    private final Precio precio;

    public InmuebleSobrePlanosAgregado(IdInmuebleSobrePlanos entityId, Ubicacion ubicacion, Tamano tamano, Diseno diseno, Precio precio) {
        super("sofka.inventario.inmueblesobreplanosagregado");

        this.entityId = entityId;
        this.ubicacion = ubicacion;
        this.tamano = tamano;
        this.diseno = diseno;
        this.precio = precio;
    }

    public IdInmuebleSobrePlanos getEntityId() {
        return entityId;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public Tamano getTamano() {
        return tamano;
    }

    public Diseno getDiseno() {
        return diseno;
    }

    public Precio getPrecio() {
        return precio;
    }
}
