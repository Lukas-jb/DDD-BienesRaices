package co.com.sofka.BienesRaices.inventario.event;

import co.com.sofka.BienesRaices.inventario.value.Precio;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generic.Identity;

public class PrecionInmuebleSobrePlanosActualizado extends DomainEvent {
    private final Identity entityId;
    private final Precio precio;

    public PrecionInmuebleSobrePlanosActualizado(Identity entityId, Precio precio) {
        super("sofka.Inventario.PrecionInmuebleSobrePlanosActualizado");
        this.entityId = entityId;
        this.precio = precio;
    }

    public Identity getEntityId() {
        return entityId;
    }

    public Precio getPrecio() {
        return precio;
    }
}
