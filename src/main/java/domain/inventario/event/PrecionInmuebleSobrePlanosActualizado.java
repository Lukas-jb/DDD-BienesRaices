package domain.inventario.event;

import domain.inventario.value.IdInmuebleSobrePlanos;
import domain.inventario.value.Precio;
import co.com.sofka.domain.generic.DomainEvent;

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

