package co.com.sofka.BienesRaices.empleado.event;

import co.com.sofka.BienesRaices.empleado.value.IdEmpleado;
import co.com.sofka.BienesRaices.empleado.value.IdVendedor;
import co.com.sofka.BienesRaices.generic.Telefono;
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
