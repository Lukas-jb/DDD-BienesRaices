package domain.empleado.event;

import domain.empleado.value.IdVendedor;
import domain.generic.Telefono;
import co.com.sofka.domain.generic.DomainEvent;

public class TelefonoVendedorActualizado extends DomainEvent {
    private final IdVendedor entityId;
    private final Telefono telefono;

    public TelefonoVendedorActualizado(IdVendedor entityId, Telefono telefono) {
        super("sofka.Empleado.TelefonoVendedorActualizado");
        this.entityId = entityId;
        this.telefono = telefono;
    }

    public IdVendedor getEntityId() {
        return entityId;
    }

    public Telefono getTelefono() {
        return telefono;
    }
}
