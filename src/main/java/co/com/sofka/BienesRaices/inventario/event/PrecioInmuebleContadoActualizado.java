package co.com.sofka.BienesRaices.inventario.event;

import co.com.sofka.BienesRaices.inventario.value.IdInmuebleContado;
import co.com.sofka.BienesRaices.inventario.value.Precio;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generic.Identity;

public class PrecioInmuebleContadoActualizado extends DomainEvent {

    private final IdInmuebleContado entityId;
    private final Precio precio;

    public PrecioInmuebleContadoActualizado(IdInmuebleContado entityId, Precio precio) {

        super("sofka.Inventario.PrecionInmuebleContadoActualizado");
        this.entityId = entityId;
        this.precio = precio;
    }

    public IdInmuebleContado getEntityId() {
        return entityId;
    }

    public Precio getPrecio() {
        return precio;
    }
}
