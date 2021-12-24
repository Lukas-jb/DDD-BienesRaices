package co.com.sofka.BienesRaices.inventario.event;

import co.com.sofka.BienesRaices.inventario.value.IdInmuebleSobrePlanos;
import co.com.sofka.BienesRaices.inventario.value.Precio;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generic.Identity;

public class PrecionInmuebleSobrePlanosActualizado extends DomainEvent {

    private final IdInmuebleSobrePlanos entityId;
    private final Precio precio;

    public PrecionInmuebleSobrePlanosActualizado(IdInmuebleSobrePlanos entityId, Precio precio) {
        super("sofka.Inventario.PrecionInmuebleSobrePlanosActualizado");
        this.entityId = entityId;
        this.precio = precio;
    }

    public IdInmuebleSobrePlanos getEntityId() {
        return entityId;
    }

    public Precio getPrecio() {
        return precio;
    }
}

