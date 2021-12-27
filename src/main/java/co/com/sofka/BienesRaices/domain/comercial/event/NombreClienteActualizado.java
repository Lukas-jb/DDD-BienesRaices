package co.com.sofka.BienesRaices.domain.comercial.event;

import co.com.sofka.BienesRaices.domain.comercial.value.IdCliente;
import co.com.sofka.BienesRaices.domain.generic.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreClienteActualizado extends DomainEvent {
    private final IdCliente entityId;
    private final Nombre nombre;

    public NombreClienteActualizado(IdCliente entityId, Nombre nombre) {
        super("sofka.Comercial.NombreClienteActualizado");
        this.entityId = entityId;
        this.nombre = nombre;
    }

    public IdCliente getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
