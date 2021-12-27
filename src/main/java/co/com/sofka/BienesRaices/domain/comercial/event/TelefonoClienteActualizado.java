package co.com.sofka.BienesRaices.domain.comercial.event;

import co.com.sofka.BienesRaices.domain.comercial.value.IdCliente;
import co.com.sofka.BienesRaices.domain.generic.Telefono;
import co.com.sofka.domain.generic.DomainEvent;

public class TelefonoClienteActualizado extends DomainEvent {
    private final IdCliente entityId;
    private final Telefono telefono;

    public TelefonoClienteActualizado(IdCliente entityId, Telefono telefono) {
        super("sofka.Comercial.TelefonoClienteActualizado");
        this.entityId = entityId;
        this.telefono = telefono;
    }

    public IdCliente getEntityId() {
        return entityId;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
